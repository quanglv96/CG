package Array;

import java.util.Scanner;
import java.lang.Math;

public class Concat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Gộp 2 mảng");
        System.out.println("Số phần tử mảng 1");
        int leng1 = input.nextInt();
        int[] arr1 = new int[leng1];
        System.out.println("Mảng 1");
        for (int i = 0; i < leng1; i++) {
            arr1[i] = (int) (Math.random() * 10 + 1);
            System.out.print(arr1[i]+" ");
        }
        System.out.println("Số phần tử mảng 2");
        int leng2 = input.nextInt();
        int[] arr2 = new int[leng2];
        System.out.println("Mảng 2");
        for (int i = 0; i < leng2; i++) {
            arr2[i] = (int) (Math.random() * 10 + 1);
            System.out.print(arr2[i]+" ");
        }
        System.out.println("Mảng 3(gộp mảng 1 và 2):");
        int sum=leng1+leng2;
        int[] arr3=new int[sum];
            for(int i=0;i<leng1;i++){
                arr3[i]=arr1[i];
                System.out.print(arr3[i]+" ");
            }
            for(int i=leng1;i<sum;i++){
                arr3[i]=arr2[i-leng1];
                System.out.print(arr3[i]+" ");
            }
        // gộp
    }
}
