package Mphasis10.JunitTEST;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
	
	Calculator cal=new Calculator();
	@Test
	public void testAdd() {
		assertEquals(13,cal.doSum(2,6,5));
		assertEquals(10,cal.doSum(2,6,2));
	}
	
	
}
