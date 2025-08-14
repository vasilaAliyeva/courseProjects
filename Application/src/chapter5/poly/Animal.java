package chapter5.poly;

public class Animal implements Printable {
    String name;
    String type;

    @Override
    public void print() {
        System.out.println(" name " + name + " type" + type);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
