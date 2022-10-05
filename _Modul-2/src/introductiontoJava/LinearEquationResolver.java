package introductiontoJava;
import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("LinearEquationResolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if(a==0){
            if(b==c){
                System.out.println("Phương trình đúng với mọi x");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            double answer=(c-b)/a;
            System.out.println("Phương trình có nghiệm là: "+ answer);
        }
    }
}
