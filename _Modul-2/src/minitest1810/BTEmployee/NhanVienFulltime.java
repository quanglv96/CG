package minitest1810.BTEmployee;

public class NhanVienFulltime extends NhanVien implements sumGross {
    private double bonus;
    private double fine;
    private double  salary;

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(int bonus, int fine, int salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public NhanVienFulltime(String id, String name, int age, String tel, String email, double bonus, double fine, double salary) {
        super(id, name, age, tel, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double gross(){
        return getSalary()+(getBonus()-getFine());
    }


}
