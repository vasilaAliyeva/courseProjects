package OOP;

public class Manager extends Employee {

    public Manager(String name, int salary) {
        this.name=name;
        this.salary=salary;
    }


    @Override
    public int calculateBonus() {
        return salary * 30 / 100;
    }
}
