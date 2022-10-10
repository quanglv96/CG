package Abstract_interface.Resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(){
//        Scanner input=new Scanner(System.in);
//        double percent= input.nextDouble();
        double percent= Math.random()+1;
        System.out.println(percent);
        setRadius(getRadius()*percent);
        System.out.println("Radius afrer change"+getRadius());
        System.out.println("New area: "+getArea());
    }
}
