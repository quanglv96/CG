package caseStudyModul2;

public class Gueѕt {
    UserBook userBook=new UserBook();
    public void gueѕt() {
        CheckInput checkInput =new CheckInput();
        int choice = -1;
        while (choice != 0) {
            System.out.println("╔═══════════════════════════════════════════════════╗");
            System.out.println("║--------------->Tiệm sách Lưu Quang<---------------║");
            System.out.println("╠═══════════════════════════════════════════════════╣");
            System.out.println("╟─ 1. Đọc sách ─────────────────────────────────────╢");
            System.out.println("╟─ 2. Lọc theo thẻ loại sách ───────────────────────╢");
            System.out.println("╟─ 3. Tìm kiếm ─────────────────────────────────────╢");
            System.out.println("╟─ 0. Về trang chủ ─────────────────────────────────╢");
            System.out.println("╚═══════════════════════════════════════════════════╝");
            choice= checkInput.checkChoice(0,3);
            switch (choice) {
                case 1:
                    System.out.println("╔═══════════════════════╗");
                    System.out.println("║---->Danh mục sách<----║");
                    System.out.println("╚═══════════════════════╝");
                    userBook.display();
                    userBook.readBook("khach","");
                    break;
                case 2:
                    Admin.managerBook.sortCategory();
                    break;
                case 3:
                    userBook.search();
                    break;
                case 0:
                    RunModul2.main(new String[0]);
                    break;
            }
        }
    }
}
