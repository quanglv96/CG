package caseStudyModul2;

import java.util.Objects;
import java.util.Scanner;

public class Admin {
    static ManagerBook managerBook = new ManagerBook();

    public void admin() {
        CheckInput checkInput =new CheckInput();
        managerBook.writeToListManager();
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("╔═══════════════════════════════════════════════════╗");
            System.out.println("║--------------->Tiệm sách Lưu Quang<---------------║");
            System.out.println("╠═══════════════════════════════════════════════════╣");
            System.out.println("╟─ [1]. Create Book ────────────────────────────────╢");
            System.out.println("╟─ [2]. Remove Book by ID ──────────────────────────╢");
            System.out.println("╟─ [3]. Update Book ────────────────────────────────╢");
            System.out.println("╟─ [4]. Display List Book ──────────────────────────╢");
            System.out.println("╟─ [5]. Sort by Category ───────────────────────────╢");
            System.out.println("╟─ [6]. Display all User ───────────────────────────╢");
            System.out.println("╟─ [7]. Open accout for User ───────────────────────╢");
            System.out.println("╟─ [0]. Về trang chủ ───────────────────────────────╢");
            System.out.println("╚═══════════════════════════════════════════════════╝");
            choice= checkInput.checkChoice(0,7);
            switch (choice) {
                case 1:
                    System.out.println("╔══════════════════╗");
                    System.out.println("╟─---->Tạo mới<----╢");
                    System.out.println("╚══════════════════╝");
                    String id;
                    while (true) {
                        System.out.println("▷ Id sách");
                        id = input.nextLine();
                        if (!Objects.equals(id, "")) {
                            int countID = 0;
                            for (int i = 0; i < ManagerBook.listBookManager.size(); i++) {
                                if (id.equals(ManagerBook.listBookManager.get(i).getId())) {
                                    countID++;
                                }
                            }
                            if (countID != 0) {
                                System.out.println("Id đã có trong danh mục. Vui lòng nhập Id khác");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Id không được để khoảng trống");
                        }

                    }
                    String nameBook;
                    while (true) {
                        System.out.println("▷ Tên sách:");
                        nameBook = input.nextLine();
                        if (!Objects.equals(nameBook, "")) {
                            int countNameBook = 0;
                            for (int i = 0; i < ManagerBook.listBookManager.size(); i++) {
                                if (nameBook.equals(ManagerBook.listBookManager.get(i).getNamebook())) {
                                    countNameBook++;
                                }
                            }
                            if (countNameBook != 0) {
                                System.out.println("Tên sách đã có trong danh mục. Kiểm tra lại tên sách");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Tên sách không được để khoảng trống");
                        }
                    }
                    String author;
                    while (true) {
                        System.out.println("▷ Tác giả:");
                        author = input.nextLine();
                        if (!Objects.equals(author, "")) {
                            break;
                        } else {
                            System.out.println("Tên tác giả không được để khoảng trống");
                        }
                    }
                    String category;
                    while (true) {
                        System.out.println("▷ Thể loại");
                        category = input.nextLine();
                        if (!Objects.equals(category, "")) {
                            break;
                        } else {
                            System.out.println("Tên tác giả không được để khoảng trống");
                        }
                    }
                    managerBook.createBook(id, nameBook, author, category);
                    break;
                case 2:
                    System.out.println("╔═══════════════════════╗");
                    System.out.println("║----->Remove Book<-----║");
                    System.out.println("╚═══════════════════════╝");
                    managerBook.removeBook();
                    break;
                case 3:
                    System.out.println("╔═══════════════════════╗");
                    System.out.println("║----->Update Book<-----║");
                    System.out.println("╚═══════════════════════╝");
                    managerBook.updateBook();
                    break;
                case 4:
                    System.out.println("╔═══════════════════════╗");
                    System.out.println("║---->Danh mục sách<----║");
                    System.out.println("╚═══════════════════════╝");
                    managerBook.displaybook();
                    break;
                case 5:
                    managerBook.sortCategory();
                    break;
                case 6:
                    managerBook.displayUser();
                    break;
                case 7:
                    managerBook.openAcount();
                    break;
                case 0:
                    break;
            }
        }
    }
}
