package Array;

import java.lang.Math;
import java.util.Scanner;

public class Max_array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        int max = arr[0][0];
        String show= checkmax(max, arr);
        System.out.println(show);
    }

    public static String checkmax(int max, int[][] arr) {
        int A=0;
        int B=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(arr[i][j]>max){
                   A=i;
                   B=j;
                   max=arr[i][j];
               }
            }
        }
        return  "giá trị lớn nhất trong mảng là: "+max+" nằm ở hàng: "+A+" cột "+B;

    }
}
