package Abstract_interface.abs_inter;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }
    public String howToEat(){
        return "Chicken: cound be fired";
    }
}