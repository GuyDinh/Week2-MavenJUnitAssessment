import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.Coop;

public class TestCoop {
	Coop testCoop = new Coop();
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testIsSmall() {
		testCoop.setDimensionSqFt(5);
		String size = testCoop.getSizeCategory(testCoop);
		assertEquals("small", size);
	}
	
	@Test
	public void testIsMedium() {
		testCoop.setDimensionSqFt(15);
		String size = testCoop.getSizeCategory(testCoop);
		assertEquals("medium", size);
	}
	
	@Test
	public void testIsLarge() {
		testCoop.setDimensionSqFt(25);
		String size = testCoop.getSizeCategory(testCoop);
		assertEquals("large", size);
	}
}
