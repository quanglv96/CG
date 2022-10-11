package Abstract_interface.Colorable;



public class Rectangle extends Shape implements Colorable {
    private static double width = 1.0;
    private static double length=1.0;

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

    public static double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
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
    public void howToColor(){
        System.out.println("Rectangle: Color all four sides");
    }
}