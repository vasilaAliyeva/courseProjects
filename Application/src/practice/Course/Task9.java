package practice.Course;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin: ");
        int num1 = sc.nextInt();
        System.out.println("Ikinci ededi daxil edin:");
        int num2 = sc.nextInt();
        System.out.println("Ucuncu ededi daxil edin: ");
        int num3 = sc.nextInt();
        System.out.println("Dorduncu ededi daxil edin: ");
        int num4 = sc.nextInt();

        System.out.println("En boyuk eded: " + findMax(num1, num2, num3, num4));

    }

    public static int findMax(int a, int b, int c, int d) {
        int max;

        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (b >= a && b >= c && b >= d) {
            max = b;
        } else if (c >= a && c >= b && c >= d) {
            max = c;
        } else {
            max = d;
        }

        return max;
    }

}
