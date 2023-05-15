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
	public ArrayList<String> sortbyValue() {
		ArrayList<String> keys = new ArrayList<String>(this.map.keySet());
		ArrayList<Double> values = new ArrayList<Double>(this.map.values());
		sort(keys, values, 0, values.size() - 1);
		return keys;
	}
	
	public void sort(ArrayList<String> keys, ArrayList<Double> values, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(keys, values, l, m);
            sort(keys, values, m + 1, r);
 
            // Merge the sorted halves
            merge(keys, values, l, m, r);
        }
    }
	
	public void merge(ArrayList<String> keys, ArrayList<Double> values, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        String L1[] = new String[n1];
        Double L2[] = new Double[n1];
        String R1[] = new String[n2];
        Double R2[] = new Double[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
        	L1[i] = keys.get(l + i);
        	L2[i] = values.get(l + i);
        }
            
        for (int j = 0; j < n2; ++j) {
        	R1[j] = keys.get(m + 1 + j);
        	R2[j] = values.get(m + 1 + j);
        }
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
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
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
        	keys.set(k, L1[i]);
        	values.set(k, L2[i]);
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
        	keys.set(k, R1[j]);
        	values.set(k, R2[j]);
            j++;
            k++;
        }
    }
	
	public void setMap(Map<String, Double> map_to_be_sorted) {
		if (map_to_be_sorted.containsValue(null)) {
			throw new MapContainsNullValueException("The map contains a null value.");
		} else {
			this.map = map_to_be_sorted;
		}
	}

	public Map<String, Double> getMap() {
		return this.map;
	}
}
