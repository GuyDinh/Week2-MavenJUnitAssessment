import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Chicken;

public class TestChicken {
	Chicken testChicken = new Chicken();
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testIsAdult() {
		testChicken.setAgeMonths(1);
		assertFalse(testChicken.isAdult(testChicken));
	}
	
	@Test
	public void testIsNotAdult() {
		testChicken.setAgeMonths(3);
		assertTrue(testChicken.isAdult(testChicken));
	}
}
