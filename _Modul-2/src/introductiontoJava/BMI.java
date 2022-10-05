package introductiontoJava;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Body mass index-BMI");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng(ĐVT: kg):");
        double weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao(ĐVT: m):");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else {
            if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("Normail");
            } else {
                if (bmi >= 25.0 && bmi < 30.0) {
                    System.out.println("Overweight");
                } else {
                    System.out.println("Obese");
                }
            }
        }
    }
}
