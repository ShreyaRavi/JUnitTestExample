import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathTest {
	
	Math math;
	
	@Before
	public void init() {
		math = new Math(3,5);
	}

	@Test
	public void testAdd() {
		assertEquals(math.add(), 8, 0);
	}
	
	@Test
	public void testMultiply() {
		assertEquals(math.multiply(), 15, 0);
	}
	
	@Test
	public void testDivide() {
		assertEquals(math.divide(), 0.6, 0);
	}
	
	@Test
	public void testSubtract() {
		assertEquals(math.subtract(), -2, 0);
	}
	
	@Test (timeout = 1000)
	public void testLoop() {
		math.loop();
	}
	
	

}
