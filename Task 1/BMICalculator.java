import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Input height in m: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI is: %.2f\n", bmi);

    }
}
