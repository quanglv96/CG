package Loop_Java;

import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();

        if(number<=2){
            System.out.println(number+" là số nguyên tố");
        }else {
            int count=0;
            for(int i=2;i<=Math.sqrt(number);i++){
               if(number%i==0){
                   count=1;
                   break;
               }
            }
            if(count>0){
                System.out.println(number+" Không phải số nguyên tố");
            }else {
                System.out.println(number+" là số nguyên tố");
            }
        }
    }
}
