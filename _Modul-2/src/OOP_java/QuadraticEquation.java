package OOP_java;

import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c; // khai báo thuộc tính

    // khởi tạo contructors
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println();
            System.out.println("Giải phương trình bậc 2 có dạng 'ax2 + bx + c = 0'");
            System.out.println("1.Giải phương trình");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị của a:");
                    double numA = input.nextDouble();
                    System.out.print("Nhập giá trị của b:");
                    double numB = input.nextDouble();
                    System.out.print("Nhập giá trị của c:");
                    double numC = input.nextDouble();
                    if (numA == 0) {
                        System.out.println("Giá trị a!=0. Vui lòng nhập lại");
                        choice = -1;
                        continue;
                    }
                    QuadraticEquation quadraticEquation = new QuadraticEquation(numA, numB, numC);
                    if (quadraticEquation.getDiscriminant() > 0) {
                        System.out.print("Phương trình có 2 nghiệm x1= " + quadraticEquation.getRoot1() + ", x2= " + quadraticEquation.getRoot2());
                    } else {
                        if (quadraticEquation.getDiscriminant() == 0) {
                            System.out.println("Phương trình có 1 nghiệm duy nhất x= " + quadraticEquation.getRoot1());
                        } else {
                            System.out.println("Phương trình vô nghiệm");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}


