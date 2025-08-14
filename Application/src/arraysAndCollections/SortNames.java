package arraysAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ilaha", "Gulshan", "Vasila", "Rahima", "Laman"));

        Collections.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}