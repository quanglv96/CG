package Array;

import java.util.Scanner;

public class Convert_C_F {
    public static void main(String[] args) {
        System.out.println(" Chương trình chuyển đổi Nhiệt");
        Scanner input=new Scanner(System.in);
        double numC;
        double numF;
        int choice=-1;
        while (choice!=3){
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Chuyển độ F sang độ C:");
                    numF=input.nextInt();
                    numC=convert(0,numF);
                    System.out.println(numF+" độ F bằng: "+numC+" độ C");
                    break;
                case 2:
                    System.out.println("Chuyển độ C sang độ F:");
                    numC=input.nextInt();
                    numF=convert(numC,0);
                    System.out.println(numC+" độ C bằng: "+numF+" độ F");
                    break;
                case 0:
                    System.out.println("Good Bye!");
                    System.exit(0);
                    break;
            }
        }
    }
    public static double convert(double numC ,double numF) {
        if(numC==0){
            numC=(5.0/9)*(numF-32);
            return numC;
        } else {
            numF=(9.0/5)*numC+32;
            return numF;
        }
    }
}
