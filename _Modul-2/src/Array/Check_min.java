package Array;

import java.util.Scanner;

public class Check_min {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Độ dài cảu mảng?");
        int length=input.nextInt();
        int[] arr= new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Nhập phần tử thứ: "+(i+1));
            arr[i]=input.nextInt();
        }
        int min=arr[0];
        int k=checkmin(min,arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+k);
    }
    public static int checkmin(int min, int[] arr) {
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
