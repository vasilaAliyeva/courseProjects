package OOP;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void driveAbs(Drivable dr) {
        dr.drive();

    }

    public static void main(String[] args) {


        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal = new Animal();

        cat.sound();
        dog.sound();
        animal.sound();

        System.out.println("-------------------------");

        Car car = new Car();
        Truck truck = new Truck();
        car.drive();
        truck.drive();

        Drivable dr = new Car();
        driveAbs(dr);
        driveAbs(new Car());// methoddan goturduyumuz
        driveAbs(new Truck());

        System.out.println("--------------------------");

        Developer developer1 = new Developer("Vasila", 700);
        Manager manager1 = new Manager("Aytaj", 800);
        Developer developer2 = new Developer("Ayse", 900);
        Manager manager2 = new Manager("Yusif", 1000);

        System.out.println("bonus for developer 1: " + developer1.name + " is " + developer1.calculateBonus() + " and the previous salary is: " + developer1.salary);
        System.out.println("bonus for dev 2: " + developer2.name + " is " + developer2.calculateBonus() + " and the previous salary is: " + developer2.salary);
        System.out.println("bonus for manager 1: " + manager1.name + " is " + manager1.calculateBonus() + " and the previous salary is: " + manager1.salary);
        System.out.println("bonus for manager 2: " + manager2.name + " is " + manager2.calculateBonus() + " and the previous salary is: " + manager2.salary);


        System.out.println("-----------------------------");

        //PERSON TIPINDE 

        Person person = new Person("Vasi", 21, "hello");
        Person person1 = new Person("Vasila", 21, "hello");

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person);

        for (Person p : personSet) {
            System.out.println(p.name + " pin:  " + p.pin);
        }
    }
}
