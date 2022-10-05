package introductiontoJava;
import java.util.Scanner;
public class day_of_month {
    public static void main(String[] args) {
        String daysInmonth;
        System.out.println("Day of Month");
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInmonth="31";
                break;
            case 2:
                daysInmonth="28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInmonth="30";
                break;
            default:
                daysInmonth="";
                break;
        }
       if(!daysInmonth.equals("")){
            System.out.println("The month "+month+" has "+daysInmonth+" days!");
       }else {
           System.out.println("Invalid inout!");
       }
    }
}
