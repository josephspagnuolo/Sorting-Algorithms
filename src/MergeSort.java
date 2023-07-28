package src;
import java.util.ArrayList;
import java.util.Map;

public class MergeSort implements MapSort<String, Double>{

	public Map<String, Double> map;
	
	/**
	 * @description: Sort a map by its values in ascending order using merge sorting
	 *               algorithm.
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortByValue() {
		ArrayList<String> keys = new ArrayList<String>(this.map.keySet());
		ArrayList<Double> values = new ArrayList<Double>(this.map.values());
		sort(keys, values, 0, values.size() - 1);
		return keys;
	}
	
	public void sort(ArrayList<String> keys, ArrayList<Double> values, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            sort(keys, values, l, mid);
            sort(keys, values, mid + 1, r);
            merge(keys, values, l, mid, r);
        }
    }
	
	public void merge(ArrayList<String> keys, ArrayList<Double> values, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        String L1[] = new String[n1];
        Double L2[] = new Double[n1];
        String R1[] = new String[n2];
        Double R2[] = new Double[n2];
        for (int i = 0; i < n1; ++i) {
        	L1[i] = keys.get(l + i);
        	L2[i] = values.get(l + i);
        } 
        for (int j = 0; j < n2; ++j) {
        	R1[j] = keys.get(mid + 1 + j);
        	R2[j] = values.get(mid + 1 + j);
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L2[i] <= R2[j]) {
            	keys.set(k, L1[i]);
            	values.set(k, L2[i]);
                i++;
            }
            else {
                keys.set(k, R1[j]);
                values.set(k, R2[j]);
                j++;
            }
            k++;
        }
        while (i < n1) {
        	keys.set(k, L1[i]);
        	values.set(k, L2[i]);
            i++;
            k++;
        }
        while (j < n2) {
        	keys.set(k, R1[j]);
        	values.set(k, R2[j]);
            j++;
            k++;
        }
    }
	
	public void setMap(Map<String, Double> mapToBeSorted) {
		if (mapToBeSorted.containsValue(null)) {
			throw new MapContainsNullValueException("The map contains a null value.");
		} else {
			this.map = mapToBeSorted;
		}
	}

	public Map<String, Double> getMap() {
		return this.map;
	}
}
