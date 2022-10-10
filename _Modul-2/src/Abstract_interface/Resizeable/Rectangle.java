package Abstract_interface.Resizeable;

import java.util.Scanner;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(){
//        Scanner input=new Scanner(System.in);
//        double percent= input.nextDouble();
        double percent= Math.random()+1;
        System.out.println(percent);
        setWidth( getWidth()*percent);
        System.out.println("Width afrer change"+getWidth());
        setLength(getLength()*percent);
        System.out.println("Height afrer change"+getWidth());
        System.out.println("New area: "+getArea());
    }
}