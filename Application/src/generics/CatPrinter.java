package generics;

public class CatPrinter {
    public Cat cat;

    public CatPrinter(Cat cat) {
        this.cat = cat;
    }

    public void print() {
        System.out.println("name of cat is " + cat.name);
    }
}
