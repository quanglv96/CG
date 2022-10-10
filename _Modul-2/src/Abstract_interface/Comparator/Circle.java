package Abstract_interface.Comparator;

public class Circle {
    private  boolean filled;
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Circle with radius= " + getRadius() + ", color= " + getColor() + " and area=  " + getArea();
    }
}