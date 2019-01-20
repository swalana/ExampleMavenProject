package ch.bbw.consoleCalculator;

import static org.junit.Assert.assertEquals;
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

    //addition
    @Test
    public void testSumTwoPositiveIsOk1() {
        assertEquals(8.5, calc.calculateSum(3.5, 5), 0.0);
    }

    @Test
    public void testSumTwoPositiveIsOk2() {
        assertEquals(15, calc.calculateSum(3, 12), 0.0);
    }

    @Test
    public void testSumOneNegativeIsOk1() {
        assertEquals(7, calc.calculateSum(12, -5), 0.0);
    }

    @Test
    public void testSumOneNegativeIsOk2() {
        assertEquals(11, calc.calculateSum(14, -3), 0.0);
    }

    @Test
    public void testSumTwoNegativeIsOk1() {
        assertEquals(-8.5, calc.calculateSum(-3.5, -5), 0.0);
    }

    @Test
    public void testSumTwoNegativeIsOk2() {
        assertEquals(-10.5, calc.calculateSum(-5.5, -5), 0.0);
    }

    @Test
    public void testSumMaxAndMinValueIsOk1() {
        assertEquals(-1, calc.calculateSum(Integer.MAX_VALUE, Integer.MIN_VALUE), 0.0);
    }

    @Test
    public void testSumMaxAndMinValueIsOk2() {
        assertEquals(-1, calc.calculateSum(Integer.MIN_VALUE, Integer.MAX_VALUE), 0.0);
    }


    //subtraction
    @Test
    public void testSubtractionTwoPositiveIsOk1() {
        assertEquals(1.5, calc.calculateSubtraction(6.5, 5), 0.0);
    }

    @Test
    public void testSubtractionTwoPositiveIsOk2() {
        assertEquals(-3.5, calc.calculateSubtraction(1.5, 5), 0.0);
    }

    @Test
    public void testSubtractionTwoNegativeIsOk1() {
        assertEquals(-1.5, calc.calculateSubtraction(-6.5, -5), 0.0);
    }
    @Test
    public void testSubtractionTwoNegativeIsOk2() {
        assertEquals(3.5, calc.calculateSubtraction(-1.5, -5), 0.0);
    }

    @Test
    public void testSubtractionOneNegativeIsOk1() {
        assertEquals(-11.5, calc.calculateSubtraction(-6.5, 5), 0.0);
    }

    @Test
    public void testSubtractionOneNegativeIsOk2() {
        assertEquals(-15.5, calc.calculateSubtraction(-12.5, 3), 0.0);
    }

    @Test(expected = AssertionError.class)
    public void testMinAndMaxValueDifference1() {
        assertEquals(1, calc.calculateSubtraction(Integer.MAX_VALUE, Integer.MIN_VALUE), 0.0);
    }
    @Test
    public void testMinAndMaxValueDifference2() {
        assertEquals(-4.294967295E9, calc.calculateSubtraction(Integer.MIN_VALUE, Integer.MAX_VALUE), 0.0);
    }

    //division
    @Test
    public void testDivisionTwoPositiveIsOk1() {
        assertEquals(8, calc.calculateDivision(24, 3));
    }

    @Test
    public void testDivisionTwoPositiveIsOk2() {
        assertEquals(10, calc.calculateDivision(40, 4));
    }

    @Test
    public void testDivisionTwoNegativeIsOk1() {
        assertEquals(8, calc.calculateDivision(-24, -3));
    }

    @Test
    public void testDivisionTwoNegativeIsOk2() {
        assertEquals(5, calc.calculateDivision(-20, -4));
    }

    @Test
    public void testDivisionOneNegativeIsOk1() {
        assertEquals(-8, calc.calculateDivision(24, -3));
    }
    @Test
    public void testDivisionOneNegativeIsOk2() {
        assertEquals(-4, calc.calculateDivision(12, -3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionNullErrorExpected1() {
        calc.calculateDivision(3, 0);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivisionNullErrorExpected2() {
        calc.calculateDivision(16, 0);
    }

    //This test have to comment out because it will fail
//    @Test
//    public void testDivisionNullErrorUnExpected() throws ArithmeticException {
//       calc.calculateDivision(3, 0);
//    }
}
