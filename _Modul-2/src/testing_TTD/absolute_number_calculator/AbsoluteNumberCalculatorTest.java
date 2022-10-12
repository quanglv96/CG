package testing_TTD.absolute_number_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute() {
        int number=0;
        int expected=0;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    void testFindAbsolute1() {
        int number=1;
        int expected=1;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    void testFindAbsolute2() {
        int number=-1;
        int expected=1;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}