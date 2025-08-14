package practice.oca;

import java.util.Scanner;

public class OCA {

//    static double d = 9.6;

    // while
    //for each
    //do
    // for

    static int duration;

    String name = "Bu xanada qrupunun adi olmalidir";

    //static olanda hemise en sonuncu nedise onu goturur yeni obejctin olmur artiq

    public static void main(String[] args) {

//        System.out.println(d);

//
//        duration = 5;
//        duration = 6;
//
//        System.out.println(duration);
//
//        OCA oca42 = new OCA();
//        System.out.println(oca42.name);
//        oca42.name = "OCA42";
//
//
//        OCA oca43 = new OCA();
//        System.out.println(oca43.name);
//        oca43.name = "OCA43";
//
//        System.out.println("oca42 name is " + oca42.name);
//        System.out.println("oca43 name is " + oca43.name);

//        chooseOne(9);
//        forExample();

        chooseOne(2);

        forEachExample();

    }

    public static void chooseOne(int value) {

        String response = (value == 2 || value == 9) ? "case2" : "else";

        String response2 = (value >= 5) ? value < 10 ? "less than 10" : "greater than 10" : "else";

        System.out.println(response);
        System.out.println(response2);

//        if (getFirstOption(value)) {
//            // method
//
//            System.out.println("case1");
//        } else if (value == 2) {
//            //method
//
//            System.out.println("case2");
//        } else {
//            //method
//            System.out.println("one case");
//        }



        //KONKRET EDEDI YOXLUYUR
        // DOUBLE VE BOOLEAN QEBUL ELEMIR
        switch (value) {
            default:
                System.out.println("else");
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case2");
                break;
            case 3:
                System.out.println("case3");
            case 4:
                System.out.println("case 4");


                // default en yuxarida olmasina baxmayaraq en axirda yoxlanilir

        }

    }

    public static boolean getFirstOption(int value) {
        return true;
    }

    public static void forExample() {

        //initialization, condition, update

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


    }

//TRUE
    public static void whileExample() {
        int counter = 0;

        while (counter < 100) {

            System.out.println(counter);

            if (counter != 0 && counter % 3 == 0) {
                break;
            }

            counter++;
        }
        do {
            System.out.println(counter);
            counter++;
        } while (counter < 100);

        // do while ensures that we have at least 1 action done even though it is not true

    }

    public static void forEachExample() {

        int[] arr = new int[10];
        arr[4] = 857;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(arr[i]);
//
//        }

        for (int element : arr) {

            if(element == 857){
                break;
            }
            System.out.println(element);
        }

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = 0;

        if(number1==number2 && number2== ++number3){
            System.out.println("if serrti odenir");
        }

        System.out.println(number3);
    }

}
