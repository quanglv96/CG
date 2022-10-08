package Extends;

import javafx.scene.shape.Circle;

import java.lang.String;

public class Shape {
    public String color = "green";
    public boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {// get kiểu boolean
        return filled;
    }

    @Override // ghi đè to String()
    public String toString() {
        return "A Shape with color of " + this.getColor() + " and " + this.getClass();
    }

    //taoaoj lớp con Cricle
    public class Circle extends Shape {
        private double radius = 1.0;
        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(String color, boolean filled, double radius) {
            super(color, filled);// thuộc tính lấy từ lớp cha ghi liền
            this.radius = radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString() {
            return "A Circle with radius="
                    + this.getRadius()
                    + ", which is a subclass of "
                    + super.toString();
        }
    }

    // tạo lớp Rectangle có lớp con square
    public class Ractangle extends Shape {
        private double width = 1.0;
        private double height = 1.0;

        public Ractangle() {
        }

        public Ractangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public Ractangle(String color, boolean filled, double width, double height) {
            super(color, filled);
            this.width = width;
            this.height = height;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getWidth() {
            return this.width;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getHeight() {
            return this.height;
        }

        public double getArea() {
            return width * this.height;
        }

        public double getPerimeter() {
            return 2 * (width + this.height);
        }

        public String toString() {
            return "A Rectangle with width= " + this.width + " and length= " + this.height + ", which is a subclass of " + Shape.this.toString();
        }

        public class Square extends Ractangle {
            double side;

            public Square() {
            }

            public Square(double side) {
                super(side, side);
            }

            public Square(String color, boolean filled, double side) {
                super(color, filled, side, side);
            }

            public double getSide() {
                return getWidth();
            }

            public void setSide(double side) {
                setWidth(side);
                setHeight(side);
            }

            @Override
            public void setWidth(double width) {
                setSide(width);
            }

            @Override
            public void setHeight(double height) {
                setSide(height);
            }

            @Override
            public String toString() {
                return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString();
            }
        }
    }
// shape test
//    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//        shape = new Shape("red", false);
//        System.out.println(shape);
//    }

    // class test shape
    public void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle( "indigo", false,3.5);
        System.out.println(circle);
    }
}


