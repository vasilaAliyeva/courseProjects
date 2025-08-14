package practice.oca;

public class Cat extends Animal {


    @Override
    public void run() {
        System.out.println("Cat: " + name + " is running!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }

    @Override
    public void fly() {
        System.out.println("Cat cannot fly!");
    }
}
