package OOP_java;
public class Fan {
    int speed;
    boolean onoff;
    double radius;
    String color;
    public Fan(int speed, boolean onoff, double radius, String color){
        this.speed=speed;
        this.onoff=onoff;
        this.radius=radius;
        this.color=color;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOnoff(){
        return this.onoff;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void getShow(){
        if(this.onoff){
            System.out.println("Speed: "+this.getSpeed());
            System.out.println("Coler: "+this.getColor());
            System.out.println("Radius: "+this.getRadius());
            System.out.println("Fan is on");
        }else{
            System.out.println("Coler: "+this.getColor());
            System.out.println("Radius: "+this.getRadius());
            System.out.println("Fan is off");
        }
    }
    public static void main(String[] args) {
        final int slow=1;// khai báo hằng
        final int medium=2;
        final int fast=3;
        Fan Fan1=new Fan(fast,true,10, "Yellow");
        Fan Fan2=new Fan(medium,false,5, "Blue");
        System.out.println(" Fan 1:");
        Fan1.getShow();
        System.out.println(" Fan 2:");
        Fan2.getShow();
    }
}
