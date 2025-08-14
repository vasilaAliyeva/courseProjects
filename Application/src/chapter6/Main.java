package chapter6;

    //generic, nested class

public class Main {
    public static void main(String[] args) {
        Main main = new Main();


        try {
            main.printUpperCase(null); //null gonderende exception

        } catch (NullPointerException n) {
            System.out.println("Null Pointer Exception");
            n.getMessage();
        } catch (Exception e) {//runtime - unchecked
            System.out.println("unknown exception");
//            main.printUpperCase("alternative keyword");
            e.printStackTrace();
        } catch (Throwable t) {//parent
            System.out.println("unknown throwable");
        }
    }

    //throwable - checked exception
    public void printUpperCase(String s) throws RuntimeException { //yazsaq da yazmasaq da throw olunur amma kinda hintdi
    //        throw new Throwable();
    //        System.out.println(s.toUpperCase());
    //        try {
    //            System.out.println(s.toUpperCase());
    //        } catch (NullPointerException e) {
    //            e.getMessage();
    //            throw new CustomValidationException("CustomValidationException");
    //        }

        //parseint, valueof
//        System.out.println(Integer.valueOf("3_8"));

        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("first catch");
            throw new RuntimeException("first");
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            System.out.println("finally");
            throw new RuntimeException("final");
            //son msj, sessionlari close elemek ucun
        }


    }

    public void printSafeLowerCase(String s) {
        if (s != null && s.length() > 0) {
            System.out.println(s.toLowerCase());
        } else {
            System.out.println("NULL OR EMPTY STRING");
        }
    }
}

        /*
        Runtime Exceptions
         Runtime exceptions extend RuntimeException. They don’t have to be handled or declared.
        They can be thrown by the programmer or by the JVM. Common runtime exceptions
        include the following:
         ArithmeticException -  Thrown by the JVM when code attempts to divide by zero
         ArrayIndexOutOfBoundsException - Thrown by the JVM when code uses an illegal
        index to access an array
         ClassCastException - Thrown by the JVM when an attempt is made to cast an excep
        tion to a subclass of which it is not an instance
         IllegalArgumentException - Thrown by the programmer to indicate that a method has
        been passed an illegal or inappropriate argument
         NullPointerException -  Thrown by the JVM when there is a null reference where an
        object is required
         NumberFormatException - Thrown by the programmer when an attempt is made to con
        vert a string to a numeric type but the string doesn’t have an appropriate format
         */
