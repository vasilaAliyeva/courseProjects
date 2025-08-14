package practice.Course;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emek haqqinizi qeyd edin: ");
        double maas = sc.nextDouble();
        System.out.println("Stajinizi qeyd edin");
        int staj = sc.nextInt();
        double artim = artim(maas, staj);
        System.out.println("Maasinizin artim ile birge neticesi: " + artim);

    }

    public static double artim(double maas, int staj) {
        if (staj >= 1 && staj <= 3) {
            maas = maas * 1.05;

        } else if (staj >= 4 && staj <= 7) {
            maas = maas * 1.1;
        } else if (staj >= 8 && staj <= 15) {
            maas = maas * 1.15;
        } else {
            maas = maas * 1.2;
        }
        return maas;
    }
}
