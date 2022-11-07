package caseStudyModul2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ManagerBook {
    static ArrayList<Book> listBookManager = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    CheckInput checkInput=new CheckInput();

    public ArrayList<Book> writeToListManager() {
        listBookManager = RunModul2.listBook;
        WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\listBookk.text",listBookManager);
        return listBookManager;
    }

    public ArrayList<Book> createBook(String id, String nameBook, String author, String category) {

        listBookManager.add(new Book(id, nameBook, author, category));
        WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\listBookk.text", listBookManager);
        System.out.println("✅ Tạo mới thành công");
        return listBookManager;
    }

    public ArrayList<Book> removeBook() {
        System.out.println("▷ Nhập ID sách bạn muốn xóa:");
        String idDel = input.nextLine();
        int countDel = 0;
        for (int i = 0; i < listBookManager.size(); i++) {
            if (Objects.equals(idDel, listBookManager.get(i).getId())) {
                countDel++;
                System.out.println("===>Bạn chắc chắn muốn xóa id:" + listBookManager.get(i).getId());
                System.out.println("1. Đồng ý");
                System.out.println("2. Bỏ qua");
                int choice = checkInput.checkChoice(1,2);
                switch (choice) {
                    case 1:
                        listBookManager.remove(i);
                        System.out.println("✅ Xóa thành công");
                        WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\listBookk.text", listBookManager);
                        break;
                    case 2:
                        break;
                }
            }
        }
        if (countDel == 0) {
            System.out.println("Không tìm thấy id " + idDel + " trong danh mục sách");
        }
        return listBookManager;
    }

    public ArrayList<Book> updateBook() {
        System.out.println("---->Cập nhập sách theo ID<----");
        System.out.println("▷ Nhập ID sách bạn muốn cập nhập:");
        String idDel = input.nextLine();
        int countDel = 0;
        for (int i = 0; i < listBookManager.size(); i++) {
            if (Objects.equals(idDel, listBookManager.get(i).getId())) {
                countDel++;
                System.out.println("Thông tin cũ: " + listBookManager.get(i).toString());
                System.out.println("▷ Nhập id mới:");
                String newID = input.nextLine();
                System.out.println("▷ Nhập tên mới");
                String newName = input.nextLine();
                System.out.println("▷ Nhập Tác giả");
                String newAuthor = input.nextLine();
                System.out.println("▷ Nhập Thể loại sách");
                String newCategory = input.nextLine();
                listBookManager.set(i, new Book(newID, newName, newAuthor, newCategory));
                WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\listBookk.text", listBookManager);
                System.out.println("✅ Cập nhập thành công");
                System.out.println(listBookManager.get(i).toString());
                break;
            }
        }
        if (countDel == 0) {
            System.out.println("Không tìm thấy id " + idDel + " trong danh mục sách");
        }
        return listBookManager;
    }

    public void displaybook() {
        for (int i = 0; i < listBookManager.size(); i++) {
            System.out.println(listBookManager.get(i).toString());
        }
    }

    public void sortCategory() {
        System.out.println("---->Lọc sách theo thể loại<----");
        System.out.println("▷ Nhập thể loại sách bạn muốn lọc");
        int countSort = 0;
        String sort = input.nextLine();
        for (int i = 0; i < listBookManager.size(); i++) {
            if (Objects.equals(sort, listBookManager.get(i).getCategory())) {
                System.out.println(listBookManager.get(i).toString());
                countSort++;
            }
        }
        if (countSort == 0) {
            System.out.println("Không tìm thấy thể loại sách: " + sort);
        }
    }
    public void displayUser(){
        System.out.println("---->Danh sách User<----");
        ArrayList<AccountUser> listUser=new ArrayList<>();
        listUser=WriteAndReadToFile.writeToList("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text",listUser);
        for(int i=0;i< listUser.size();i++){
            System.out.println(listUser.get(i).toString()+" trạng thái online: "+listUser.get(i).isOnline()+", trạng thái tài khoản:"+listUser.get(i).isLook());
        }
    }
    public void openAcount(){
        System.out.println("▷ Nhập user bị khóa ");
        ArrayList<AccountUser> listUser=new ArrayList<>();
        listUser=WriteAndReadToFile.writeToList("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text",listUser);
        String userLook=input.nextLine();
        int count=0;
        for(int i=0;i<listUser.size();i++){
            if(Objects.equals(userLook, listUser.get(i).getUserName())){
                count++;
                System.out.println("Bạn chắc chắn muốn mở khóa cho "+userLook+"?");
                System.out.println("1. Đồng ý");
                System.out.println("2. Không");
                int choice = checkInput.checkChoice(1,2);
                switch (choice){
                    case 1:
                        listUser.get(i).setLook(false);
                        WriteAndReadToFile.writeFile("D:\\CG\\_Modul-2\\src\\caseStudyModul2\\accountUser.text", listUser);
                        System.out.println("✅ Mở khóa thành công");
                        break;
                    case 2:
                        break;
                }
                break;
            }
        }
        if(count==0){
            System.out.println("Không tim thấy "+userLook);
        }
    }
}
