package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IntegerPrinter printer = new IntegerPrinter(10);
        printer.print();

        CatPrinter catPrinter = new CatPrinter(new Cat("tom"));
        catPrinter.print();

        GenericPrinter<Integer> intPrinter = new GenericPrinter<>(90);
        intPrinter.print();

        GenericPrinter<Cat> catPrinterGeneric = new GenericPrinter<>(new Cat("tomi"));
        catPrinterGeneric.print();

        GenericPrinter<String> stringGenericPrinter = new GenericPrinter<>("salam");
        stringGenericPrinter.print();

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("tommi"));
        cats.add(new Cat("jerry"));
        //hamisini obj elemirik cunki iterasiya edende biz ferqli seyler uzre iterasiy etmeyek
        System.out.println("-------------------------------------------------");

        GenericAnimalPrinter<String, Cat> catGenericAnimalPrinter = new GenericAnimalPrinter<>("tom", new Cat("mestan"));
        catGenericAnimalPrinter.print();
        GenericAnimalPrinter<Integer, Dog> dogGenericAnimalPrinter = new
                GenericAnimalPrinter<>(4, new Dog("toplan"));
        dogGenericAnimalPrinter.print();
        System.out.println("-------------------------------------------------");
//        printGenMethod("test", new Main());

        printGenMethod(new Cat("tom"), 7);
        printGenMethod(new Dog("toplan"), "dog");
    }

    //GENERIC METHODS
    public static <T extends Animal, K, V> V printGenMethod(T value, K value2) {
//        Animal animal = new Animal("salam");
        System.out.println(value);
        System.out.println(value2);
        return (V) value.getInstance();
    }


}
