package Exam;

import textFile.fileCSV.CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManager {
    static  ArrayList<Student> students = new ArrayList<>();
    static  {
        students.add(new Student("111","Quang",27,"Nam","Hà Nội",7.2));
        students.add(new Student("222","Nam",24,"Nam","Hải Phòng",8.0));
        students.add(new Student("333","Việt",25,"Nam","Hà Nội",9.0));
        students.add(new Student("444","Quân",29,"Nam","Cao Bằng",7.7));
        students.add(new Student("555","Ngạn",30,"Nam","Lào Cai",8.7));
    }
    Scanner input = new Scanner(System.in);
    CheckChoice checkChoice=new CheckChoice();

    public void displayStudent() {
        System.out.println("Danh sách sinh viên");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }

    public String addID() {
        String newID;
        while (true) {
            String str = input.nextLine();
            Pattern pattern = Pattern.compile("[1-9]{3}$");
            Matcher matcher = pattern.matcher(str);
            boolean count=false;
            if (matcher.matches()) {
                for(int i=0;i<students.size();i++){
                    if(str.equals(students.get(i).getId())){
                        count=true;
                        break;
                    }
                }
                if (count){
                    System.out.println("Mã sinh viên đã tồn tại. vui lòng nhập lại");
                }else {
                    newID = str;
                    break;
                }
            } else {
                System.out.println("Id nhập vào phải có 3 số từ 1-9. Vui lòng nhập lại");
            }
        }
        return newID;
    }
    public String addName() {
        String newName;
        while (true) {
            String str = input.nextLine();
            Pattern pattern = Pattern.compile("[a-zA-Z ]+$");
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                newName = str;
                break;
            } else {
                System.out.println("Họ và tên chỉ nhập chữ. Vui lòng nhập lại");
            }
        }
        return newName;
    }
    public int addAge() {
        int newAge;
        while (true) {
            String str = input.nextLine();
            Pattern pattern = Pattern.compile("^[1-5][0-9]$");
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                newAge = Integer.parseInt(str);
                break;
            } else {
                System.out.println("Tuổi phải từ 15- 50. Vui lòng nhập lại");
            }
        }
        return newAge;
    }
    public String addSex() {
        boolean check=false;
        String newSex = null;
        while (true) {
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            int choiceSex=checkChoice.checkChoice(1,2);
            switch (choiceSex){
                case  1:
                    check=true;
                    newSex="Nam";
                    break;
                case  2:
                    check=true;
                    newSex="Nữ";
                    break;
            }
            if(check){

                break;
            }
        }
        return newSex;
    }
    public String addAddress() {
        String newAddress;
        while (true) {
            String str = input.nextLine();
            Pattern pattern = Pattern.compile("[a-zA-Z 0-9,]+$");
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                newAddress = str;
                break;
            } else {
                System.out.println("Địa chỉ bao gồm: chữ, số, và ký tự ','. Vui lòng nhập lại");
            }
        }
        return newAddress;
    }
    public double addGPA() {
        double newGPA;
        while (true) {
            String str = input.nextLine();
            Pattern pattern = Pattern.compile("[1-9.]{3}$");
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                newGPA = Double.parseDouble(str);
                break;
            } else {
                System.out.println("Điểm trung bình là dạng 'x.x' và nhỏ hơn 10. Vui lòng nhập lại");
            }
        }
        return newGPA;
    }
    public void addNewStudent(){
        System.out.println("Thêm mới sinh viên");
        System.out.println("Thêm mới mã sinh viên sinh viên");
        String newID=addID();
        System.out.println("Thêm mới Họ tên sinh viên");
        String newName=addName();
        System.out.println("Thêm mới Tuổi sinh viên");
        int newAGE=addAge();
        System.out.println("Thêm mới Giới tính sinh viên");
        String newSex=addSex();
        System.out.println("Thêm mới Địa chỉ sinh viên");
        String newAddress=addAddress();
        System.out.println("Thêm mới Điểm trung bình sinh viên");
        double newGPA=addGPA();
        System.out.println("1. Thêm mới sinh viên");
        System.out.println("2. Bỏ qua");
        int checkADD=checkChoice.checkChoice(1,2);
        switch (checkADD){
            case 1:
                students.add(new Student(newID,newName,newAGE,newSex,newAddress,newGPA));
                System.out.println("Thêm mới sinh viên thành công");
                break;
            case 2:
                RunMain.main(new String[0]);
                break;
        }
    }
    public void updateStudent(){
        System.out.println("Cập nhập thông tin sinh viên");
        System.out.println("Nhập id sinh viên:");
        String id=input.nextLine();
        boolean flag=true;
        if(!Objects.equals(id, "")) {
            for (int i = 0; i < students.size(); i++) {
                if (Objects.equals(id, students.get(i).getId())) {
                    flag = false;
                    System.out.println("Thông tin cũ");
                    System.out.println(students.get(i).toString());
                    System.out.println("Cập nhập ID sinh viên");
                    String idUpdate = addID();
                    System.out.println("Cập nhập Tên sinh viên");
                    String nameUpdate = addName();
                    System.out.println("Cập nhập Tuổi sinh viên");
                    int ageUpdate = addAge();
                    System.out.println("Cập nhập Giới tính sinh viên");
                    String sexUpdate = addSex();
                    System.out.println("Cập nhập Địa chỉ sinh viên");
                    String addressUpdate = addAddress();
                    System.out.println("Cập nhập Điểm trung bình sinh viên");
                    double gpaUpdate = addGPA();
                    System.out.println("1. Cập nhập");
                    System.out.println("2. Bỏ qua");
                    int checkUpdate = checkChoice.checkChoice(1, 2);
                    switch (checkUpdate) {
                        case 1:
                            students.set(i, new Student(idUpdate, nameUpdate, ageUpdate, sexUpdate, addressUpdate, gpaUpdate));
                            System.out.println("Cập nhập sinh viên thành công");
                            break;
                        case 2:
                            RunMain.main(new String[0]);
                            break;
                    }
                    break;
                }
            }
            if (flag) {
                System.out.println("Không tìm thấy mã sinh viên.");
            }
        }else {
            RunMain.main(new String[0]);
        }
    }
    public void removeStudent() {
        System.out.println("Xóa sinh viên");
        System.out.println("Nhập id sinh viên:");
        String id = input.nextLine();
        boolean flag = true;
        if (!Objects.equals(id, "")) {
            for (int i = 0; i < students.size(); i++) {
                if (Objects.equals(id, students.get(i).getId())) {
                    flag = false;
                    System.out.println("1. Xóa");
                    System.out.println("2. Bỏ qua");
                    int checkUpdate = checkChoice.checkChoice(1, 2);
                    switch (checkUpdate) {
                        case 1:
                            students.remove(i);
                            System.out.println("Xóa sinh viên thành công");
                            break;
                        case 2:
                            RunMain.main(new String[0]);
                            break;
                    }
                    break;
                }
            }
            if (flag) {
                System.out.println("Không tìm thấy mã sinh viên.");
            }
        } else {
            RunMain.main(new String[0]);
        }
    }
    public void sortStudent(){
        ArrayList<Student> sort=students;
        System.out.println("Sắp xếp sinh viên theo điểm trung bình");
        System.out.println("1. Sắp xếp tăng dần");
        System.out.println("2. Sắp xếp giảm dần");
        System.out.println("3. Thoát");
        int choiceSort=checkChoice.checkChoice(1,3);
        switch (choiceSort){
            case 1:
                System.out.println("Sắp xếp tăng dần");
                for(int i=0;i<sort.size();i++){
                    double min=sort.get(i).getGpa();
                    for(int j=i;j<sort.size();j++){
                        if(min>sort.get(j).getGpa()){
                            Student temp=sort.get(i);
                            sort.set(i,sort.get(j));
                            sort.set(j,temp);
                            min=sort.get(i).getGpa();
                        }
                    }
                    System.out.println(sort.get(i).toString());
                }
                break;
            case 2:
                System.out.println("Sắp xếp giảm dần");
                for(int i=0;i<sort.size();i++){
                    double max=sort.get(i).getGpa();
                    for(int j=i;j<sort.size();j++){
                        if(max<sort.get(j).getGpa()){
                            Student temp=sort.get(i);
                            sort.set(i,sort.get(j));
                            sort.set(j,temp);
                            max=sort.get(i).getGpa();
                        }
                    }
                    System.out.println(sort.get(i).toString());
                }
                break;
            case 3:
                RunMain.main(new String[0]);
                break;
        }
    }
    public void readFile(){
        try {
            File file = new File("D:\\CG\\_Modul-2\\src\\Exam\\data\\student.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                ArrayList<String> newArr = new ArrayList<>(Arrays.asList(line.split(",")));
                System.out.println(newArr);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void writeFile(){

    }
}
