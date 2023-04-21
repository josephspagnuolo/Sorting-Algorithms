package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.HeapSort;
import src.MapContainsNullValueException;

public class HeapSortTest {

	HeapSort heapsort;

	@Before
	public void setUp() throws Exception {
		heapsort = new HeapSort();
	}

	@Test
	public void test_heap_basic() throws MapContainsNullValueException {
		Map<String, Double> map_to_sort = new HashMap<String, Double>();
		map_to_sort.put("leafs", 99.2);
		map_to_sort.put("sens", 30.1);
		map_to_sort.put("habs", 67.0);
		map_to_sort.put("jets", 107.4);
		map_to_sort.put("oilers", 97.1);
		map_to_sort.put("flames", 31.7);
		map_to_sort.put("canucks", 62.8);
		map_to_sort.put("bruins", 108.5);
		map_to_sort.put("sabres", 96.1);
		map_to_sort.put("flyers", 27.2);
		map_to_sort.put("penguins", 69.3);
		map_to_sort.put("capitals", 104.6);
		map_to_sort.put("rangers", 95.5);
		map_to_sort.put("lightning", 36.9);
		map_to_sort.put("blues", 68.0);
		map_to_sort.put("wild", 106.4);

		heapsort.setMap(map_to_sort);

		ArrayList<String> expected_result = new ArrayList<String>();
		expected_result.add("flyers");
		expected_result.add("sens");
		expected_result.add("flames");
		expected_result.add("lightning");
		expected_result.add("canucks");
		expected_result.add("habs");
		expected_result.add("blues");
		expected_result.add("penguins");
		expected_result.add("rangers");
		expected_result.add("sabres");
		expected_result.add("oilers");
		expected_result.add("leafs");
		expected_result.add("capitals");
		expected_result.add("wild");
		expected_result.add("jets");
		expected_result.add("bruins");

		ArrayList<String> sort = heapsort.sortbyValue();

		for (int i = 0; i < expected_result.size(); i++) {
			Assert.assertEquals(expected_result.get(i), sort.get(i));
		}
	}

	@Test
	public void test_heap_negative() throws MapContainsNullValueException {
		Map<String, Double> map_to_sort = new HashMap<String, Double>();
		map_to_sort.put("leafs", 99.2);
		map_to_sort.put("sens", -30.1);
		map_to_sort.put("habs", 67.0);
		map_to_sort.put("jets", 107.4);
		map_to_sort.put("oilers", 97.1);
		map_to_sort.put("flames", 31.7);
		map_to_sort.put("canucks", 62.8);
		map_to_sort.put("bruins", -108.5);
		map_to_sort.put("sabres", 96.1);
		map_to_sort.put("flyers", 27.2);
		map_to_sort.put("penguins", 69.3);
		map_to_sort.put("capitals", 104.6);
		map_to_sort.put("rangers", 95.5);
		map_to_sort.put("lightning", -36.9);
		map_to_sort.put("blues", -68.0);
		map_to_sort.put("wild", 106.4);

		heapsort.setMap(map_to_sort);

		ArrayList<String> expected_result = new ArrayList<String>();
		expected_result.add("bruins");
		expected_result.add("blues");
		expected_result.add("lightning");
		expected_result.add("sens");
		expected_result.add("flyers");
		expected_result.add("flames");
		expected_result.add("canucks");
		expected_result.add("habs");
		expected_result.add("penguins");
		expected_result.add("rangers");
		expected_result.add("sabres");
		expected_result.add("oilers");
		expected_result.add("leafs");
		expected_result.add("capitals");
		expected_result.add("wild");
		expected_result.add("jets");

		ArrayList<String> sort = heapsort.sortbyValue();

		for (int i = 0; i < expected_result.size(); i++) {
			Assert.assertEquals(expected_result.get(i), sort.get(i));
		}
	}

	@Test(expected = MapContainsNullValueException.class)
	public void test_heap_exception() {
		Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
		map_to_be_sorted.put("g", 0.0);
		map_to_be_sorted.put("p", 1.8);
		map_to_be_sorted.put("a", null);
		map_to_be_sorted.put("h", 3.2);
		heapsort.setMap(map_to_be_sorted);
	}

	@Test
	public void test_heap_single() throws MapContainsNullValueException {
		Map<String, Double> map_to_sort = new HashMap<String, Double>();
		map_to_sort.put("leafs", 99.2);

		heapsort.setMap(map_to_sort);

		ArrayList<String> expected_result = new ArrayList<String>();

		expected_result.add("leafs");

		ArrayList<String> sort = heapsort.sortbyValue();

		for (int i = 0; i < expected_result.size(); i++) {
			Assert.assertEquals(expected_result.get(i), sort.get(i));
		}
	}

	@Test
	public void test_heap_long() throws MapContainsNullValueException {
		Map<String, Double> map_to_sort = new HashMap<String, Double>();
		map_to_sort.put("a", -121.99);
		map_to_sort.put("b", 131.94);
		map_to_sort.put("c", -121.78);
		map_to_sort.put("d", 131.66);
		map_to_sort.put("e", -121.66);
		map_to_sort.put("f", 131.64);
		map_to_sort.put("g", -121.97);
		map_to_sort.put("h", 131.65);
		map_to_sort.put("i", -121.65);
		map_to_sort.put("j", 131.92);
		map_to_sort.put("k", -121.68);
		map_to_sort.put("l", 131.90);
		map_to_sort.put("m", -121.69);
		map_to_sort.put("n", 131.91);
		map_to_sort.put("o", -121.77);
		map_to_sort.put("p", 131.67);
		map_to_sort.put("q", -121.79);
		map_to_sort.put("r", 131.68);
		map_to_sort.put("s", -121.95);
		map_to_sort.put("t", 131.89);
		map_to_sort.put("u", -121.89);
		map_to_sort.put("v", 131.70);
		map_to_sort.put("w", -121.96);
		map_to_sort.put("x", 131.93);
		map_to_sort.put("y", -121.67);
		map_to_sort.put("z", 131.88);
		map_to_sort.put("A", -121.71);
		map_to_sort.put("B", 131.69);
		map_to_sort.put("C", -121.76);
		map_to_sort.put("D", 131.86);
		map_to_sort.put("E", -121.70);
		map_to_sort.put("F", 131.71);
		map_to_sort.put("G", -121.72);
		map_to_sort.put("H", 131.73);
		map_to_sort.put("I", -121.64);
		map_to_sort.put("J", 131.87);
		map_to_sort.put("K", -121.75);
		map_to_sort.put("L", 131.72);
		map_to_sort.put("M", -121.88);
		map_to_sort.put("N", 131.74);
		map_to_sort.put("O", -121.82);
		map_to_sort.put("P", 131.78);
		map_to_sort.put("Q", -121.94);
		map_to_sort.put("R", 131.77);
		map_to_sort.put("S", -121.92);
		map_to_sort.put("T", 131.75);
		map_to_sort.put("U", -121.93);
		map_to_sort.put("V", 131.76);
		map_to_sort.put("W", -121.81);
		map_to_sort.put("X", 131.79);
		map_to_sort.put("Y", -121.73);
		map_to_sort.put("Z", 131.81);
		map_to_sort.put("AA", -121.86);
		map_to_sort.put("BB", 131.80);
		map_to_sort.put("CC", -121.87);
		map_to_sort.put("DD", 131.97);
		map_to_sort.put("EE", -121.85);
		map_to_sort.put("FF", 131.85);
		map_to_sort.put("GG", -121.83);
		map_to_sort.put("HH", 131.82);
		map_to_sort.put("II", -121.91);
		map_to_sort.put("JJ", 131.98);
		map_to_sort.put("KK", -121.74);
		map_to_sort.put("LL", 131.83);
		map_to_sort.put("MM", -121.80);
		map_to_sort.put("NN", 131.84);
		map_to_sort.put("OO", -121.84);
		map_to_sort.put("PP", 131.95);
		map_to_sort.put("QQ", -121.90);
		map_to_sort.put("RR", 131.96);
		map_to_sort.put("SS", -121.98);
		map_to_sort.put("TT", 131.99);

		heapsort.setMap(map_to_sort);

		ArrayList<String> expected_result = new ArrayList<String>();
		expected_result.add("a");
		expected_result.add("SS");
		expected_result.add("g");
		expected_result.add("w");
		expected_result.add("s");
		expected_result.add("Q");
		expected_result.add("U");
		expected_result.add("S");
		expected_result.add("II");
		expected_result.add("QQ");
		expected_result.add("u");
		expected_result.add("M");
		expected_result.add("CC");
		expected_result.add("AA");
		expected_result.add("EE");
		expected_result.add("OO");
		expected_result.add("GG");
		expected_result.add("O");
		expected_result.add("W");
		expected_result.add("MM");
		expected_result.add("q");
		expected_result.add("c");
		expected_result.add("o");
		expected_result.add("C");
		expected_result.add("K");
		expected_result.add("KK");
		expected_result.add("Y");
		expected_result.add("G");
		expected_result.add("A");
		expected_result.add("E");
		expected_result.add("m");
		expected_result.add("k");
		expected_result.add("y");
		expected_result.add("e");
		expected_result.add("i");
		expected_result.add("I");
		expected_result.add("f");
		expected_result.add("h");
		expected_result.add("d");
		expected_result.add("p");
		expected_result.add("r");
		expected_result.add("B");
		expected_result.add("v");
		expected_result.add("F");
		expected_result.add("L");
		expected_result.add("H");
		expected_result.add("N");
		expected_result.add("T");
		expected_result.add("V");
		expected_result.add("R");
		expected_result.add("P");
		expected_result.add("X");
		expected_result.add("BB");
		expected_result.add("Z");
		expected_result.add("HH");
		expected_result.add("LL");
		expected_result.add("NN");
		expected_result.add("FF");
		expected_result.add("D");
		expected_result.add("J");
		expected_result.add("z");
		expected_result.add("t");
		expected_result.add("l");
		expected_result.add("n");
		expected_result.add("j");
		expected_result.add("x");
		expected_result.add("b");
		expected_result.add("PP");
		expected_result.add("RR");
		expected_result.add("DD");
		expected_result.add("JJ");
		expected_result.add("TT");

		ArrayList<String> sort = heapsort.sortbyValue();

		for (int i = 0; i < expected_result.size(); i++) {
			Assert.assertEquals(expected_result.get(i), sort.get(i));
		}
	}
}
