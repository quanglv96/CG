
public class test {
    static public int X = 2;

    public static void main(String[] args) {
        test o1 = new test();
        test o2 = new test();
        o2.X = 5;
        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, test.X);
    }
}

