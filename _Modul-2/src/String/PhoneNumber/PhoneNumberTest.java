package String.PhoneNumber;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static  final String[] validPhone=new String[] {"(84)-(0978489648)","(08)-(0964271918)"};
    public static  final String[] invalidPhone=new String[] {"(ab)-(0978489648)","(08)-(0222222)"};

    public static void main(String[] args) {
        phoneNumber=new PhoneNumber();
        for(String number: validPhone){
            boolean isvalid= phoneNumber.phoneNumberExample(number);
            System.out.println("Phone number is "+number+" is valid "+isvalid);
        }
        for(String number: invalidPhone){
            boolean isvalid= phoneNumber.phoneNumberExample(number);
            System.out.println("Phone number is "+number+" is valid "+isvalid);
        }
    }
}
