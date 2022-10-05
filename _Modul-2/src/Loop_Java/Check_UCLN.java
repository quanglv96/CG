package Loop_Java;

import java.util.Scanner;

public class Check_UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        int a = scanner.nextInt();
        System.out.println("Nhập số b");
        int b = scanner.nextInt();
        int count=1;
        if (a == 0 && b == 0) {
            System.out.println("Số " + a + " và số " + b + " không có ƯCLN");
        } else {
            if (a == 0) {
                System.out.println("Số " + a + " và số " + b + " có ƯCLN là: " + Math.abs(b));
            } else {
                if (b == 0) {
                    System.out.println("Số " + a + " và số " + b + " có ƯCLN là: " + Math.abs(a));
                } else {
                    if (a > b) {
                        for (int i = 1; i <= b / 2; i++) {
                            if (a % i == 0 && b % i == 0) {
                                count=i;
                            }
                        }
                        System.out.println("Số " + a + " và số " + b + " có ƯCLN là: " + count);
                    } else{
                        for (int i = 1; i <= a / 2; i++) {
                            if (a % i == 0 && b % i == 0) {
                                count=i;
                            }
                        }
                        System.out.println("Số " + a + " và số " + b + " có ƯCLN là: " + count);
                    }
                }
            }
        }
    }
}
