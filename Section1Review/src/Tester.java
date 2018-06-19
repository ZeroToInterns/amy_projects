import static org.junit.Assert.*;

import org.junit.*;

public class Tester {

	private LoopyFun obj;
	
	@Before
	public void setUp() {
		obj = new LoopyFun();
	}
	
	@Test
	public void testPermutationCount() {
		assertEquals(obj.getPermutationCount(8), 40320);
		assertEquals(obj.getPermutationCount(0), 0);
		assertEquals(obj.getPermutationCount(-1), 0);
		assertEquals(obj.getPermutationCount(10), 3628800);
		assertEquals(obj.getPermutationCount(1), 1);
	}
	
	@Test
	public void testRemoveDuplicates() {
		assertEquals(obj.removeDuplicates("seeped"), "sepd");
		assertEquals(obj.removeDuplicates("popcorn"), "pocrn");
		assertEquals(obj.removeDuplicates("mississippi"), "misp");
		assertEquals(obj.removeDuplicates("leeeeeep"), "lep");
	}
	
	@Test (expected = RuntimeException.class)
	public void testRemoveDuplicatesException() {
		obj.removeDuplicates("");
	}
	
	@Test
	public void testSumSeries() {
		assertEquals(obj.sumSeries(4), 3.75, 0.01);
		assertEquals(obj.sumSeries(-1), 0, 0.001);
		assertEquals(obj.sumSeries(0), 0, 0.001);
		assertEquals(obj.sumSeries(5), 3.875, 0.001);
		assertEquals(obj.sumSeries(8), 3.984375, 0.000001);
	}
	
//	@Test
//	public void testProduct() {
//		assertEquals(obj.product(0), 0);
//		assertEquals(obj.product(-5), -1);
//		
//		//using numbers 1, 2, 3, 4, and 5 to test
//		assertEquals(obj.product(5), 120);
//		
//		//using numbers 1, 2, 3, 4, 5, 6, 7, and 8 to test
//		assertEquals(obj.product(8), 40320);
//		
//		//using numbers 1, 2, 3, 4, 5, 6, 7, 8, 9, and 10 to test
//		assertEquals(obj.product(10), 3628800);
//	}
	
	@Test
	public void testLargestPowerLessThan() {
		assertEquals(obj.largestPowerLessThan(-1), -1);
		assertEquals(obj.largestPowerLessThan(16), 3);
		assertEquals(obj.largestPowerLessThan(1), -1);
		assertEquals(obj.largestPowerLessThan(0), -1);
		assertEquals(obj.largestPowerLessThan(4), 1);
	}
	
	@Test
	public void testSumOdd() {
		assertEquals(obj.sumOdd(10), 25);
		assertEquals(obj.sumOdd(1), 0);
		assertEquals(obj.sumOdd(-1), 0);
		assertEquals(obj.sumOdd(5), 4);
		assertEquals(obj.sumOdd(32), 256);
	}
	
	@Test
	public void testGetECount() {
		assertEquals(obj.getECount("Elephant"), 2);
		assertEquals(obj.getECount("glass"), 0);
		assertEquals(obj.getECount("electric"), 2);
		assertEquals(obj.getECount("seed"), 2);
		assertEquals(obj.getECount("EeeeEppaeiou"), 6);
	}
	
	
}
