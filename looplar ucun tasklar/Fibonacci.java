
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Daxil etdiyiniz eded ucun Fibonacci ardicilligi: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            if (i != n) {
                System.out.print(", ");
            }
            int next = a + b;
            a = b;
            b = next;
        }

    }
}
