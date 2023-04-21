import java.util.ArrayList;
import java.util.Map;

public class HeapSort implements MapSort<String, Double> {
	
	public Map<String, Double> map;

	/**
	 * @description: Sort a map by the values in ascending order max heap sorting
	 *               algorithm.
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortbyValue() {
		
		ArrayList<String> keys = new ArrayList<String>(this.map.keySet());
		ArrayList<Double> values = new ArrayList<Double>(this.map.values());
		for (int i = keys.size() / 2 - 1; i >= 0; i--) {
			heapify(keys, values, keys.size(), i);
		}
		for (int i = 1; i < keys.size(); i++) {
			Double temp1 = values.get(0);
			values.set(0, values.get(keys.size() - i));
			values.set(keys.size() - i, temp1);
			String temp2 = keys.get(0);
			keys.set(0, keys.get(keys.size() - i));
			keys.set(keys.size() - i, temp2);
			heapify(keys, values, keys.size() - i, 0);
		}
		return keys;
	}

	/**
	 * To heapify a subtree rooted with node `i' which is an index in both @keys
	 * and @values. `n' is size of heap.
	 */
	public void heapify(ArrayList<String> keys, ArrayList<Double> values, int n, int i) {
		
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < n) {
			int maxChild = left;
			if (right < n && values.get(right) > values.get(left)) {
				maxChild = right;
			}
			if (values.get(maxChild) > values.get(i)) {
				Double temp1 = values.get(i);
				values.set(i, values.get(maxChild));
				values.set(maxChild, temp1);
				String temp2 = keys.get(i);
				keys.set(i, keys.get(maxChild));
				keys.set(maxChild, temp2);
				heapify(keys, values, n, maxChild);
			}
		}
	}

	public void setMap(Map<String, Double> map_to_be_sorted) {
		if (map_to_be_sorted.containsValue(null)) {
			throw new MapContainsNullValueException("Map contains null value.");
		} else {
			this.map = map_to_be_sorted;
		}
	}

	public Map<String, Double> getMap() {
		return this.map;
	}
}