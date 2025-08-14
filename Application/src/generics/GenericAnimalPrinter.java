package generics;

public class GenericAnimalPrinter<K, T extends Animal & Printable> { //birinci class name sonrakilar interface name olmalidi
    T value;
    K key;

    public GenericAnimalPrinter(K key, T value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.println(key + " " + value);
    }
}
