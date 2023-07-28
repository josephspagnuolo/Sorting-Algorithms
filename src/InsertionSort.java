package src;
import java.util.ArrayList;
import java.util.Map;

public class InsertionSort implements MapSort<String, Double>{

	public Map<String, Double> map;
	
	/**
	 * @description: Sort a map by its values in ascending order using insertion sorting
	 *               algorithm.
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortByValue() {
		ArrayList<String> keys = new ArrayList<String>(this.map.keySet());
		ArrayList<Double> values = new ArrayList<Double>(this.map.values());
        for (int i = 1; i < keys.size(); ++i) {
            String key1 = keys.get(i);
            Double key2 = values.get(i);
            int j = i - 1;
            while (j >= 0 && values.get(j) > key2) {
            	keys.set(j+1, keys.get(j));
            	values.set(j+1, values.get(j));
                j = j - 1;
            }
            keys.set(j+1, key1);
        	values.set(j+1, key2);
        }
		return keys;
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
