package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.InsertionSort;
import src.MapContainsNullValueException;

public class InsertionSortTest {

	InsertionSort insertionSort;

	@Before
	public void setUp() throws Exception {
		insertionSort = new InsertionSort();
	}

	@Test
	public void test_insertion_basic() throws MapContainsNullValueException {
		Map<String, Double> mapToSort = new HashMap<String, Double>();
		mapToSort.put("leafs", 99.2);
		mapToSort.put("sens", 30.1);
		mapToSort.put("habs", 67.0);
		mapToSort.put("jets", 107.4);
		mapToSort.put("oilers", 97.1);
		mapToSort.put("flames", 31.7);
		mapToSort.put("canucks", 62.8);
		mapToSort.put("bruins", 108.5);
		mapToSort.put("sabres", 96.1);
		mapToSort.put("flyers", 27.2);
		mapToSort.put("penguins", 69.3);
		mapToSort.put("capitals", 104.6);
		mapToSort.put("rangers", 95.5);
		mapToSort.put("lightning", 36.9);
		mapToSort.put("blues", 68.0);
		mapToSort.put("wild", 106.4);

		insertionSort.setMap(mapToSort);

		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("flyers");
		expectedResult.add("sens");
		expectedResult.add("flames");
		expectedResult.add("lightning");
		expectedResult.add("canucks");
		expectedResult.add("habs");
		expectedResult.add("blues");
		expectedResult.add("penguins");
		expectedResult.add("rangers");
		expectedResult.add("sabres");
		expectedResult.add("oilers");
		expectedResult.add("leafs");
		expectedResult.add("capitals");
		expectedResult.add("wild");
		expectedResult.add("jets");
		expectedResult.add("bruins");

		ArrayList<String> sort = insertionSort.sortByValue();

		for (int i = 0; i < expectedResult.size(); i++) {
			Assert.assertEquals(expectedResult.get(i), sort.get(i));
		}
	}

	@Test
	public void test_insertion_negative() throws MapContainsNullValueException {
		Map<String, Double> mapToSort = new HashMap<String, Double>();
		mapToSort.put("leafs", 99.2);
		mapToSort.put("sens", -30.1);
		mapToSort.put("habs", 67.0);
		mapToSort.put("jets", 107.4);
		mapToSort.put("oilers", 97.1);
		mapToSort.put("flames", 31.7);
		mapToSort.put("canucks", 62.8);
		mapToSort.put("bruins", -108.5);
		mapToSort.put("sabres", 96.1);
		mapToSort.put("flyers", 27.2);
		mapToSort.put("penguins", 69.3);
		mapToSort.put("capitals", 104.6);
		mapToSort.put("rangers", 95.5);
		mapToSort.put("lightning", -36.9);
		mapToSort.put("blues", -68.0);
		mapToSort.put("wild", 106.4);

		insertionSort.setMap(mapToSort);

		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("bruins");
		expectedResult.add("blues");
		expectedResult.add("lightning");
		expectedResult.add("sens");
		expectedResult.add("flyers");
		expectedResult.add("flames");
		expectedResult.add("canucks");
		expectedResult.add("habs");
		expectedResult.add("penguins");
		expectedResult.add("rangers");
		expectedResult.add("sabres");
		expectedResult.add("oilers");
		expectedResult.add("leafs");
		expectedResult.add("capitals");
		expectedResult.add("wild");
		expectedResult.add("jets");

		ArrayList<String> sort = insertionSort.sortByValue();

		for (int i = 0; i < expectedResult.size(); i++) {
			Assert.assertEquals(expectedResult.get(i), sort.get(i));
		}
	}

	@Test(expected = MapContainsNullValueException.class)
	public void test_insertion_exception() {
		Map<String, Double> mapToBeSorted = new HashMap<String, Double>();
		mapToBeSorted.put("g", 0.0);
		mapToBeSorted.put("p", 1.8);
		mapToBeSorted.put("a", null);
		mapToBeSorted.put("h", 3.2);
		insertionSort.setMap(mapToBeSorted);
	}

	@Test
	public void test_insertion_single() throws MapContainsNullValueException {
		Map<String, Double> mapToSort = new HashMap<String, Double>();
		mapToSort.put("leafs", 99.2);

		insertionSort.setMap(mapToSort);

		ArrayList<String> expectedResult = new ArrayList<String>();

		expectedResult.add("leafs");

		ArrayList<String> sort = insertionSort.sortByValue();

		for (int i = 0; i < expectedResult.size(); i++) {
			Assert.assertEquals(expectedResult.get(i), sort.get(i));
		}
	}

	@Test
	public void test_insertion_long() throws MapContainsNullValueException {
		Map<String, Double> mapToSort = new HashMap<String, Double>();
		mapToSort.put("a", -121.99);
		mapToSort.put("b", 131.94);
		mapToSort.put("c", -121.78);
		mapToSort.put("d", 131.66);
		mapToSort.put("e", -121.66);
		mapToSort.put("f", 131.64);
		mapToSort.put("g", -121.97);
		mapToSort.put("h", 131.65);
		mapToSort.put("i", -121.65);
		mapToSort.put("j", 131.92);
		mapToSort.put("k", -121.68);
		mapToSort.put("l", 131.90);
		mapToSort.put("m", -121.69);
		mapToSort.put("n", 131.91);
		mapToSort.put("o", -121.77);
		mapToSort.put("p", 131.67);
		mapToSort.put("q", -121.79);
		mapToSort.put("r", 131.68);
		mapToSort.put("s", -121.95);
		mapToSort.put("t", 131.89);
		mapToSort.put("u", -121.89);
		mapToSort.put("v", 131.70);
		mapToSort.put("w", -121.96);
		mapToSort.put("x", 131.93);
		mapToSort.put("y", -121.67);
		mapToSort.put("z", 131.88);
		mapToSort.put("A", -121.71);
		mapToSort.put("B", 131.69);
		mapToSort.put("C", -121.76);
		mapToSort.put("D", 131.86);
		mapToSort.put("E", -121.70);
		mapToSort.put("F", 131.71);
		mapToSort.put("G", -121.72);
		mapToSort.put("H", 131.73);
		mapToSort.put("I", -121.64);
		mapToSort.put("J", 131.87);
		mapToSort.put("K", -121.75);
		mapToSort.put("L", 131.72);
		mapToSort.put("M", -121.88);
		mapToSort.put("N", 131.74);
		mapToSort.put("O", -121.82);
		mapToSort.put("P", 131.78);
		mapToSort.put("Q", -121.94);
		mapToSort.put("R", 131.77);
		mapToSort.put("S", -121.92);
		mapToSort.put("T", 131.75);
		mapToSort.put("U", -121.93);
		mapToSort.put("V", 131.76);
		mapToSort.put("W", -121.81);
		mapToSort.put("X", 131.79);
		mapToSort.put("Y", -121.73);
		mapToSort.put("Z", 131.81);
		mapToSort.put("AA", -121.86);
		mapToSort.put("BB", 131.80);
		mapToSort.put("CC", -121.87);
		mapToSort.put("DD", 131.97);
		mapToSort.put("EE", -121.85);
		mapToSort.put("FF", 131.85);
		mapToSort.put("GG", -121.83);
		mapToSort.put("HH", 131.82);
		mapToSort.put("II", -121.91);
		mapToSort.put("JJ", 131.98);
		mapToSort.put("KK", -121.74);
		mapToSort.put("LL", 131.83);
		mapToSort.put("MM", -121.80);
		mapToSort.put("NN", 131.84);
		mapToSort.put("OO", -121.84);
		mapToSort.put("PP", 131.95);
		mapToSort.put("QQ", -121.90);
		mapToSort.put("RR", 131.96);
		mapToSort.put("SS", -121.98);
		mapToSort.put("TT", 131.99);

		insertionSort.setMap(mapToSort);

		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("a");
		expectedResult.add("SS");
		expectedResult.add("g");
		expectedResult.add("w");
		expectedResult.add("s");
		expectedResult.add("Q");
		expectedResult.add("U");
		expectedResult.add("S");
		expectedResult.add("II");
		expectedResult.add("QQ");
		expectedResult.add("u");
		expectedResult.add("M");
		expectedResult.add("CC");
		expectedResult.add("AA");
		expectedResult.add("EE");
		expectedResult.add("OO");
		expectedResult.add("GG");
		expectedResult.add("O");
		expectedResult.add("W");
		expectedResult.add("MM");
		expectedResult.add("q");
		expectedResult.add("c");
		expectedResult.add("o");
		expectedResult.add("C");
		expectedResult.add("K");
		expectedResult.add("KK");
		expectedResult.add("Y");
		expectedResult.add("G");
		expectedResult.add("A");
		expectedResult.add("E");
		expectedResult.add("m");
		expectedResult.add("k");
		expectedResult.add("y");
		expectedResult.add("e");
		expectedResult.add("i");
		expectedResult.add("I");
		expectedResult.add("f");
		expectedResult.add("h");
		expectedResult.add("d");
		expectedResult.add("p");
		expectedResult.add("r");
		expectedResult.add("B");
		expectedResult.add("v");
		expectedResult.add("F");
		expectedResult.add("L");
		expectedResult.add("H");
		expectedResult.add("N");
		expectedResult.add("T");
		expectedResult.add("V");
		expectedResult.add("R");
		expectedResult.add("P");
		expectedResult.add("X");
		expectedResult.add("BB");
		expectedResult.add("Z");
		expectedResult.add("HH");
		expectedResult.add("LL");
		expectedResult.add("NN");
		expectedResult.add("FF");
		expectedResult.add("D");
		expectedResult.add("J");
		expectedResult.add("z");
		expectedResult.add("t");
		expectedResult.add("l");
		expectedResult.add("n");
		expectedResult.add("j");
		expectedResult.add("x");
		expectedResult.add("b");
		expectedResult.add("PP");
		expectedResult.add("RR");
		expectedResult.add("DD");
		expectedResult.add("JJ");
		expectedResult.add("TT");

		ArrayList<String> sort = insertionSort.sortByValue();

		for (int i = 0; i < expectedResult.size(); i++) {
			Assert.assertEquals(expectedResult.get(i), sort.get(i));
		}
	}
}
