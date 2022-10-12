package testing_TTD.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static testing_TTD.triangle.TriangleClass.checkTriangleBoolean;

class TriangleClassTest {

    @Test
    void main() {
        int numA=2;
        int numB=2;
        int numC=2;
        String txt=checkTriangleBoolean(numA,numB,numC);
        String expected="tam giác đều";
        assertEquals(txt,expected);
    }
    @Test
    void main1() {
        int numA=2;
        int numB=2;
        int numC=3;
        String txt=checkTriangleBoolean(numA,numB,numC);
        String expected="tam giác cân";
        assertEquals(txt,expected);
    }
    @Test
    void main2() {
        int numA=3;
        int numB=4;
        int numC=5;
        String txt=checkTriangleBoolean(numA,numB,numC);
        String expected="tam giác thường";
        assertEquals(txt,expected);
    }
    @Test
    void main3() {
        int numA=8;
        int numB=2;
        int numC=3;
        String txt=checkTriangleBoolean(numA,numB,numC);
        String expected="không phải là tam giác";
        assertEquals(txt,expected);
    }
    @Test
    void main4() {
        int numA=-1;
        int numB=2;
        int numC=1;
        String txt=checkTriangleBoolean(numA,numB,numC);
        String expected="không phải là tam giác";
        assertEquals(txt,expected);
    }
    @Test
    void main5() {
        int numA=0;
        int numB=1;
        int numC=1;
        String txt=checkTriangleBoolean(numA,numB,numC);
        String expected="không phải là tam giác";
        assertEquals(txt,expected);
    }

}