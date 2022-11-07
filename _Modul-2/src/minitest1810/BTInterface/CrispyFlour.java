package minitest1810.BTInterface;

public class CrispyFlour extends Material implements Discount {
    private double quantity;

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, int localDate, int cost, double quantity) {
        super(id, name, localDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getExpiryDate() {
        return  this.getLocalDate() + 365;
    }
    public double getAmount(){
        double num=(double) this.getCost()*getQuantity();
        return num;
    }
    public double getRealMoney(int num){
        double discount;
        if(num<=60){
            discount=0.4;
        }else {
            if (num<=120){
                discount=0.2;
            }else {
                discount=0.05;
            }
        }
        return discount;
    }
    public String toString(){
        return super.toString()+", Quatity: "+getQuantity();
    }
}
