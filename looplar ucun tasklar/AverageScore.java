import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount;
        double sum = 0;
        int i = 0;

        System.out.print("Telebe sayini qeyd edin: ");
        studentCount = scanner.nextInt();

        do {
            System.out.print("Telebe " + (i + 1) + " bali: ");
            sum += scanner.nextDouble();
            i++;
        } while (i < studentCount);

        System.out.println("Orta bal: " + (sum / studentCount));
    }
}
