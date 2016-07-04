import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayCountTest {

	ArrayCount array;
	
	@Before
	public void init() {
		 array = new ArrayCount(3,4,5);
	}
	
	@Test
	public void arrayLengthTest() {
		assertEquals(array.arrayLength(), 3, 0);
	}
	
	@Test
	public void arrayTypeTest() {
		assertEquals(array.arrayType(), Integer.TYPE);
	}
	
	@Test
	public void getElementTest() {
		assertEquals(array.getElement(2), 5, 0);
	}
	
	@Test
	public void setElementTest() {
		assertEquals(array.setElement(4, 3), false);
	}
	

}
