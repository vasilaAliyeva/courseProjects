package chapter5;

public abstract class AbstractTest {
    public abstract String print(int length);
    public abstract String run(int length);

    public String printing() {
        System.out.println("test printing");
        return "test";
    }

}
