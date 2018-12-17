package ch.bbw.consoleCalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
	Calculator calc;
	
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
	
	@Test
	public void testSumTwoPositiveIsOk() {
		calc = new Calculator();
		assertTrue(calc.calculateSum(3.5, 5) == 8.5);
	}
	
	@Test
	public void testSubstractionTwoPositiveIsOk() {
		calc = new Calculator();
		assertTrue(calc.calculateSubstraction(6.5, 5) == 1.5);
	}
	
}
