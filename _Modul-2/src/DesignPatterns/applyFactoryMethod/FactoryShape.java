package DesignPatterns.applyFactoryMethod;

public class FactoryShape {
    public Shape getShape(String type) {
       Shape shape = new Shape();
        switch (type) {
            case "circle":
                shape= new Circle();
                break;
            case "square":
                shape= new Square();
                break;
            case "rectangle":
                shape= new Rectangle();
                break;
        }
        return shape;
    }
}
