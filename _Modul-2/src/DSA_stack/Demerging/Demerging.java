package DSA_stack.Demerging;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Demerging {
    static ArrayList<InfoClass> infoMale= new ArrayList<InfoClass>();
    static ArrayList<InfoClass> infoFemale= new ArrayList<InfoClass>();
    static ArrayList<InfoClass> infoClass= new ArrayList<InfoClass>();

    public static void main(String[] args) throws ParseException {
        Scanner input=new Scanner(System.in);
        System.out.println("Quản lý nhân sự");
        int choice=-1;
        while (choice!=0){
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. Danh sách nhân viên đã sắp xếp");
            System.out.println("Lựa chọn của bạn");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Thêm thông tin nhân viên");
                    System.out.print("Họ Tên: ");
                    System.out.println(input.nextLine());
                    String name=input.nextLine();
                    System.out.print("Giới tính: ");
                    System.out.println(" ");
                    String sex=input.nextLine();
                    System.out.print("Ngày tháng năm sinh: ");
                    String birthday=input.nextLine();
                    infoClass.add(new InfoClass(name,sex,birthday));
                    System.out.println("Thêm nhân viên thành công!");
                    break;
                case 2:
                    System.out.println("Xóa nhân viên tại vị trí:");
                    int index=input.nextInt();
                    if(index>(infoClass.size()-1)){
                        System.out.println("Không có nhân viên tại vị trí "+index);
                    }else {
                        infoClass.remove(index);
                        System.out.println("Xóa nhân viên thành công");
                    }
                    break;
                case 3:
                    System.out.println(" Sửa thông tin nhân viên thứ: ");
                    int num=input.nextInt();
                    if(num>(infoClass.size()-1)){
                        System.out.println("Không có nhân viên tại vị trí "+num);
                    }else {
                        System.out.println("Thông tin cũ:");
                        System.out.println(infoClass.get(num).display());;
                        System.out.print("Cập nhập Họ và Tên: ");
                        String newName=input.nextLine();
                        System.out.print("Cập nhập Giới tính: ");
                        String newSex=input.nextLine();
                        System.out.print("Cập nhập Ngày tháng năm sinh mới: ");
                        String newBirthday=input.nextLine();
                        infoClass.set(num,new InfoClass(newName,newSex,newBirthday));
                        System.out.println("Thông tin cập nhập thành công:");
                        System.out.println(infoClass.get(num).display());
                    }
                    break;
                case 4:
                    System.out.println("Danh sách nhân viên đã sắp xếp");
                    sortSex();

                    break;



            }
        }
    }
    public static void sortSex() throws ParseException {
        for(int i=0;i<infoClass.size();i++){
            if(Objects.equals(infoClass.get(i).getSex(), "Male")){
                infoMale.add(infoClass.get(i));
            }else {
                infoFemale.add(infoClass.get(i));
            }
        }
        sortBirth(infoMale);
        sortBirth(infoFemale);
        for(int i=0; i< infoFemale.size();i++){
            System.out.println(infoFemale.get(i).display());
        }
        for(int i=0; i< infoMale.size();i++){
            System.out.println(infoMale.get(i).display());
        }
    }
    public static void sortBirth(ArrayList<InfoClass> arr) throws ParseException {
        for(int i=0;i< arr.size();i++){
            Date min=arr.get(i).birthtoDate();
            for(int j=i;i< arr.size();i++){
                Date dateI=arr.get(j).birthtoDate();
                if(min.compareTo(dateI)>=0){
                    InfoClass temp= arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }
}
