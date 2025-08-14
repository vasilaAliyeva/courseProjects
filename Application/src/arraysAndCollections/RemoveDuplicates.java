package arraysAndCollections;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("List without duplicates:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
