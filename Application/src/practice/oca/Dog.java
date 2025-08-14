package practice.oca;

public class Dog extends Animal implements AnimalInterface {

    @Override
    public void run() {
        System.out.println("Dog  is running!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }

    @Override
    public void fly() {
        System.out.println("Dog cannot fly!");
    }
}
