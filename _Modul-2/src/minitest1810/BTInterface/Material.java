package minitest1810.BTInterface;

public abstract class Material {
    private String id;
    private String name;
    private int localDate;
    private int cost;

    public Material() {
    }

    public Material(String id, String name, int localDate, int cost) {
        this.id = id;
        this.name = name;
        this.localDate = localDate;
        this.cost = cost;
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

    public int getLocalDate() {
        return localDate;
    }

    public void setLocalDate(int localDate) {
        this.localDate = localDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract int getExpiryDate();

    public abstract double getAmount();
    public String toString(){
        return "ID: "+getId()+", name: "+getName()+", Local Date: "+getLocalDate()+", Cost: "+getCost();
    }
}
