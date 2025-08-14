import java.util.Scanner;

public class SadeEdedler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin: ");
        int N = scanner.nextInt();

        System.out.println("1den " + N + "e qeder sade ededler:");

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }


    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
