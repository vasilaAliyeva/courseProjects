import java.util.Objects;

public class AbstractPerson {
    public String name;
    public String surname;
    public int age;
    public String pin;

    public AbstractPerson(String name, String surname, int age, String pin) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.pin = pin;

    }

    @Override
    public String toString() {
        return "AbstractPerson{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + ", pin='" + pin + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPerson that = (AbstractPerson) o;
        return Objects.equals(pin, that.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pin);
    }
}


