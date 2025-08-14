package chapter5.poly;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        print(user);

        Animal animal = new Animal();
        animal.name = "tom";
        animal.type = "cat";
        print(animal);
    }

    public static void print(Printable printable) {
        printable.print();
    }
}
