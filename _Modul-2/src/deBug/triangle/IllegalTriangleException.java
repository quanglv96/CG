package deBug.triangle;
import java.util.Scanner;

public class IllegalTriangleException extends Exception {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hãy nhập a: ");
//        int a = scanner.nextInt();
//        System.out.println("Hãy nhập b: ");
//        int b = scanner.nextInt();
//        System.out.println("Hãy nhập c: ");
//        int c = scanner.nextInt();
        checkTriangle(0, 5, 1);
        System.out.println("------");
        checkTriangle(3, 5, 4);
        System.out.println("------");
        checkTriangle(5, -3, 4);
    }

    public static void checkTriangle(int a, int b, int c) {
        try {
            if (a > 0 && b > 0 && c > 0) {
                if (a < (b + c) && a > Math.abs(b - c)) {
                    System.out.println(a + ", " + b + ", " + c + " là 3 cạnh tam giác");
                }else {
                    throw new IllegalTriangleException();
                }
            }else {
                throw new IllegalTriangleException();
            }
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
