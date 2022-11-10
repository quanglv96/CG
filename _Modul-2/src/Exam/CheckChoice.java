package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckChoice {
    public int checkChoice(int minNum, int maxNum) {
        Scanner input = new Scanner(System.in);
        int number;
        while (true) {
            String min = String.valueOf(minNum);
            String max = String.valueOf(maxNum);
            System.out.println("▶ Nhập lựa chọn của bạn:");
            String str = input.nextLine();
            Pattern pattern = Pattern.compile("[" + min + "-" + max + "]");
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                number = Integer.parseInt(str);
                break;
            } else {
                System.out.println("Lựa chọn của bạn phải từ " + minNum + "-" + maxNum + ". Vui lòng nhập lại");
            }
        }
        return number;
    }
}
