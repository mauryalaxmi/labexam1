package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car car1;
	@Before
	public void setUp() throws Exception {
		 car1=new Car(100);
	}

	@Test
	public void testGetengineCapcity() {
		//fail("Not yet implemented");
		
	}

	@Test
	public void testGetEngineCapcity() {
		//fail("Not yet implemented");
		car1.getEngineCapcity(4);
		assertEquals(416,car1.getengineCapcity());
	}

}
