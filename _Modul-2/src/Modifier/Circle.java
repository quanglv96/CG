package Modifier;

public class Cricle {
    private double radius=1.0;
    private String color="red";
    private Cricle(){}
    private Cricle(double radius){
        this.radius=radius;
    }
public void setRadius(double radius){
        this.radius=radius;
}
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius;
    }
    public static void main(String[] args) {
        Cricle cricle=new Cricle();
        cricle.setRadius(5);
        cricle.getRadius();
        System.out.println(cricle.getArea());
    }
}
