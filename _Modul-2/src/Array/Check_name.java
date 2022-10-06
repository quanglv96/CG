package Array;

import java.util.Scanner;

public class Check_name {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên HS muốn tìm:");
        String name= scanner.nextLine();
        int count=0;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(name)){
                System.out.println(" Vị trí: "+(i+1));
                count++;
            }
        }
        if(count==0){
            System.out.println("Không tìm thấy tên HS");
        }
    }
}
