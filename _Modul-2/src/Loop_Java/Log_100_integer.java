package Loop_Java;

import java.util.Scanner;

public class Log_100_integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=2;i<number;i++) {
            int n=0;
            for(int j=2;j<=(i/2);j++){
                if(i%j==0){
                    n++;
                    break;
                }
            }
            if(n==0){
                System.out.println(i);
            }
        }
    }
}
