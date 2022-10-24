package BinaryFile.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ProductManager {
    Scanner input=new Scanner(System.in);
    public void writeToFile(String path, List<Product> listProduct) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Product product : listProduct) {

                oos.writeObject(product);
            }
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void demo(String path) {
        try {
            FileInputStream fos = new FileInputStream(path);
            ObjectInputStream oos = new ObjectInputStream(fos);
            System.out.println(oos.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> removeID(String idDel, List<Product> listProduct) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (idDel == listProduct.get(i).getId()) {
                listProduct.remove(i);
            }
        }
        return listProduct;
    }
    public List<Product> editProductID(String idEdit, List<Product> listProduct) {
        int index=0;
        for (int i = 0; i < listProduct.size(); i++) {
            if (idEdit == listProduct.get(i).getId()) {
                index = i;
                break;
            }
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
        return listProduct;
    }
    public ArrayList<Product> readDataFromFile(String path){
        ArrayList<Product> listProduct=new ArrayList<>();
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
