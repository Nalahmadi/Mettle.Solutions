package perfectSquare;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PerfectSquareTest {
	
	public PerfectSquare pf;

	@Before
	public void init() {
		pf = new PerfectSquare();
	}

	@Test
	public void testNull() {
		List<Integer> ll = pf.getPerfectSquare(null);
		assertEquals("empty list", 0, ll.size());
	}
	
	@Test
	public void testEmptyArray() {
		List<Integer> ll = pf.getPerfectSquare(new int[] {});
		assertEquals("empty list", 0, ll.size());
	}
	
	@Test
	public void testAllValuesArePerfectSquaresInAscendingOrder() {
		int[] array = new int[] {1,4,9,16,25,36};
		List<Integer> ll = pf.getPerfectSquare(array);
		assertEquals(array.length, ll.size());
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,4,9,16,25,36));
		for (int i = 0 ; i<ll.size() ; i++) {
			assertEquals(arrayList.get(i), ll.get(i));
		}
	}
	
	@Test
	public void testAllValuesAreNotPerfectSquares() {
		int[] array = new int[] {11,14,19,17,26,37};
		List<Integer> ll = pf.getPerfectSquare(array);
		assertEquals(0, ll.size());
	}
	
	@Test
	public void testValuesPerfectSquaresNotInAscending() {
		int[] array = new int[] {4,1,19,17,36,25};
		List<Integer> actual = pf.getPerfectSquare(array);
		assertEquals(4, actual.size());
		List<Integer> expected = new ArrayList<>(Arrays.asList(1,4,25,36));
		for (int i = 0 ; i<actual.size() ; i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

}
