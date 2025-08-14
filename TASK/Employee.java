public class Employee extends AbstractPerson {
    public String position;
    public double salary;

    public Employee(String name, String surname, int age, String pin, double salary, String position) {
        super(name, surname, age, pin);

        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pin='" + pin + '\'' +
                '}';
    }
}
