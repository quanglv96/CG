package Array;

import java.util.Scanner;
import java.lang.Math;

public class Add_point {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Nhập điểm 30 sinh viên");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();
            int[] point = new int[30];
            switch (choice) {
                case 1:
                    for (int i = 0; i < 30; i++) {
//                        point[i]=input.nextInt();
                        point[i] = (int) (Math.random() * 10 + 1);
                        System.out.println("Điểm thi của sinh viên thứ " + (i + 1) + " là: " + point[i]);
                    }
                    checkPoint(point);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void checkPoint(int[] point) {
        int count = 0;
        for (int i = 0; i < point.length; i++) {
            if (point[i] > 5) {
                count++;
            }
        }
        System.out.println(" Số sinh viên qua môn là: " + count);
    }
}
