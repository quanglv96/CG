package caseStudyModul2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static caseStudyModul2.Admin.managerBook;
import static caseStudyModul2.Users.userBook;

public class RunModul2 {
    static Users users = new Users();
    static Admin admin = new Admin();
    static LoginUser loginUser = new LoginUser();
    static ArrayList<Book> listBook = new ArrayList<>();
    private static Gueѕt gueѕt = new Gueѕt();
    static CheckInput checkInput =new CheckInput();
    static {
        listBook.add(new Book("1", "Đắc nhân tâm", "Dale Carnegie", "Giao tiếp"));
        listBook.add(new Book("2", "Từ Tốt Đến Vĩ Đại", "Jim Collins", "Quản trị"));
        listBook.add(new Book("3", "Nhà Giả Kim", "Paulo Coelho", "Văn học"));
        listBook.add(new Book("4", "Phi Lý Trí", "Dan Ariely", "Khoa học"));
        managerBook.writeToListManager();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("╔═══════════════════════════════════════════════════╗");
            System.out.println("║--------------->Tiệm sách Lưu Quang<---------------║");
            System.out.println("╠═══════════════════════════════════════════════════╣");
            System.out.println("╠->Bạn muốn truy cập vào tiệm sách với tư cách là:<-╣");
            System.out.println("╠═══════════════════════════════════════════════════╣");
            System.out.println("╟─ 1. Khách ────────────────────────────────────────╢");
            System.out.println("╟─ 2. Đăng nhập thành viên ─────────────────────────╢");
            System.out.println("╟─ 3. Đăng kí thành viên ───────────────────────────╢");
            System.out.println("╟─ 4. Quản lý ──────────────────────────────────────╢");
            System.out.println("╟─ 0. Thoát ────────────────────────────────────────╢");
            System.out.println("╚═══════════════════════════════════════════════════╝");
            choice= checkInput.checkChoice(0,4);
            int count = -1;
            switch (choice) {
                case 1:
                    userBook.writeToList();
                    gueѕt.gueѕt();
                    break;
                case 2:
                    loginUser.loginUser();
                    break;
                case 3:
                    loginUser.register();
                    break;
                case 4:
                    int number4;
                    while (count != 0) {
                        System.out.println("╔═══════════════════╗");
                        System.out.println("║ Đăng nhập quản lý ║");
                        System.out.println("╚═══════════════════╝");
                        System.out.println("▷ Tên đăng nhập:");
                        String userNameAdmin = input.next();
                        if (Objects.equals(userNameAdmin, "admin")) {
                            System.out.println("▷ Nhập mật khẩu:");
                            if (Objects.equals(input.next(), "1234")) {
                                System.out.println("Xin chào Admin");
                                admin.admin();
                                break;
                            } else {
                                System.out.println("╔═══════════════════════════════════════════╗");
                                System.out.println("║⛔Mật khẩu sai. Quay lại với tư cách Khách?║");
                                System.out.println("╠═══════════════════════════════════════════╣");
                                System.out.println("╟─ 1. Đồng ý ───────────────────────────────╢");
                                System.out.println("╟─ 2. Nhập lại ─────────────────────────────╢");
                                System.out.println("╚═══════════════════════════════════════════╝");
                                input.nextLine();
                                number4= checkInput.checkChoice(1,2);
                                switch (number4) {
                                    case 1:
                                        gueѕt.gueѕt();
                                        break;
                                    case 2:
                                        break;
                                }
                            }
                        } else {
                            System.out.println("╔═══════════════════════════════════════════╗");
                            System.out.println("║⛔Mật khẩu sai. Quay lại với tư cách Khách?║");
                            System.out.println("╠═══════════════════════════════════════════╣");
                            System.out.println("╟─ 1. Đồng ý ───────────────────────────────╢");
                            System.out.println("╟─ 2. Nhập lại ─────────────────────────────╢");
                            System.out.println("╚═══════════════════════════════════════════╝");
                            input.nextLine();
                            number4= checkInput.checkChoice(1,2);
                            switch (number4) {
                                case 1:
                                    gueѕt.gueѕt();
                                    break;
                                case 2:
                                    break;
                            }
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
