package practice.Course;

import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;

    public static void main(String args[]) {


        Calculator calc1 = new Calculator();

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter num1 and num2");
        calc1.num1 = sc.nextInt();
        calc1.num2 = sc.nextInt();

        sc.close();


        System.out.println("Sum of the numbers: " + sum(calc1.num1, calc1.num2));
        System.out.println("Division of the numbers: " + division(calc1.num1, calc1.num2));
        System.out.println("Subtraction of the numbers: " + subtract(calc1.num1, calc1.num2));
        System.out.println("Multiplication of the numbers: " + multiply(calc1.num1, calc1.num2));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {

        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0");
            return 0; // or another default value
        }


    }


}
