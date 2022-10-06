package Array;

import java.util.Scanner;

public class Add_value {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Thêm phần tử 'X' vào vị trí 'n':");
        System.out.println("Phần tử 'X':");
        int numX = input.nextInt();
        System.out.println("Vị trí thêm phần tử " + numX + "(0 =< n <= " + (arr.length - 1) + ")");
        int n = input.nextInt();
        if (n < arr.length) {
            add(numX, n, arr);
            for(int i=0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        } else {
            System.out.println("vui lòng nhập giá trị 'n' nhỏ hơn : " + (arr.length - 1));
        }
    }
    public static int[] add(int numX, int n, int[] arr) {
        int count=1;
        for(int i=(arr.length-1);i>=0;i--){
            if(i==n){
                arr[i]=numX;
                count--;
                continue;
            }
            arr[i] = arr[i - count];
        }
        return arr;
    }
}
