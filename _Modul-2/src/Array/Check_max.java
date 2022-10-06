package Array;

import java.util.Scanner;

public class Check_max {
    public static void main(String[] args) {
        System.out.println("Tìm giá trị lớn nhất?");
        System.out.println("Nhập độ dài mảng");
        Scanner scanner=new Scanner(System.in);
        int length= scanner.nextInt();
        int[] money = new int[length];
        for(int i=0; i<length;i++){
            System.out.println("Nhập phần tử thứ: "+(i+1));
            money[i]= scanner.nextInt();
        }
        int max=money[0];
        int k= max(max, money);
        System.out.println("Giá trị lớn nhất là: "+k);
    }
    public static int max(int max, int[] money) {
        int k= max;
        for(int i=1;i< money.length;i++){
            if(money[i]>k){
                k=money[i];
            }
        }
        return k;
    }
}
