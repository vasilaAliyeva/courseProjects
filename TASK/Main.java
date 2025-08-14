import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        AbstractPerson p1 = new Employee("Vasi", "Aliyeva", 21, "12345", 1000, "Developer");
        AbstractPerson p2 = new Student("Vasila", "Aliyeva", 21, "12345", "ADA", 3.73);
        AbstractPerson p3 = new Employee("Leyla", "Khudiyeva", 28, "67890", 1200, "Manager");
        AbstractPerson p4 = new Student("Gulshan", "Mammadova", 20, "11111", "UNEC", 3.45);
        AbstractPerson p5 = new Employee("Ilaha", "Rustamova", 30, "22222", 1500, "Team Lead");
        AbstractPerson p6 = new Student("Narmin", "Karimova", 19, "67890", "BDU", 3.90);
        AbstractPerson p7 = new Employee("Farid", "Aliyev", 27, "33333", 900, "Tester");

        Set<AbstractPerson> personSet = new HashSet<>();

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);
        personSet.add(p6);
        personSet.add(p7);

        System.out.println("Set size: " + personSet.size());

        for (AbstractPerson p : personSet) {
            System.out.println(p.name + " pin: " + p.pin);
        }


        // Sort logic using custom comparator
        System.out.println("\nSorted List:");
        Set<AbstractPerson> sortedSet = new HashSet<>(personSet); // copy to preserve original
        // Convert to list for sorting
        List<AbstractPerson> sortedList = new ArrayList<>(sortedSet);
        sortedList.sort(new PersonComparator());
        for (AbstractPerson p : sortedList) {
            System.out.println(p);
        }

    }}