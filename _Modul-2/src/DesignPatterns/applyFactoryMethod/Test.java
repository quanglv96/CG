package DesignPatterns.applyFactoryMethod;

public class Test {
    public static void main(String[] args) {
        FactoryShape factoryShape=new FactoryShape();
        Shape s1= factoryShape.getShape("circle");
        System.out.println("s1 draw: "+ s1.draw());
        Shape s2= factoryShape.getShape("rectangle");
        System.out.println("s2 draw: "+ s2.draw());
        Shape s3= factoryShape.getShape("square");
        System.out.println("s3 draw: "+ s3.draw());
    }
}
