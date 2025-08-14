package Exceptiom;

public class Main {
    public static void main(String[] args) {
//        method1();

    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void method3() throws Exception {

    }
}
