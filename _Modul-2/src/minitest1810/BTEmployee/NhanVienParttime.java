package minitest1810.BTEmployee;

public class NhanVienParttime extends NhanVien {
    private double time;

    public NhanVienParttime() {
    }

    public NhanVienParttime(double time) {
        this.time = time;
    }

    public NhanVienParttime(String id, String name, int age, String tel, String email, double time) {
        super(id, name, age, tel, email);
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
    public double gross(){
        return getTime()*100000;
    }
}
