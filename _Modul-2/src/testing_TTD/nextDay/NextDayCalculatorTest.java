package testing_TTD.nextDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static testing_TTD.nextDay.NextDayCalculator.checkCalculator;

class NextDayCalculatorTest {

    @Test
    void main() {
        int day=1;
        int month=1;
        int year=2018;
        String txt= checkCalculator(day, month, year);
        String expected="Ngày 2 tháng 1 năm 2018";
        assertEquals(expected,txt);
    }
    @Test
    void main1() {
        int day=31;
        int month=1;
        int year=2018;
        String txt= checkCalculator(day, month, year);
        String expected="Ngày 1 tháng 2 năm 2018";
        assertEquals(expected,txt);
    }

    @Test
    void main2() {
        int day=30;
        int month=4;
        int year=2018;
        String txt= checkCalculator(day, month, year);
        String expected="Ngày 1 tháng 5 năm 2018";
        assertEquals(expected,txt);
    }
    @Test
    void main3() {
        int day=28;
        int month=2;
        int year=2018;
        String txt= checkCalculator(day, month, year);
        String expected="Ngày 1 tháng 3 năm 2018";
        assertEquals(expected,txt);
    }
    @Test
    void main4() {
        int day=29;
        int month=2;
        int year=2020;
        String txt= checkCalculator(day, month, year);
        String expected="Ngày 1 tháng 3 năm 2020";
        assertEquals(expected,txt);
    }
    @Test
    void main5() {
        int day=31;
        int month=12;
        int year=2018;
        String txt= checkCalculator(day, month, year);
        String expected="Ngày 1 tháng 1 năm 2019";
        assertEquals(expected,txt);
    }
}