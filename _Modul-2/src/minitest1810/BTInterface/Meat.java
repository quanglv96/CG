package minitest1810.BTInterface;

public class Meat extends Material implements Discount {
    private double weight;
    public Meat() {
    }
    public Meat(String id, String name, int localDate, int cost, double weight) {
        super(id, name, localDate, cost);
        this.weight = weight;
    }

    public Meat(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getExpiryDate() {
        return this.getLocalDate() + 7;
    }

    public double getAmount() {
        double num = (double) this.getCost() * getWeight();
        return num;
    }
    public double getRealMoney(int num) {
        double discount;
        if (num <= 5) {
            discount = 0.4;
        } else {
            discount = 0.1;
        }
        return discount;
    }
    public String toString(){
        return super.toString()+", Quatity: "+getWeight();
    }
}
