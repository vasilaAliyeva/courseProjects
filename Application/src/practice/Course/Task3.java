package practice.Course;

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
       System.out.println("1 ve 7 arasi eded daxil edin: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        name(num);

    }
   
    public static void name(int num){
        switch (num){
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("Cersenbe");
                break;
            case 3:
                System.out.println("Cersenbe axsami");
                break;
            case 4:
                System.out.println("Cume axsami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Senbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Bele bir gun yoxdur!");
        }
    }

}
