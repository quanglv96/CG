package minitest1810.BTInterface;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        MaterialManager materialManager=new MaterialManager();
        System.out.println(" Material Manager");
        CrispyFlour crispyFlour=new CrispyFlour();
        Meat meat=new Meat();
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Thêm vật liệu Bột Giòn");
            System.out.println("2. Thêm vật liệu Thịt");
            System.out.println("3. Chênh  lệch giá chiết khấu và không triết khấu trong ngày của Bột");
            System.out.println("4. Chênh  lệch giá chiết khấu và không triết khấu trong ngày của Thịt");
            System.out.println("5. Xóa vật liệu");
            System.out.println("6. Sửa vật liệu");
            System.out.println("7. Danh mục vật liệu ");
            System.out.println("Nhập lựa chọn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Id ");
                    String idC = input.nextLine();
                    input.nextLine();
                    System.out.println("Tên ");
                    String nameC = input.nextLine();
                    System.out.print("Ngày sản xuất ");
                    int nsxC = input.nextInt();
                    System.out.println("Ngày hết hạn " + (nsxC + 365));
                    System.out.print("Giá bán ");
                    int costC = input.nextInt();
                    System.out.println(" Khối lượng");
                    double quantity = input.nextDouble();
                    Material infoC= new CrispyFlour(idC, nameC, nsxC, costC, quantity);
                    materialManager.addProduct(infoC);
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    System.out.print("Id ");
                    String idM = input.nextLine();
                    input.nextLine();
                    System.out.println("Tên ");
                    String nameM = input.nextLine();
                    System.out.print("Ngày sản xuất ");
                    int nsxM = input.nextInt();
                    System.out.println("Ngày hết hạn " + (nsxM + 7));
                    System.out.print("Giá bán ");
                    int costM = input.nextInt();
                    System.out.println(" Khối lượng");
                    double weight = input.nextDouble();
                    Material infoM= new Meat(idM, nameM, nsxM, costM, weight);
                    materialManager.addProduct(infoM);
                    System.out.println("Thêm thành công");
                    break;
                case 3:
                    System.out.println("Còn mấy ngày nữa là đến ngày hết hạn của Bột");
                    int dateC = input.nextInt();
                    System.out.println("chiết khấu của Bột hôm nay là: "+ crispyFlour.getRealMoney(dateC));
                    System.out.println("Chênh lệch giá chiết khấu và không chiêt khấu là:");
                    System.out.println(materialManager.subClass("CrispyFlour",dateC));
                    break;
                case 4:
                    System.out.println("Còn mấy ngày nữa là đến ngày hết hạn của Bột");
                    int dateM = input.nextInt();
                    System.out.println("chiết khấu của thịt hôm nay là: "+ meat.getRealMoney(dateM));
                    System.out.println("Chênh lệch giá chiết khấu và không chiêt khấu là:");
                    System.out.println(materialManager.subClass("Meat",dateM));
                    break;
                case 5:
                    System.out.println("Bạn muốn xóa vật lệu thứ mấy?");
                    int index= input.nextInt();
                    materialManager.deleteProduct(index);
                    System.out.println("Xóa thành công");
                    break;
                case 6:
                    System.out.println("Bạn muốn sửa thông tin vật lệu thứ mấy?");
                    int in= input.nextInt();
                    materialManager.reMake(in);
                    System.out.println("Sửa thành công, thông tin đã được lưu");
                    break;
                case 7:
                    materialManager.displayProduct();
                    break;
            }
        }

    }
}
