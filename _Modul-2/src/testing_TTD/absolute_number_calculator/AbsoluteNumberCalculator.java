package testing_TTD.absolute_number_calculator;

public class AbsoluteNumberCalculator {
    public static  int findAbsolute(int number){
//        throw new UnsupportedOperationException();
//        return 0;
        if(number<0){
            return -number;
        }
        return number;
    }
}
