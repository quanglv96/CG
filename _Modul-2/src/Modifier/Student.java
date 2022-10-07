package Modifier;

public class Student {
    private String name="Jone";
    private String classes="C02";
    public Student(){}
    public void setName( String name){
        this.name=name;
    }
    public void setClasses( String classes){
        this.classes=classes;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Quang");
        s1.setClasses("C0822I1");
        System.out.println(s1.name);
        System.out.println(s1.classes);
    }
}
