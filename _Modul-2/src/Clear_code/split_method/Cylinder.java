package Clear_code.split_method;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea =getbaseArea( radius) ;
        double perimeter = getPerimeter(radius);
        return perimeter * height + 2 * baseArea;
    }
    private static double getPerimeter(int radius){
        return 2 * Math.PI  * radius;
    }
    private static  double getbaseArea(int radius){
        return Math.PI * radius * radius;
    }
}
