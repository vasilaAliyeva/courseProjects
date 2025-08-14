package practice.Course;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balinizi daxil edn: ");
        double bal = sc.nextDouble();
        System.out.println("Balinizin skalada qarisiligi: " + grade(bal));
    }

    public static char grade(double bal) {

        if (bal >= 91 && bal <= 100) {
            return 'A';
        } else if (bal >= 81 && bal <= 90) {
            return 'B';
        } else if (bal >= 71 && bal <= 80) {
            return 'C';
        } else if (bal >= 61 && bal <= 70) {
            return 'D';
        } else if (bal >= 51 && bal <= 60) {
            return 'E';
        } else if (bal >= 0 && bal <= 50) {
            return 'F';
        } else return '-';

    }
}
