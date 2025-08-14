package generics;

public class GenericPrinter<T> {
    T value;

    public GenericPrinter(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}
