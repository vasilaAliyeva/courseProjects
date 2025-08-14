package streamAPI;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterString {
    public static List<String> names = List.of("Vasila", "Ali", "Vali", "Salam");

    public static void main(String[] args) {

        Set<String> stream = names.stream()
                .filter(names -> names.length() < 5)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(stream);

        names.stream()
                .filter(name -> name.length() < 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
