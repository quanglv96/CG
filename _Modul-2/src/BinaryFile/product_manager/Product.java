package BinaryFile.product_manager;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private  String name;
    private  String company;
    private double price;
    private String info;
    public Product(){
    }

    public Product(String id, String name, String company, double price, String info) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
        this.info = info;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public String toString(){
        return "Product{ id: "+getId()+", Name: "+getName()+", Company: "+getCompany()+", Price: "+getPrice()+", Info: "+getInfo()+" }";
    }
}
