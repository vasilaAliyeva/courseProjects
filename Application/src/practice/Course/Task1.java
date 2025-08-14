package practice.Course;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Birinci ededi daxil edin: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Ikinci ededi daxil edin: ");
        int num2 = sc.nextInt();

        System.out.println("Ededlerin cemi: " + sum(num1, num2));
        System.out.println("Ededlerin ferqi: " + subtract(num1, num2));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        if (a >= b) {
            return a - b;
        } else
            return b - a;
    }


}
