package minitest1810.BTEmployee;

public class NhanVien {
    private String id;
    private String name;
    private int age;
    private String tel;
    private String email;
    public NhanVien(){
    }
public NhanVien[] nhanViens(){
        NhanVien[] nhanViens=new NhanVien[10];
        return nhanViens;
    }
    public NhanVien(String id, String name, int age, String tel, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "ID: "+getId()+", Name: "+getName()+", Age "+getAge()+", Tel "+getTel()+", Email"+getEmail();
    }

}
