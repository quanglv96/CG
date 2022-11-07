package caseStudyModul2;

public class Users {
    static UserBook userBook=new UserBook();
    static CheckInput checkInput =new CheckInput();
    public void users(String user) {
        int choice=-1;
        while (choice!=0){
            System.out.println("╔═══════════════════════════════════════════════════╗");
            System.out.println("║--------------->Tiệm sách Lưu Quang<---------------║");
            System.out.println("╠═══════════════════════════════════════════════════╣");
            System.out.println("╟─ 1. Đọc sách ─────────────────────────────────────╢");
            System.out.println("╟─ 2. Sách đã đọc ──────────────────────────────────╢");
            System.out.println("╟─ 3. Lọc theo thẻ loại sách ───────────────────────╢");
            System.out.println("╟─ 4. Tìm kiếm ─────────────────────────────────────╢");
            System.out.println("╟─ 5. Thông tin tài khoản ──────────────────────────╢");
            System.out.println("╟─ 6. Đổi mật khẩu ─────────────────────────────────╢");
            System.out.println("╟─ 0. Đăng xuất ────────────────────────────────────╢");
            System.out.println("╚═══════════════════════════════════════════════════╝");
            choice= checkInput.checkChoice(0,6);
            switch (choice){
                case 1:
                    System.out.println("---->Danh mục sách<----");
                    userBook.display();
                    userBook.readBook("user",user);
                    break;
                case 2:
                    userBook.historyReadBook(user);
                    break;
                case 3:
                    Admin.managerBook.sortCategory();
                    break;
                case 4:
                    userBook.search();
                    break;
                case 5:
                    System.out.println("Thông tin tài khoản");
                    int indexInfoUser=userBook.infoUser();
                    System.out.println(LoginUser.listUser.get(indexInfoUser).toString());
                    break;
                case 6:
                    System.out.println("Thay đổi mật khẩu");
                    userBook.changPasswork();
                    userBook.logOut();
                    choice=0;
                    break;
                case 0:
                    userBook.logOut();
                    break;
            }
        }
    }
}
