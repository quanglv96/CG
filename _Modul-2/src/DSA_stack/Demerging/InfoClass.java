package DSA_stack.Demerging;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InfoClass {
    private String name;
    private String sex;
    private String birthday;
    private InfoClass[] arr;

    public InfoClass(String name, String sex, String birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String display(){
        return "Name: "+ getName()+", Sex: "+getSex()+", Birthday: "+getBirthday();
    }
    public Date birthtoDate() throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy").parse(getBirthday());
    }
}
