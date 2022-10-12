package testing_TTD.fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static testing_TTD.fizzBuzz.FizzBuzz.translale;

class FizzBuzzTest {

    @Test
    void main() {
        int number=2;
        String txt= translale(number);
        String expected="Hai";
        assertEquals(txt,expected);
    }
    @Test
    void main1() {
        int number=26;
        String txt= translale(number);
        String expected="Hai Sáu";
        assertEquals(txt,expected);
    }
    @Test
    void main2() {
        int number=20;
        String txt= translale(number);
        String expected="Hai Mươi";
        assertEquals(txt,expected);
    }
}