package BinaryFile.product_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    static ArrayList<Product> listProduct = new ArrayList<>();
    static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        listProduct.add(new Product("1", "Xe oto", "Honda", 25, "aaa"));
        listProduct.add(new Product("2", "Xe máy", "Yamaha", 30, "bbb"));
        listProduct.add(new Product("3", "Xe đạp", "Kia", 14, "ccc"));
        Scanner input = new Scanner(System.in);
        System.out.println("Quản lý sản phẩm");
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Sửa thông tin sản phẩm");
            System.out.println("4. Hiển thị tất cả sản phẩm");
            System.out.println("5. Tìm kiếm thông tin sản phẩm");
            System.out.println("Nhập lựa chọn của bạn: ");
            switch (choice = input.nextInt()) {
                case 1:
                    input.nextLine();
                    System.out.println("Thêm sản phẩm:");
                    System.out.println("Mã sản phẩm: ");
                    String id = input.nextLine();
                    System.out.println("Tên sản phẩm:");
                    String name = input.nextLine();
                    System.out.println("Hãng sản xuất:");
                    String company = input.nextLine();
                    System.out.println("Giá sản phẩm: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    System.out.println("Thông tin khác: ");
                    String info = input.nextLine();
                    listProduct.add(new Product(id, name, company, price, info));
                    productManager.writeToFile("D:\\CG\\_Modul-2\\src\\BinaryFile\\product_manager\\ProductManager.txt", listProduct);
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Xóa sản phẩm:");
                    System.out.println(" Mã sản phẩm muốn xóa:");
                    productManager.removeID(input.nextLine(), listProduct);
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Sửa thông tin sản phẩm");
                    System.out.println("Mã sản phẩm muốn sửa:");
                    String indexEdit=input.nextLine();
                    productManager.editProductID(indexEdit, listProduct);
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("Hiển thị tất cả sản phẩm");
                    ArrayList<Product> data = productManager.readDataFromFile("D:\\CG\\_Modul-2\\src\\BinaryFile\\product_manager\\ProductManager.txt",listProduct);
                    for(Product product:data){
                        System.out.println(product);
                    }
                    break;
                case 5:

                    break;

            }
        }
    }
}
