package Loop_Java;


import java.util.Scanner;

public class Rate_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        double money = scanner.nextDouble();// tiền gửi
        System.out.println("Nhập lãi suất(%/năm)");
        double rate = scanner.nextDouble();//  lãi suất
        System.out.println("Số tháng gửi");
        int month = scanner.nextInt();// số tháng gửi
        double interest=0.0;// tiền lãi
        for (int i = 0; i < month; i++) {
            interest += money * ((rate/100) / 12) * i;
        }
        System.out.println(interest);
    }
}
