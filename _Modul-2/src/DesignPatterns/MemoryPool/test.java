package DesignPatterns.MemoryPool;

public class test {
    public static void main(String[] args) {
        Gun gun=new Gun();
        System.out.println("Start");
        gun.fire();
        System.out.println("Game over");
        System.out.println("Tocal bullet created: " + Bullet.count);
    }
}
