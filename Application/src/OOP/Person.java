package OOP;

import java.util.Objects;

public class Person {

    public String name;
    public int age;
    public String pin;

    public Person(String name, int age, String pin) {
        this.name=name;
        this.age=age;
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(pin, person.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pin);
    }
}
