package Array;

import java.util.Scanner;

public class Sum_rowing_line {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Tạo mảng");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Nhập số hàng của mảng");
                    int x = input.nextInt();
                    int[][] arr = new int[x][x];
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < x; j++) {
                            arr[i][j] = (int) (Math.random() * 10 + 1);
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    sumLine(arr);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void sumLine(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng đường chéo chính của mảng là: " + sum);
    }
}
