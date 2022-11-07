package caseStudyModul2;

import java.io.Serializable;

public class AccountUser implements Serializable {
    private String userName;
    private String password;
    private String fullName;
    private String phonenumber;
    private boolean online=false;
    private boolean look=false;

    public AccountUser() {
    }

    public AccountUser(String userName, String password, String fullName, String phonenumber,boolean online,boolean look) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phonenumber = phonenumber;
        this.online=online;
        this.look=look;
    }

    public boolean isLook() {
        return look;
    }

    public void setLook(boolean look) {
        this.look = look;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String toString(){
        return "User "+getUserName()+ ", Full Name: "+getFullName()+", Phone number "+getPhonenumber();
    }
}
