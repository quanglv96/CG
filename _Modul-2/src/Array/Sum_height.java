package Array;

import java.util.Scanner;

public class Sum_height {
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
                    System.out.println("Nhập số cột của mảng");
                    int y = input.nextInt();
                    int[][] arr = new int[x][y];
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < y; j++) {
                            arr[i][j] = (int) (Math.random() * 10 + 1);
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println(" Tính tổng cột n: ");
                    int n = input.nextInt();
                    sumHeight(n, arr);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public static void sumHeight(int n, int[][] arr) {
        int sum=0;
        System.out.print("Các phần tử tại cột "+ n +" là: ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i][n]+" ");
            sum+=arr[i][n];
        }
        System.out.println();
        System.out.println(" Tổng giá trị cột "+n+ " là: "+sum);
    }
}
