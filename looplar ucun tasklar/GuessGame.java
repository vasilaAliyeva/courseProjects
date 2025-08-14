import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(10) + 1;
        int guess;

        do {
            System.out.print("1-10 arasi ededi tapin: ");
            guess = scanner.nextInt();
        } while (guess != secret);

        System.out.println("Tebrikler! Dogru tapdiniz.");
    }
}
