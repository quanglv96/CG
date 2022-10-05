package Loop_Java;

import java.util.Scanner;

public class Drawing_2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            String draw = "";
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            draw += "*";
                        }
                        draw += "\n";
                    }
                    System.out.println(draw);
                    break;
                case 2:
                    // tam giác vuông góc vuông: trái trên
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j < (5 - i)) {
                                draw += "*";
                                continue;
                            }
                            draw += " ";
                        }
                        draw += "\n";
                    }
                    // tam giác vuông góc vuông phải trên
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j >= i) {
                                draw += "*";
                                continue;
                            }
                            draw += " ";
                        }
                        draw += "\n";
                    }
                    // tam giac vuông góc vuông dưới trái
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j <= i) {
                                draw += "*";
                                continue;
                            }
                            draw += " ";
                        }
                        draw += "\n";
                    }
                    // tam giác vuông góc dưới phải
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j >= (5 - i - 1)) {
                                draw += "*";
                                continue;
                            }
                            draw += " ";
                        }
                        draw += "\n";
                    }
                    System.out.println(draw);
                    break;
                case 3:
                    // tam giác cân
                    for (int i = 0; i < 3; i++) {
                        int count=4/2;
                        for (int j = 0; j < 4; j++) {

                            if (j>=(count-i) && j <=(count+i)) {
                                draw += "*";
                            }
                            draw += " ";
                        }
                        draw += "\n";
                    }
                    System.out.println(draw);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
