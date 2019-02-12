
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CarTest {
Car testCar =new Car();
double initialSpeed;

	
	public void setUp() throws Exception {
	
		initialSpeed=testCar.getSpeed();
}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPushPedal(){
	
	testCar.pushPedal();
	assertTrue(testCar.getSpeed()==10.0+ initialSpeed);
	}
	@Test
	
	public void testNoise() {
		testCar.makeNoise();
		assertEquals(testCar.makeNoise(), testCar.makeNoise());
	}

}
