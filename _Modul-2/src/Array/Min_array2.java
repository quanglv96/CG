package Array;

import java.util.Scanner;

public class Min_array2 {
    public static void main(String[] args) {
        int choice=-1;
        Scanner input = new Scanner(System.in);
        while (choice!=0) {
            System.out.println("Menu");
            System.out.println("1. Tạo mảng mới");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();
            switch (choice){
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
                    int min = arr[0][0];
                    String show = checkmax(min, arr);
                    System.out.println(show);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static String checkmax(int min, int[][] arr) {
        int A=0;
        int B=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min){
                    A=i;
                    B=j;
                    min=arr[i][j];
                }
            }
        }
        return  "giá trị nhỏ nhất trong mảng là: "+min+" nằm ở hàng: "+A+" cột "+B;
    }
}
