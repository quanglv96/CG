package String.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClasse {
    private static final String NameClass_REGEX ="^[C|A|P][0-9]{4}[G|H|I|K|L|M]$";
    public ValidateClasse() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NameClass_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
