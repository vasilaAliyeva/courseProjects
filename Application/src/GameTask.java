import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameTask {

    static int point;

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        Random random = new Random();
//
//        int secret = random.nextInt(5) + 1;
//        int guess;
//        int counter = 1;
//        boolean guessed = false;
//
//           while (!guessed) {
//            System.out.print("Texmininizi daxil edin: ");
//            guess = sc.nextInt();
//
//            if (guess == secret) {
//                guessed = true;
//                if (counter == 1) {
//                    point = 100;
//                } else if (counter == 2) {
//                    point = 70;
//                } else if (counter == 3) {
//                    point = 50;
//                } else {
//                    point = 0;
//                }
//
//                System.out.println("Tebrikler dogru tapdiniz: " + secret + " | Bal: " + point);
//            } else {
//                    System.out.println("Yanlisdir");
//                counter++;
//            }
//        }


        int[] myArr = new int[3];
        int[] compArr = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            myArr[i] = random.nextInt(6) + 1;

        }
        for (int i = 0; i < 3; i++) {
            compArr[i] = random.nextInt(6) + 1;
        }
        System.out.println("Comp and users' arrays:  ");

        System.out.println("User: "+Arrays.toString(myArr));
        System.out.println("Comp: "+Arrays.toString(compArr));

if(getPoint(myArr)>getPoint(compArr)){
    System.out.println("User has won!");
    point+=100;
} else System.out.println("User has lost!");

    }

    public static int getPoint(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
