package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	/*public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test
    public void testMultipleNumbers(){
    	assertEquals(15, Calculator.add("1,2,3,4,5"));
    }*/

     @Test
    public void testMultipleNumbersWithDelimiter(){
    	try {
    	assertEquals(6, Calculator.add("-2,-1,0,1"));
    		}
    		assertEquals("Negatives not allowed: [-2, -1]")
    }*/





}