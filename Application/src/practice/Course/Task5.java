package practice.Course;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args){
        System.out.println("Ayin nomresini daxil edin : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        fesil(month);

    }

    public static void fesil(int num){
        switch (num){
            case 12:
                System.out.println("Qis");
                break;
            case 1:
                System.out.println("Qis");
                break;
            case 2:
                System.out.println("Qis");
                break;
            case 3:
                System.out.println("Yaz");
                break;
            case 4:
                System.out.println("Yaz");
                break;
            case 5:
                System.out.println("Yaz");
                break;
            case 6:
                System.out.println("Yay");
                break;
            case 7:
                System.out.println("Yay");
                break;
            case 8:
                System.out.println("Yay");
                break;
            case 9:
                System.out.println("payiz");
                break;
            case 10:
                System.out.println("payiz");
                break;
            case 11:
                System.out.println("payiz");
                break;
            default:
                System.out.println("Bele bir ay yoxdur");
        }

    }
}
