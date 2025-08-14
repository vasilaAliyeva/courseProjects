package chapter4.packages;

public class A {

    // public - the method can be called from any class.
    // private -  the method can only be called from within the same class.
    // protected - the method can only be called from classes in the same package or subclasses.
    //default - The method can only be called from classes in the same
    //package. This one is tricky because there is no keyword for default access. You simply omit
    //the access modifier.

    public static String name;//instance variable
    public String surname;
    public static void test(){

    }
}
