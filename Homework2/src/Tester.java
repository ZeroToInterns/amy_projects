import static org.junit.Assert.*;
import org.junit.*;

public class Tester {

//	public static void main(String[] args) {
//		ControlFlowPractice test = new ControlFlowPractice();
//		System.out.println(test.calculateCost(27));
//		test.rollDice(5);
//		System.out.println(test.findLetter("o", "Hello World"));
//	}

	private ControlFlowPractice obj;
	
	@Before
	public void setUp() {
		obj = new ControlFlowPractice();
	}

	@Test
	public void testCalculateCost() {
		assertTrue(obj.calculateCost(100) == 100.0);
	}
	@Test
	public void testCalculateCost1() {
		assertTrue(obj.calculateCost(50) == 100.0);
	}
	@Test
	public void testCalculateCost2() {
		assertTrue(obj.calculateCost(0) == 10.0);
	}
	@Test
	public void testCalculateCost3() {
		assertTrue(obj.calculateCost(25) == 50.0);
	}
	@Test
	public void testCalculateCost4() {
		assertTrue(obj.calculateCost(-25) == 0.0);
	}
	@Test
	public void testCalculateCost5() {
		assertTrue(obj.calculateCost(200) == 0.0);
	}
}
