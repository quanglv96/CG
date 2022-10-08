package Extends;

import java.lang.Math;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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

    public static class Cylinder extends Circle {
        private double height;

        public Cylinder(double height) {
            this.height = height;
        }

        public Cylinder(double radius, String color, double height) {
            super(radius, color);
            this.height = height;
        }
        public void setHeight(double height) {
            this.height = height;
        }

        public double getHeight() {
            return this.height;
        }

        public double getVolume() {// tính thể tích
            return getArea() * getHeight();
        }

        public String toString() {
            return "Cylinder with radius= " + super.getRadius() + ", height= " + getHeight() + ", color= " + super.getColor() + "and volume=  " + getVolume();
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(5, "Red",12);
        System.out.println(cylinder.toString());
    }
}
