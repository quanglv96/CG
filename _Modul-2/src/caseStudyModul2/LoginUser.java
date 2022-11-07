package caseStudyModul2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static caseStudyModul2.Users.userBook;


public class LoginUser {
    Scanner input = new Scanner(System.in);
    Gueѕt gueѕt=new Gueѕt();
    static ArrayList<AccountUser> listUser = new ArrayList<>();
    CheckInput checkInput = new CheckInput();
    WriteAndReadToFile writeAndReadToFile = new WriteAndReadToFile();
    Users users = new Users();

    public void register() {
        String userName;
        listUser = writeAndReadToFile.writeToList("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text", listUser);
        System.out.println("<---->Đăng kí thành viên<----");
        String fullName;
        while (true) {
            System.out.println("▷ Họ và tên");
            String strFullName = input.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+");
            Matcher matcher = pattern.matcher(strFullName);
            if (!strFullName.equals(" ")) {
                if (matcher.matches()) {
                    fullName = strFullName;
                    break;
                } else {
                    System.out.println("⛔ Không phải tên của bạn.Vui lòng nhập lại");
                }
            } else {
                System.out.println("⛔ Họ tên không được để trống. Vui lòng nhập lại");
            }
        }
        String phoneNumber;
        while (true) {
            System.out.println("▷ Số điện thoại");
            String str = input.nextLine();
            Pattern pattern = Pattern.compile("^0+[1-9]+[0-9]{8}$");
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                phoneNumber = str;
                break;
            } else {
                System.out.println("⛔ Bạn nhập vào không phải số điện thoại.Vui lòng nhập lại");
            }
        }
        while (true) {
            System.out.println("▷ Tên đăng nhập");
            userName = input.nextLine();
            int countUser = 0;
            for (int i = 0; i < listUser.size(); i++) {
                if (Objects.equals(listUser.get(i).getUserName(), userName)) {
                    System.out.println("⛔ User đã tồn tại. Vui lòng nhập Tên đăng nhập khác");
                    countUser++;
                    break;
                }
            }
            if (countUser == 0) {
                break;
            }
        }
        System.out.println("▷ Mật khẩu");
        String password = input.nextLine();
        System.out.println("1. Tạo tài khoản");
        System.out.println("2. Bỏ qua");
        int choice = checkInput.checkChoice(1, 2);
        switch (choice) {
            case 1:
                listUser.add(new AccountUser(userName, password, fullName, phoneNumber, false, false));
                WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text", listUser);
                System.out.println("✅ Tạo thành công");
                break;
            case 2:
                break;
        }
    }

    public void loginUser() {
        listUser = writeAndReadToFile.writeToList("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text", listUser);
        int count = -1;
        int number2;
        int index = 0;
        int check = 0;
        while (count != 0) {
            System.out.println("Vui lòng đăng nhập tài khoản thành viên:");
            System.out.println("▷ Tên đăng nhập:");
            String userName = input.next();
            for (int i = 0; i < listUser.size(); i++) {
                if (Objects.equals(userName, listUser.get(i).getUserName())) {
                    if (listUser.get(i).isLook()) {
                        check = -1;
                    } else {
                        check++;
                        index = i;
                    }
                    break;
                }
            }
            if (check > 0) {
                System.out.println("▷ Nhập mật khẩu:");
                if (Objects.equals(input.next(), listUser.get(index).getPassword())) {
                    listUser.get(index).setOnline(true);
                    WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text", listUser);
                    System.out.println("✋✋✋ Xin chào "+listUser.get(index).getFullName());
                    userBook.writeToList();
                    users.users(listUser.get(index).getUserName());
                    break;
                } else {
                    System.out.println("⛔ Mật khẩu sai. Quay lại với tư cách khách?");
                    System.out.println("1. Đồng ý");
                    System.out.println("2. Nhập lại");
                    number2 = checkInput.checkChoice(1, 2);
                    switch (number2) {
                        case 1:
                            gueѕt.gueѕt();
                            break;
                        case 2:
                            break;
                    }
                }
            }
            if (check == -1) {
                System.out.println("Tài khoản của bạn đang bị khóa, vui lòng liên hệ admin");
                break;
            } else {
                System.out.println("⛔ Tên đăng nhập sai. Quay lại với tư cách khách?");
                System.out.println("1. Đồng ý");
                System.out.println("2. Nhập lại");
                number2 = checkInput.checkChoice(1, 2);
                switch (number2) {
                    case 1:
                        gueѕt.gueѕt();
                        break;
                    case 2:
                        break;
                }
            }
        }
    }
}
