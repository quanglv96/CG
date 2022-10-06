package OOP_java;
import java.util.Scanner;
public class Rectangle {
    // khởi tạo contructors
    double width, height; // khai báo thuộc tính
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    // định nghĩa phương thức
    public double getArea(){// diện tích
        return this.width*this.height;
    }
    public  double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle{ width= "+width +", height= "+height+"}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("Your Retangle \n"+rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+rectangle.getArea());
    }
}
