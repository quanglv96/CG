package caseStudyModul2;

import java.io.*;
import java.util.*;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class UserBook {
    CheckInput checkInput = new CheckInput();
    Scanner input = new Scanner(System.in);
    static ArrayList<AccountUser> listUser = new ArrayList<>();


    public ArrayList<Book> writeToList() {
        RunModul2.listBook = WriteAndReadToFile.writeToList("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\listBookk.text", RunModul2.listBook);
        return RunModul2.listBook;
    }

    public void display() {
        for (Book book : RunModul2.listBook) {
            System.out.println(book.toString());
        }
    }

    public void readBook(String text, String user) {
        ArrayList history = new ArrayList<>();
        System.out.println("Nhập id sách muốn đọc:");
        String idReadBook = input.nextLine();
        String pathhis = "D:\\CG\\_Modul-2\\src\\caseStudyModul2\\" + user + ".text";
        history = WriteAndReadToFile.writeToList(pathhis, history);
        int count = 0;
        for (int i = 0; i < RunModul2.listBook.size(); i++) {
            if (Objects.equals(idReadBook, RunModul2.listBook.get(i).getId())) {
                count++;
                if (!Objects.equals(text, "khach")) {
                    history.add(new HistoryUser(0, RunModul2.listBook.get(i)));
                }
                String path = "D:\\CG\\_Modul-2\\src\\caseStudyModul2\\book" + RunModul2.listBook.get(i).getId();
                NextPage(path, RunModul2.listBook.get(i), user, history);
                break;
            }
        }
        if (count == 0) {
            System.out.println("Id bạn chọn không có trong sách");
        }
    }

    public void search() {
        System.out.println("╔═══════════════════════╗");
        System.out.println("║---->Tìm kiếm sách<----║");
        System.out.println("╚═══════════════════════╝");
        int count = 0;
        while (true) {
            System.out.println("Nhập từ khóa muốn tìm: ");
            String strSearch = toUpperCase(input.nextLine());
            if (Objects.equals(strSearch, "") || Objects.equals(strSearch, " ")) {
                System.out.println("Bạn phải nhập từ khóa cần tìm kiếm");
            } else {
                for (Book book : RunModul2.listBook) {
                    String[] arr = toUpperCase(book.getNamebook()).split(" ");
                    for (String s : arr) {
                        if (Objects.equals(strSearch, s)) {
                            System.out.println(book);
                            count++;
                            break;
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("Không tìm thấy sách với từ khóa: " + strSearch);
                }
                break;
            }

        }
    }

    public void NextPage(String path, Book book, String user, ArrayList<HistoryUser> history) {
        try {
            int indexHistoryUser = 0;
            for (int i = 0; i < history.size(); i++) {
                if (Objects.equals(book.getId(), history.get(i).getIdBook())) {
                    indexHistoryUser = i;
                }
            }
            ArrayList<String> cache = new ArrayList<>();
            File file = new File(path);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                cache.add(sc.nextLine());
            }
            int choice = -1;
            int numPage = 0;

            System.out.println("---->Bạn đang đọc sách " + book.getNamebook() + "<----");
            System.out.println(cache.get(numPage));
            while (choice != 0) {
                if (numPage == 0) {
                    System.out.println("╔═════════════════════════════════════╗");
                    System.out.println("╟─ 1. Tiếp trang " + (numPage + 2)+" ───────────────────╢");
                    System.out.println("╟─ 0. Quay về trang chủ ──────────────╢");
                    System.out.println("╚═════════════════════════════════════╝");
                } else {
                    System.out.println("╔═════════════════════════════════════╗");
                    System.out.println("╟─ 1. Tiếp trang " + (numPage + 2)+" ───────────────────╢");
                    System.out.println("╟─ 2. Quay lại trang " + (numPage)+" ───────────────╢");
                    System.out.println("╟─ 0. Quay về trang chủ ──────────────╢");
                    System.out.println("╚═════════════════════════════════════╝");
                }
                choice = checkInput.checkChoice(0, 2);
                switch (choice) {
                    case 1:
                        numPage++;
                        System.out.println(cache.get(numPage));
                        break;
                    case 2:
                        numPage--;
                        System.out.println(cache.get(numPage));
                        break;
                    case 0:
                        if (!Objects.equals(user, "")) {
                            history.get(indexHistoryUser).setNumpage(numPage);
                            String pathHistory = "D:\\CG\\_Modul-2\\src\\caseStudyModul2\\" + user + ".text";
                            WriteAndReadToFile.writeFile(pathHistory, history);
                        }
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            String pathHistory = "D:\\CG\\_Modul-2\\src\\caseStudyModul2\\" + user + ".text";
            WriteAndReadToFile.writeFile(pathHistory, history);
            System.out.println("===>Sách đang cập nhập");
        }
    }

    public void historyReadBook(String user) {
        try {
            String pathHistory = "D:\\CG\\_Modul-2\\src\\caseStudyModul2\\" + user + ".text";
            ArrayList<HistoryUser> history = new ArrayList<>();
            history = WriteAndReadToFile.writeToList(pathHistory, history);
            if (history.get(0) != null) {
                System.out.println("Những sách bạn đã đọc là: ");
                for (HistoryUser book : history) {
                    System.out.println(book.getIdBook().toString());
                }
            } else {
                System.out.println("===>Bạn chưa đọc sách");
            }
        } catch (Exception e) {
            System.out.println("Bạn chưa đọc sách nào");
        }
    }

    public int infoUser() {
        listUser = WriteAndReadToFile.writeToList("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text", listUser);
        int indexInfoUser = 0;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).isOnline()) {
                indexInfoUser = i;
                break;
            }
        }
        return indexInfoUser;
    }

    public void logOut() {
        int index = infoUser();
        listUser.get(index).setOnline(false);
        WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text", listUser);
    }

    public void changPasswork() {
        int index = infoUser();
        System.out.println("Mật khẩu hiện tại");
        int checkLook = 0;
        while (true) {
            String str = input.nextLine();
            if (Objects.equals(str, listUser.get(index).getPassword())) {
                System.out.println("Mật khẩu mới");
                String newPassword = input.nextLine();
                listUser.get(index).setPassword(newPassword);
                WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text", listUser);
                System.out.println("✅ Đổi mật khẩu thành công. Vui lòng đăng nhập lại");
                break;
            } else {
                checkLook++;
                System.out.println("⛔ Mật khẩu hiện tại sai. Bạn còn " + (3 - checkLook) + " lần nhập");
            }
            if (checkLook == 3) {
                System.out.println("Tài khoản của bạn đã bị khóa. Liên hệ admin để mở lại tài khoản");
                listUser.get(index).setLook(true);
                WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text", listUser);
                break;
            }
        }
    }
}
