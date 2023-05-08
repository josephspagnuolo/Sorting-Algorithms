package src;
import java.util.ArrayList;
import java.util.Map;

public class BubbleSort implements MapSort<String, Integer> {
	
	public Map<String, Integer> map;

	/**
	 * @description: Sort a map by its values in ascending order with bubble sorting
	 *               algorithm.
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortbyValue() {
		ArrayList<String> keys = new ArrayList<String>(this.map.keySet());
		ArrayList<Integer> values = new ArrayList<Integer>(this.map.values());
		for (int i = 0; i < keys.size() - 1; i++) {
			boolean done = false;
			for (int j = 0; j < keys.size() - i - 1; j++) {
				if (values.get(j) > values.get(j + 1)) {
					int temp1 = values.get(j);
					values.set(j, values.get(j + 1));
					values.set(j + 1, temp1);
					String temp2 = keys.get(j);
					keys.set(j, keys.get(j + 1));
					keys.set(j + 1, temp2);
					done = true;
				}
			}
			if (!done) {
				i = keys.size();
			}
		}
		return keys;
	}

	public void setMap(Map<String, Integer> map_to_be_sorted) throws MapContainsNullValueException {
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