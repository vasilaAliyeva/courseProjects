package chapter5.poly;

public class User implements Printable {
    String name;
    int age;

    @Override
    public void print() {
        System.out.println("name: " + name + " age " + age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
