package chapter5;

public class Animal {
    String name;

    static {
        System.out.println("animal static blok");
    }
    {
        System.out.println("animal instance blok");
    }

    public Animal() {

        System.out.println("Animal constructor bosh");
    }

    public Animal(String name) {
        this.name=name +"1";
        System.out.println("Animal constructor name");
    }


}
