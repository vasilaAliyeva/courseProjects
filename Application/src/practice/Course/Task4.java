package practice.Course;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ededei daxil edin: ");
        int num1 = sc.nextInt();
        System.out.println("Ikinci ededi daxil edin: ");
        int num2 = sc.nextInt();
        System.out.println("Ucuncu ededi daxil edin: ");
        int num3 = sc.nextInt();

        System.out.println("En boyuk eded: " + compare(num1, num2, num3));

    }

    public static int compare(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else return c;
    }
}
