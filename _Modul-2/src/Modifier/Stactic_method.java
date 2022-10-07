package Modifier;

public class Stactic_method {
        private int rollno;
        private String name;
        private static String college = " ";
        Stactic_method(int r, String n){
            rollno=r;
            name=n;
        }
        static void change(){
            college="CODEGYM";
        }
        void display(){
            System.out.println(rollno+" "+name+" "+college);
        }

    public static void main(String[] args) {
        Stactic_method.change();
        Stactic_method s1=new Stactic_method(111,"Hoang");
        Stactic_method s2=new Stactic_method(222,"Khanh");
        Stactic_method s3=new Stactic_method(333,"Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
