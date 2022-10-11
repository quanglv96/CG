package Clear_code.refactoring;

import java.util.Scanner;

public class testTenisGame {
    public static int choice;
    static int[] score = {0,0};
    public static void main(String[] args) {
        System.out.println("Tenis Game");
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println(" Lượt thắng của?");
            System.out.println("1. John Win");
            System.out.println("2. Bill Win");
            System.out.println("Kết quả lượt đấu: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    score[0]+=1;
                    System.out.println("Tỷ số hiện tại: "+score[0]+"- "+score[1]);
                    showResult.Showresult();
                    break;
                case 2:
                    score[1]+=1;
                    System.out.println("Tỷ số hiện tại: "+score[0]+"- "+score[1]);
                    showResult.Showresult();
                    break;

            }
        }
    }
}
