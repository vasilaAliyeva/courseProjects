package functional;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//CONSUMER  - ACCEPT VOID, PREDICATE BOOLEAN TEST, IKISI DE CHAINING EDE BILERIK
//Supplier - consumerden ferqli olaraq nese qebul elemir amma return edir
//FUNCTION INTERFACE - APPLY - return 2nd element


public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("hello world");
        };
        runnable.run();

        System.out.println("Predicate inteface!!!!!!!!!!!!!!!!!!!!!!!!!!");
        //predicate - abstract test method boolean
        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        System.out.println(isLongerThan5.test("hello"));     //false

        Predicate<String> startsWithA = s -> s.startsWith("A");


        System.out.println("Predicate chaining!!!!!!!!!!!!!!!!!!!!!!!!!!!");//predicate chaining
        Predicate<String> valid = isLongerThan5.and(startsWithA);
        System.out.println(valid.test("Aaaaaaaa"));

        System.out.println("Consumer interface!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        // T tipinde value goturur hecne qaytarmir
        Consumer<String> printer = s -> System.out.println("Printimg: " + s);
        printer.accept("Hello");

        System.out.println("Consumer chaining!!!!!!!!!!!!!!!!!!!!!!!!!!!");//consumer chaining

        Consumer<String> afterPrint = s -> System.out.println(s.length());
        printer.andThen(afterPrint).accept("test");


        //FUNCTION INTERFACE - APPLY - return 2nd element
        System.out.println("Function Interface!!!!!!!!!!!!!!!!!!!!!!!!");
        Function<String, Integer> stringToLength = s -> s.length();
        System.out.println(stringToLength.apply("OpenAI")); //6


        //Supplier - consumerden ferqli olaraq nese qebul elemir amma return edir
        //chain yoxdu
        Supplier<String> randomId = () -> UUID.randomUUID().toString();
        System.out.println(randomId.get());

        Supplier<Integer> getUuidLength = () -> UUID.randomUUID().toString().length();
        System.out.println(getUuidLength.get());


    }

    record User(String name) {

    }

}
