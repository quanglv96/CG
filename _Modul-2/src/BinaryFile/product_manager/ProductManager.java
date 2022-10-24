package BinaryFile.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ProductManager {
    Scanner input=new Scanner(System.in);
    public void writeToFile(String path, ArrayList<Product> listProduct) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listProduct);
            oos.close();
            fos.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Product> removeID(String idDel, ArrayList<Product> listProduct) {
        int countRemove =0;
        for (int i = 0; i < listProduct.size(); i++) {
            if (Objects.equals(idDel, listProduct.get(i).getId())) {
                listProduct.remove(i);
                countRemove++;
            }
        }
        if(countRemove==0){
            System.out.println("Không tìm thấy mã sản phẩm");
        }else {
            System.out.println("Xóa thành công");
        }
        writeToFile("D:\\CG\\_Modul-2\\src\\BinaryFile\\product_manager\\ProductManager.txt", listProduct);
        return listProduct;
    }
    public ArrayList<Product> editProductID(String idEdit, ArrayList<Product> listProduct) {
        int index=0;
        int countEdit=0;
        for (int i = 0; i < listProduct.size(); i++) {
            if (idEdit == listProduct.get(i).getId()) {
                index = i;
                countEdit++;
                break;
            }
        }
        if(countEdit==0){
            System.out.println("Không tìm thấy id sản phẩm");
            return listProduct;
        }
        System.out.println("Mã sản phẩm: " + listProduct.get(index).getId());
        System.out.println("Thông tin cũ: "+listProduct.get(index).toString());
        System.out.println(" Cập nhập tên sản phẩm: ");
        String newName=input.nextLine();
        System.out.println(" Cập nhập hãng sản xuất: ");
        String newCompany=input.nextLine();
        System.out.println(" Cập nhập giá sản phẩm: ");
        double newPrice=input.nextDouble();
        System.out.println(" Cập nhập mô tả sản phẩm: ");
        String newInfo=input.nextLine();
        listProduct.set(index,new Product(idEdit,newName,newCompany,newPrice,newInfo));
        writeToFile("D:\\CG\\_Modul-2\\src\\BinaryFile\\product_manager\\ProductManager.txt", listProduct);
        return listProduct;
    }
    public ArrayList<Product> readDataFromFile(String path,ArrayList<Product> listProduct){
        writeToFile("D:\\CG\\_Modul-2\\src\\BinaryFile\\product_manager\\ProductManager.txt", listProduct);
        try{
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            listProduct= (ArrayList<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return listProduct;
    }
}
