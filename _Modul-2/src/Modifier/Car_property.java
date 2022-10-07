package Modifier;

public class Car_property {
    private String name,engine;
    public static int numberOfCars;
    public Car_property(String name, String engine){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car_property car1=new Car_property("Mazda 3","Skyactiv 3");
//        System.out.println(Car_property.numberOfCars);
        System.out.println(car1.numberOfCars);
        Car_property car2=new Car_property("Mazda 6","Skyactiv 6");
//        System.out.println(Car_property.numberOfCars);
        System.out.println(car2.numberOfCars);
    }
}
