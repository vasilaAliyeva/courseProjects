package OOP;

public class Developer extends Employee{

    public Developer(String name, int salary) {
        this.name=name;
        this.salary=salary;
    }

    @Override
    public int calculateBonus() {
        return salary* 20 /100;

    }
}
