package minitest1810.BTInterface;

import java.util.Scanner;

public class MaterialManager {
    static int count = 0;
    static Material[] array = new  Material[count + 1];
    public MaterialManager() {
    }

    public MaterialManager(Material[] array) {
        this.array = array;
    }

    public Material[] getArray() {
        return array;
    }

    public void setArray(Material[] array) {
        this.array = array;
    }
    public void addArray() {
        Material[] newArray = new Material[count + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < count) {
                newArray[i] = array[i];
            }
        }
        setArray(newArray);
    }

    public void addProduct(Material info) {
        if (count == array.length) {
            addArray();
        }
        array[count] = info;
        count++;
    }
    public void reMake(int num) {
        Scanner input = new Scanner(System.in);
        System.out.println("ID cũ "+array[num].getId());
        System.out.println("Cập nhập ID mới:");
        String newId = input.nextLine();
        System.out.println("Tên sản phẩm cũ" + array[num].getName());
        System.out.println("Cập nhập Tên sản phẩm mới:");
        String newName = input.nextLine();
        array[num].setName(newName);
        System.out.println("Ngày sản xuất cũ" + array[num].getLocalDate());
        System.out.println("Cập ngày sản xuất mới:");
        int newLocalDate = input.nextInt();
        System.out.println("Giá cũ" + array[num].getCost());
        System.out.println("Cập nhập giá mới:");
        int newCost = input.nextInt();
        if(array[num] instanceof Meat){
            System.out.println(" Khối lượng cũ "+((Meat) array[num]).getWeight());
            double newWeight=input.nextDouble();
            array[num]= new Meat(newId,newName,newLocalDate,newCost,newWeight);
        }else {
            System.out.println(" Khối lượng cũ "+((CrispyFlour) array[num]).getQuantity());
            double newQuantity=input.nextDouble();
            array[num]= new Meat(newId,newName,newLocalDate,newCost,newQuantity);
        }
        System.out.println(" Cập nhập thành công");

    }
    public void deleteProduct(int num) {
        for (int i = num; i < array.length; i++) {
            if(i==(array.length-1)){
                array[i]=null;
            }else {
                array[i] = array[i + 1];
            }
        }
    }
    public  double subClass(String txt, int num){
        double sumCost = 0;
        if(txt=="Meat"){
            for(int i=0;i<array.length;i++){
                if(array[i] instanceof Meat){
                    sumCost+= array[i].getAmount()*((Meat) array[i]).getRealMoney(num);
                }
            }
        }else {
            for(int i=0;i<array.length;i++){
                if(array[i] instanceof CrispyFlour){
                    sumCost+= array[i].getAmount()*((CrispyFlour) array[i]).getRealMoney(num);
                }
            }
        }
        return sumCost;
    }
    public void displayProduct() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(i + ": " + array[i].toString());
            } else {
                break;
            }
        }
    }
}
