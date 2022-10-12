package testing_TTD.fizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fizz Buzz");
        System.out.println("Nhập số nguyên");
        int number = input.nextInt();
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
        } else {
            if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
        System.out.println(translale(number));
    }

    public static String translale(int number){
        if(number<10){
            return text(number);
        }else {
            if(number%10==0){
                return text(number/10)+" Mươi";
            }else {
                int hangChuc=number/10;
                int hangDonVi=number-10*hangChuc;
                return text(hangChuc)+" "+ text(hangDonVi);
            }
        }
    }
    public static String text(int num) {
        String txt;
        switch (num) {
            case 1:
                txt = "Một";
                break;
            case 2:
                txt = "Hai";
                break;
            case 3:
                txt = "Ba";
                break;

            case 4:
                txt = "Bốn";
                break;
            case 5:
                txt = "Năm";
                break;

            case 6:
                txt = "Sáu";
                break;
            case 7:
                txt = "Bảy";
                break;
            case 8:
                txt = "Tám";
                break;
            case 9:
                txt = "Chín";
                break;
            default:
                txt = "";
                break;
        }
        return txt;
    }
}
