package Array;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Độ dài mảng");
        int length= scanner.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Nhập phần từ thứ "+i+" của mảng ban đầu");
            int numb= scanner.nextInt();
            arr[length-1-i]=numb;
        }
        System.out.println("Mảng sau khi đảo ngược");
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
}
