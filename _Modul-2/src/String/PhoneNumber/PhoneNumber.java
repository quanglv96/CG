package String.PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PhoneNumber_Regex="^[(]+[0-9]{2}+[)]+[-(0]+[0-9]{9}+[)]$";
    public PhoneNumber(){

    }
    public boolean phoneNumberExample(String regex){
        Pattern pattern=Pattern.compile(PhoneNumber_Regex);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}

