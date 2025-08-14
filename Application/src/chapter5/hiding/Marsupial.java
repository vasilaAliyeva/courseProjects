package chapter5.hiding;

public class Marsupial {
    public static boolean isBiped() {
        System.out.println("super");
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}