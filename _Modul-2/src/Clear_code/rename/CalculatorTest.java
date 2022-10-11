package Clear_code.rename;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    public static void main(String[] args) {
        testCalculateAdd();
        System.out.println("----------------");
        testCalculateSub();
        System.out.println("----------------");
        testCalculateMul();
        System.out.println("----------------");
        testCalculateDiv();
    }

    @Test
    @DisplayName("ADDITION")
    static void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("SUBTRACTION")
    static void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '-';
        int expected = 1;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("MULTIPLICATION")
    static void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        char operator = '*';
        int expected = 4;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("DIVISION")
    static void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        char operator = '/';
        int expected = 2;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
}