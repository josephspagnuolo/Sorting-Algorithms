package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.BubbleSort;
import src.MapContainsNullValueException;

public class BubbleSortTest {

	BubbleSort bubble;

	@Before
	public void setUp() throws Exception {
		bubble = new BubbleSort();
	}

	@Test
	public void test_bubble_basic() throws MapContainsNullValueException {
		Map<String, Integer> map_to_sort = new HashMap<String, Integer>();
		map_to_sort.put("leafs", 99);
		map_to_sort.put("sens", 30);
		map_to_sort.put("habs", 67);
		map_to_sort.put("jets", 107);
		map_to_sort.put("oilers", 97);
		map_to_sort.put("flames", 31);
		map_to_sort.put("canucks", 62);
		map_to_sort.put("bruins", 108);
		map_to_sort.put("sabres", 96);
		map_to_sort.put("flyers", 27);
		map_to_sort.put("penguins", 69);
		map_to_sort.put("capitals", 104);
		map_to_sort.put("rangers", 95);
		map_to_sort.put("lightning", 36);
		map_to_sort.put("blues", 68);
		map_to_sort.put("wild", 106);

		bubble.setMap(map_to_sort);

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

		ArrayList<String> sort = bubble.sortbyValue();

		for (int i = 0; i < expected_result.size(); i++) {
			Assert.assertEquals(expected_result.get(i), sort.get(i));
		}
	}

	@Test
	public void test_bubble_negative() throws MapContainsNullValueException {
		Map<String, Integer> map_to_sort = new HashMap<String, Integer>();
		map_to_sort.put("leafs", 99);
		map_to_sort.put("sens", -30);
		map_to_sort.put("habs", 67);
		map_to_sort.put("jets", 107);
		map_to_sort.put("oilers", 97);
		map_to_sort.put("flames", 31);
		map_to_sort.put("canucks", 62);
		map_to_sort.put("bruins", -108);
		map_to_sort.put("sabres", 96);
		map_to_sort.put("flyers", 27);
		map_to_sort.put("penguins", 69);
		map_to_sort.put("capitals", 104);
		map_to_sort.put("rangers", 95);
		map_to_sort.put("lightning", -36);
		map_to_sort.put("blues", -68);
		map_to_sort.put("wild", 106);

		bubble.setMap(map_to_sort);

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

		ArrayList<String> sort = bubble.sortbyValue();

		for (int i = 0; i < expected_result.size(); i++) {
			Assert.assertEquals(expected_result.get(i), sort.get(i));
		}
	}

	@Test(expected = MapContainsNullValueException.class)
	public void test_bubble_exception() {
		Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
		map_to_be_sorted.put("t", 7);
		map_to_be_sorted.put("s", 3);
		map_to_be_sorted.put("m", null);
		map_to_be_sorted.put("a", 1);
		bubble.setMap(map_to_be_sorted);
	}

	@Test
	public void test_bubble_single() throws MapContainsNullValueException {
		Map<String, Integer> map_to_sort = new HashMap<String, Integer>();
		map_to_sort.put("leafs", 99);

		bubble.setMap(map_to_sort);

		ArrayList<String> expected_result = new ArrayList<String>();
		expected_result.add("leafs");

		ArrayList<String> sort = bubble.sortbyValue();

		for (int i = 0; i < expected_result.size(); i++) {
			Assert.assertEquals(expected_result.get(i), sort.get(i));
		}
	}

	@Test
	public void test_bubble_long() throws MapContainsNullValueException {
		Map<String, Integer> map_to_sort = new HashMap<String, Integer>();
		map_to_sort.put("a", -99);
		map_to_sort.put("b", 94);
		map_to_sort.put("c", -78);
		map_to_sort.put("d", 66);
		map_to_sort.put("e", -66);
		map_to_sort.put("f", 64);
		map_to_sort.put("g", -97);
		map_to_sort.put("h", 65);
		map_to_sort.put("i", -65);
		map_to_sort.put("j", 92);
		map_to_sort.put("k", -68);
		map_to_sort.put("l", 90);
		map_to_sort.put("m", -69);
		map_to_sort.put("n", 91);
		map_to_sort.put("o", -77);
		map_to_sort.put("p", 67);
		map_to_sort.put("q", -79);
		map_to_sort.put("r", 68);
		map_to_sort.put("s", -95);
		map_to_sort.put("t", 89);
		map_to_sort.put("u", -89);
		map_to_sort.put("v", 70);
		map_to_sort.put("w", -96);
		map_to_sort.put("x", 93);
		map_to_sort.put("y", -67);
		map_to_sort.put("z", 88);
		map_to_sort.put("A", -71);
		map_to_sort.put("B", 69);
		map_to_sort.put("C", -76);
		map_to_sort.put("D", 86);
		map_to_sort.put("E", -70);
		map_to_sort.put("F", 71);
		map_to_sort.put("G", -72);
		map_to_sort.put("H", 73);
		map_to_sort.put("I", -64);
		map_to_sort.put("J", 87);
		map_to_sort.put("K", -75);
		map_to_sort.put("L", 72);
		map_to_sort.put("M", -88);
		map_to_sort.put("N", 74);
		map_to_sort.put("O", -82);
		map_to_sort.put("P", 78);
		map_to_sort.put("Q", -94);
		map_to_sort.put("R", 77);
		map_to_sort.put("S", -92);
		map_to_sort.put("T", 75);
		map_to_sort.put("U", -93);
		map_to_sort.put("V", 76);
		map_to_sort.put("W", -81);
		map_to_sort.put("X", 79);
		map_to_sort.put("Y", -73);
		map_to_sort.put("Z", 81);
		map_to_sort.put("AA", -86);
		map_to_sort.put("BB", 80);
		map_to_sort.put("CC", -87);
		map_to_sort.put("DD", 97);
		map_to_sort.put("EE", -85);
		map_to_sort.put("FF", 85);
		map_to_sort.put("GG", -83);
		map_to_sort.put("HH", 82);
		map_to_sort.put("II", -91);
		map_to_sort.put("JJ", 98);
		map_to_sort.put("KK", -74);
		map_to_sort.put("LL", 83);
		map_to_sort.put("MM", -80);
		map_to_sort.put("NN", 84);
		map_to_sort.put("OO", -84);
		map_to_sort.put("PP", 95);
		map_to_sort.put("QQ", -90);
		map_to_sort.put("RR", 96);
		map_to_sort.put("SS", -98);
		map_to_sort.put("TT", 99);

		bubble.setMap(map_to_sort);

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

		ArrayList<String> sort = bubble.sortbyValue();

		for (int i = 0; i < expected_result.size(); i++) {
			Assert.assertEquals(expected_result.get(i), sort.get(i));
		}
	}
}
