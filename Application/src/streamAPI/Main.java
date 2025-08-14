package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    //stream yaratmaq ucun setden istifade ede bilerik stream vasitesi - collectionlarla ishleyirik esasen
    //ile function interfacelerin boze veridyi  funksionalliq
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

//        List<String> filtered = Collections.emptyList();
//
//        for (String name : names) {
//            if (name.startsWith("A")) ;
//            {
//                System.out.println(name);
//                filtered.add(name);
//            }
//        }

//        Set<String> collect = names.stream()// create new Stream
//                .filter(name -> name.length()>3) //filter or manipulate -> intermediate,
//                .map(name-> name.substring(0, 3) // istediyimiz seyi return ede bilerik - bir melumat tipinden o birine kecmek
//                .collect(Collectors.toSet());//get results -> terminal
//                .forEach(System.out::println); //get results -> terminal
        //intermediate operators - lazy
        //terminal operators
    }
}
record User(String name){
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}


//filter - predicate
//map function - bi tipden bashqa tipe
//flatMap function - ic ice structuru duzlesdirir
//distinct
//sorted()
//limit