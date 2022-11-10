package Exam;


public class Student {
    private  String id;
    private String name;
    private int age;
    private String sex;
    private String address;
    private double gpa;
    public Student(){
    }

    public Student(String id,  String name, int age, String sex, String address,double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.gpa=gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public  String toString(){
        return "Student{ID: "+getId()+", Name: "+getName()+", Age: "+getAge()+", Sex: "+getSex()+", Address: "+getAddress()+", GPA: "+getGpa()+"}";
    }
}
