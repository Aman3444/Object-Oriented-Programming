import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BicycleTest {
	Bicycle testbicycle =new Bicycle();
	double initialSpeed;
	
	
	public void setUp() throws Exception {
		initialSpeed= testbicycle.getSpeed();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPushingPadel() {
		testbicycle.pushPedal();
		assertTrue(testbicycle.getSpeed() == 4.0 + initialSpeed);
	}

	public void test() {
		testbicycle.makeNoise();
		assertEquals(testbicycle.makeNoise(),testbicycle.makeNoise());
	}
	

}
