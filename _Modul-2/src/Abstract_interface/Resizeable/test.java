package Abstract_interface.Resizeable;
import java.lang.String;
public class test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.5, "indigo", false);
        shapes[1] = new Rectangle(2.5, 3.8, "orange", true);
        for(int i=0; i< shapes.length;i++){
            System.out.println(shapes[i].toString());
        }
        for(int i=0;i< shapes.length;i++){
            if(i==0) {
                Resizeable resizeable = (Circle) shapes[i];
                System.out.println(resizeable.resize());
            }else {
                Resizeable resizeable = (Rectangle) shapes[i];
                System.out.println(resizeable.resize());
            }
        }


    }

}
