package generics;

public class Animal implements Printable {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public String getInstance() {
        return "test";
    }
}
