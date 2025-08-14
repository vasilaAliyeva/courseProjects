package practice.Course;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin: ");
        int num1 = sc.nextInt();
        System.out.println("Ikinci ededi daxil edin: ");
        int num2 = sc.nextInt();

        System.out.println("Boyuk olan eded: " + compare(num1, num2));

    }

    public static int compare(int a, int b) {
        if (a > b) {
            return a;
        } else return b;
    }
}
