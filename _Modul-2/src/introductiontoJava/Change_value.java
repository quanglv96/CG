package introductiontoJava;
import java.util.Scanner;
public class Change_value {
    public static void main(String[] args) {
        System.out.println("USD to VND");
        Scanner scanner=new Scanner(System.in);
        int numUSD= scanner.nextInt();
        System.out.println(numUSD+ " USD bằng "+numUSD*23000+" VND");
    }
}
