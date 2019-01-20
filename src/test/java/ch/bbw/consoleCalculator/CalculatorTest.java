package ch.bbw.consoleCalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
	
	Calculator calc;
	
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test
	public void testSumTwoPositiveIsOk() {
		assertTrue(calc.calculateSum(3.5, 5) == 8.5);
	}
	
	@Test
	public void testSubstractionTwoPositiveIsOk() {
		assertTrue(calc.calculateSubstraction(6.5, 5) == 1.5);
	}


	@Test (expected=ArithmeticException.class)
	public void testDivisionNullErrorExpected() {
		calc.calculateDivision(3, 0);
	}
	
//	@Test 
//	public void testDivisionNullErrorUnExpected() throws ArithmeticException {
//		calc.calculateSubstraction(3, 0);
//	}
	
}
