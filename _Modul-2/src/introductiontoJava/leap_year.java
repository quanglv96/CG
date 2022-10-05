package introductiontoJava;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        System.out.println("Check Leap Year?");
        String check;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số năm cần kiểm tra");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = " là Năm Nhuận";
                } else {
                    check = " Không phải năm nhuận";
                }
            } else {
                check = " là năm nhuận";
            }
        }else {
            check = " Không phải năm nhuận";
        }
        System.out.println("Năm "+year+" "+ check);
    }
}
