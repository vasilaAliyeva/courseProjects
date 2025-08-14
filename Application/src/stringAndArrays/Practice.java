package stringAndArrays;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        System.out.println("************************************************");

        String s = new String("Vasila");
        System.out.println(s);
        System.out.println(s.substring(0, 3).toUpperCase());
        System.out.println("**********************************************");

        String s1 = new String("    Vasila   ");
        System.out.println(s1);
        System.out.println(s1.trim().toLowerCase());
        System.out.println("**********************************************");

        String s2 = new String(" Vasila");
        System.out.println(s2.length() + " uzunlugu " + s2.toUpperCase());

        System.out.println("**********************************************");

        String s3 = new String("  Menim adim Vesiledir    ");
        System.out.println(s3);
        System.out.println(s3.replace(' ', '-'));

        System.out.println("**********************************************");

        String s4 = new String("salam");
        System.out.println(s4);
        String formatted = s4.substring(0, 1).toUpperCase() + s4.substring(1).toLowerCase();
        System.out.println(new StringBuilder(formatted).reverse().toString());

        System.out.println("**********************************************");

        Scanner sc = new Scanner(System.in);
        System.out.print("Email daxil edin: ");
        String email = sc.nextLine();

        boolean containsAt = email.contains("@");
        System.out.println("Emailde '@' var? " + containsAt);

        System.out.println("**********************************************");

        String s5 = new String("   hello   ");
        System.out.println(s5.trim().toUpperCase());
        System.out.println(s5.trim().length());

    }
}
