package collectionFramework.arrayLinkedList;


import java.util.*;

public class test {
    static ArrayList<Product> product = new ArrayList<>();
    static Map<String, Integer> hashMapID =new HashMap<>();
    static int count=0;
    public static void main(String[] args) {
        System.out.println("Quản lý sản phẩm");
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo ID");
            System.out.println("3. Xóa sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("6. Sắp xếp giá tăng dần");
            System.out.println("7. Sắp xếp giá giảm dần");
            System.out.println("Nhập lựa chọn của bạn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thêm sản phẩm"+input.nextLine());
                    System.out.println("ID sản phẩm");
                    String id=input.nextLine();
                    System.out.println("Tên sản phẩm");
                    String name=input.nextLine();
                    System.out.println("Giá sản phẩm");
                    double price= input.nextDouble();
                    product.add(new Product(id,name,price));
                    System.out.println("Sản phẩm mới: "+product.get(count).toString());
                    hashMapID.put(product.get(count).getId(),count);
                    count++;
                    break;
                case 2:
                    System.out.println("Sửa thông tin sản phẩm theo ID. Nhập ID sản phẩm:"+input.nextLine());
                    String id2=input.nextLine();
                    System.out.println("Thông tin sản phẩm: "+ product.get(hashMapID.get(id2)).toString());
                    System.out.println("Cập nhập ID: ");
                    String newID=input.nextLine();
                    System.out.println("Cập nhập tên sản phẩm: ");
                    String newName=input.nextLine();
                    System.out.println("Cập nhập giá: ");
                    double newPrice=input.nextDouble();
                    System.out.println("Thông tin cập nhập:");
                    System.out.println("ID: "+newID);
                    System.out.println("Name: "+newName);
                    System.out.println("Price: "+newPrice);
                    System.out.println("1 Yes");
                    System.out.println("2 No");
                    if(input.nextInt()==1){
                        product.set(hashMapID.get(id2),new Product(newID,newName,newPrice));
                        hashMapID.put(newID,hashMapID.get(id2));
                        if(!Objects.equals(id2, newID)) {
                            hashMapID.remove(id2);
                        }
                        System.out.println("Cập nhập thành công");
                    }

                    break;
                case 3:
                    System.out.println("Xóa sản phẩm theo ID. Nhập ID cần xóa:"+input.nextLine());
                    String idDel=input.nextLine();
                    product.remove(hashMapID.get(idDel));
                    hashMapID.remove(idDel);
                    System.out.println("Xóa thành công");
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách sản phẩm");
                    for(int i=0;i<product.size();i++){
                        System.out.println(i+". "+product.get(i).toString());
                    }
                    break;
                case 5:
                    input.nextLine();
                    System.out.println("Tìm kiếm theo tên sản phẩm. Tên sản phẩm cần tìm: ");
                    String findName= input.nextLine();
                    System.out.println(findName+" tên tìm");
                    int countFindName=0;
                    for(int i=0; i<product.size();i++){
                        if(Objects.equals(findName, product.get(i).getName())){
                            countFindName++;
                            System.out.println(countFindName+". "+product.get(i).toString());
                        }
                    }
                    if(countFindName==0){
                        System.out.println("Không tìm thấy sản phẩm nào");
                    }
                    break;

                case 6:
                    System.out.println("Sắp xếp tăng dần");
                    for(int i=0;i< product.size();i++){
                        double min=product.get(i).getPrice();
                        for(int j=i;j< product.size();j++){
                            if(min > product.get(j).getPrice()){
                                Product temp= product.get(i);
                                product.set(i,product.get(j));
                                product.set(j, temp);
                            }
                        }
                    }
                    for (int i=0;i<product.size();i++){
                        System.out.println(i+", "+product.get(i).toString());
                    }
                    break;
                case 7:
                    System.out.println("Sắp xếp giảm dần");
                    for(int i=0;i< product.size();i++){
                        double max=product.get(i).getPrice();
                        for(int j=i;j< product.size();j++){
                            if(max < product.get(j).getPrice()){
                                Product temp= product.get(i);
                                product.set(i,product.get(j));
                                product.set(j, temp);
                            }
                        }
                    }
                    for (int i=0;i<product.size();i++){
                        System.out.println(i+". "+product.get(i).toString());
                    }
                    break;
            }
        }
    }

}
