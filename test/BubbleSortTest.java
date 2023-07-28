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
		Map<String, Integer> mapToSort = new HashMap<String, Integer>();
		mapToSort.put("leafs", 99);
		mapToSort.put("sens", 30);
		mapToSort.put("habs", 67);
		mapToSort.put("jets", 107);
		mapToSort.put("oilers", 97);
		mapToSort.put("flames", 31);
		mapToSort.put("canucks", 62);
		mapToSort.put("bruins", 108);
		mapToSort.put("sabres", 96);
		mapToSort.put("flyers", 27);
		mapToSort.put("penguins", 69);
		mapToSort.put("capitals", 104);
		mapToSort.put("rangers", 95);
		mapToSort.put("lightning", 36);
		mapToSort.put("blues", 68);
		mapToSort.put("wild", 106);

		bubble.setMap(mapToSort);

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

		ArrayList<String> sort = bubble.sortByValue();

		for (int i = 0; i < expectedResult.size(); i++) {
			Assert.assertEquals(expectedResult.get(i), sort.get(i));
		}
	}

	@Test
	public void test_bubble_negative() throws MapContainsNullValueException {
		Map<String, Integer> mapToSort = new HashMap<String, Integer>();
		mapToSort.put("leafs", 99);
		mapToSort.put("sens", -30);
		mapToSort.put("habs", 67);
		mapToSort.put("jets", 107);
		mapToSort.put("oilers", 97);
		mapToSort.put("flames", 31);
		mapToSort.put("canucks", 62);
		mapToSort.put("bruins", -108);
		mapToSort.put("sabres", 96);
		mapToSort.put("flyers", 27);
		mapToSort.put("penguins", 69);
		mapToSort.put("capitals", 104);
		mapToSort.put("rangers", 95);
		mapToSort.put("lightning", -36);
		mapToSort.put("blues", -68);
		mapToSort.put("wild", 106);

		bubble.setMap(mapToSort);

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

		ArrayList<String> sort = bubble.sortByValue();

		for (int i = 0; i < expectedResult.size(); i++) {
			Assert.assertEquals(expectedResult.get(i), sort.get(i));
		}
	}

	@Test(expected = MapContainsNullValueException.class)
	public void test_bubble_exception() {
		Map<String, Integer> mapToBeSorted = new HashMap<String, Integer>();
		mapToBeSorted.put("t", 7);
		mapToBeSorted.put("s", 3);
		mapToBeSorted.put("m", null);
		mapToBeSorted.put("a", 1);
		bubble.setMap(mapToBeSorted);
	}

	@Test
	public void test_bubble_single() throws MapContainsNullValueException {
		Map<String, Integer> mapToSort = new HashMap<String, Integer>();
		mapToSort.put("leafs", 99);

		bubble.setMap(mapToSort);

		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("leafs");

		ArrayList<String> sort = bubble.sortByValue();

		for (int i = 0; i < expectedResult.size(); i++) {
			Assert.assertEquals(expectedResult.get(i), sort.get(i));
		}
	}

	@Test
	public void test_bubble_long() throws MapContainsNullValueException {
		Map<String, Integer> mapToSort = new HashMap<String, Integer>();
		mapToSort.put("a", -99);
		mapToSort.put("b", 94);
		mapToSort.put("c", -78);
		mapToSort.put("d", 66);
		mapToSort.put("e", -66);
		mapToSort.put("f", 64);
		mapToSort.put("g", -97);
		mapToSort.put("h", 65);
		mapToSort.put("i", -65);
		mapToSort.put("j", 92);
		mapToSort.put("k", -68);
		mapToSort.put("l", 90);
		mapToSort.put("m", -69);
		mapToSort.put("n", 91);
		mapToSort.put("o", -77);
		mapToSort.put("p", 67);
		mapToSort.put("q", -79);
		mapToSort.put("r", 68);
		mapToSort.put("s", -95);
		mapToSort.put("t", 89);
		mapToSort.put("u", -89);
		mapToSort.put("v", 70);
		mapToSort.put("w", -96);
		mapToSort.put("x", 93);
		mapToSort.put("y", -67);
		mapToSort.put("z", 88);
		mapToSort.put("A", -71);
		mapToSort.put("B", 69);
		mapToSort.put("C", -76);
		mapToSort.put("D", 86);
		mapToSort.put("E", -70);
		mapToSort.put("F", 71);
		mapToSort.put("G", -72);
		mapToSort.put("H", 73);
		mapToSort.put("I", -64);
		mapToSort.put("J", 87);
		mapToSort.put("K", -75);
		mapToSort.put("L", 72);
		mapToSort.put("M", -88);
		mapToSort.put("N", 74);
		mapToSort.put("O", -82);
		mapToSort.put("P", 78);
		mapToSort.put("Q", -94);
		mapToSort.put("R", 77);
		mapToSort.put("S", -92);
		mapToSort.put("T", 75);
		mapToSort.put("U", -93);
		mapToSort.put("V", 76);
		mapToSort.put("W", -81);
		mapToSort.put("X", 79);
		mapToSort.put("Y", -73);
		mapToSort.put("Z", 81);
		mapToSort.put("AA", -86);
		mapToSort.put("BB", 80);
		mapToSort.put("CC", -87);
		mapToSort.put("DD", 97);
		mapToSort.put("EE", -85);
		mapToSort.put("FF", 85);
		mapToSort.put("GG", -83);
		mapToSort.put("HH", 82);
		mapToSort.put("II", -91);
		mapToSort.put("JJ", 98);
		mapToSort.put("KK", -74);
		mapToSort.put("LL", 83);
		mapToSort.put("MM", -80);
		mapToSort.put("NN", 84);
		mapToSort.put("OO", -84);
		mapToSort.put("PP", 95);
		mapToSort.put("QQ", -90);
		mapToSort.put("RR", 96);
		mapToSort.put("SS", -98);
		mapToSort.put("TT", 99);

		bubble.setMap(mapToSort);

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

		ArrayList<String> sort = bubble.sortByValue();

		for (int i = 0; i < expectedResult.size(); i++) {
			Assert.assertEquals(expectedResult.get(i), sort.get(i));
		}
	}
}
