package practice.Course;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Birinci ededi daxil edin: ");
        int num1 = sc.nextInt();
        System.out.println("Ikinci ededi daxil edin: ");
        int num2 = sc.nextInt();
        System.out.println("Simvolu daxil edin: ");

        String simvol = sc1.nextLine();

        Character ch = simvol.charAt(0);
        System.out.println(ch);

        System.out.println("Result: " + calculate(num1, num2, ch));
    }

    public static int calculate(int num1, int num2, Character simvol) {
        switch (simvol) {
            case '+':
                return num1 + num2;
            case '-':
                if (num1 > num2) {
                    return num1 - num2;
                } else return num2 - num1;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                }
            default:
                return 0000000;
        }
    }
}

