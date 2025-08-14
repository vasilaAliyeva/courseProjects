package practice.oca;

public class Operators {

    // arithmetic operators (riyazi) ( + - * / %)
    //logical operators &, |, !, ^(xor)
    //relational operators


    public static void main(String[] args) {

        //ancaq her ikisi int olanda 9/2 double olacaq, eger her hansi biri double olsa kesr alaciq
//
        int a = 9;
        int b = 2;
        double c = a % b;
        System.out.println(c);


//        vurma toplamada hemse netice int olur byte ve short versiyada da
//
//        int a= 20;
//        byte b= 8;
//        byte i = (byte) (a*b);
//        System.out.println(i);
//
//        int a = 20;
//        long b = 8;
//        int c = a + (int) b;
//        System.out.println(c);

//
//        double x = 3.14;
//        float d = 3.14f;
//        float r = (float) x + d;
//        System.out.println(r);

// eger | olsa ehtiyac olmasa bele baxir, hemin ordaki ishi icra edir, || ilk olani edir vse

        if (getFirstSide() || getSecondSide()) {
            System.out.println("true");
        }


    }

    static boolean getFirstSide() {

        System.out.println("first side");
        return true;

    }
    static boolean getSecondSide() {

        System.out.println("second side");
        return true;

    }

}
