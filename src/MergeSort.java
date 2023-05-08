package src;
import java.util.ArrayList;
import java.util.Map;

public class MergeSort implements MapSort<String, Integer>{

	public Map<String, Integer> map;
	
	/**
	 * @description: Sort a map by its values in ascending order using merge sorting
	 *               algorithm.
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortbyValue() {
		ArrayList<String> keys = new ArrayList<String>(this.map.keySet());
		ArrayList<Integer> values = new ArrayList<Integer>(this.map.values());
		
		
		return keys;
	}
	
	public void setMap(Map<String, Integer> map_to_be_sorted) {
		if (map_to_be_sorted.containsValue(null)) {
			throw new MapContainsNullValueException("The map contains a null value.");
		} else {
			this.map = map_to_be_sorted;
		}
	}

	public Map<String, Integer> getMap() {
		return this.map;
	}
}
