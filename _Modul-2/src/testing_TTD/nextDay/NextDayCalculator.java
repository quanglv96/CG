package testing_TTD.nextDay;

import java.util.Scanner;

public class NextDayCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Next Day Calculator");
        System.out.print("Nhập ngày: ");
        int day = input.nextInt();
        System.out.print("Nhập tháng: ");
        int month = input.nextInt();
        System.out.print("Nhập năm: ");
        int year = input.nextInt();
        System.out.println("Ngày tiếp theo là: ");
        checkCalculator(day, month, year);
    }
    public static String checkCalculator(int day, int month, int year) {
        int dayInmonth = checkYear(month, year);
        String txt;
        if (day == dayInmonth) {
            if (month == 12) {
                txt="Ngày 1" + " tháng 1 năm " + (year + 1);
            } else {
                txt="Ngày 1" + " tháng " + (month + 1) + " năm " + year;
            }
        }else {
            txt="Ngày "+(day+1) + " tháng " + (month) + " năm " + year;
        }
        return txt;
    }

    public static int checkYear(int month, int year) {
        int daysInmonth = 0;
        if (month == 2) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        daysInmonth = 29;
                    } else {
                        daysInmonth = 28;
                    }
                } else {
                    daysInmonth = 29;
                }
            } else {
                daysInmonth = 28;
            }
            return daysInmonth;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInmonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInmonth = 30;
                break;
        }
        return daysInmonth;
    }


}
