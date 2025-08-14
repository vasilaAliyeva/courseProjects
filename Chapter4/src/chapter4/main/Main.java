package chapter4.main;

import chapter4.encapsulation.User;
import chapter4.packages.A;

import java.util.ArrayList;

import static chapter4.packages.A.*;
//static import olanda class static olan her seyi birbasha yaza bilerik class.method() yox birbahsa method() kimi

public class Main {
    public static void main(String[] args) {
//        A a = new A();
//        System.out.println(a.name);
//        test();
//        System.out.println(name);
//
//        fly(null); //AUTOBOXING INT TO INTEGER
//        //primitive tipi onun wrapper class ile deyisirik

//        User user = new User();
//        System.out.println(user.getName());

//        Printable printable = new Printable() {
//            @Override
//            public void print() {
//                System.out.println("This is printable implementation!");
//            }
//        };
        //ANONYMOUS CLASS - SANKI HER HANSI BIR CLASS EXTENDS ELIYIB
//        printable.print();


        //sadece 1 abstract methodu olan interace functional interface adlanir ve implementasiyasin istedyimiz kimi ede bilerik
        Printable printable = (s) -> {
//            System.out.println("This is printable implementation!" + s);
//            return true;
            return s.length() > 0;
        };
        boolean print = printable.print(" test");
        System.out.println(print);

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Hello");
        objects.add("World");
        //predicate - functional interface
        //consumer
        //
        objects.removeIf((items) -> items.equals("Hello")); //eslinde bu return statement ile gedir
    }

    public static void fly(Integer a) {
        int b = a; // Unboxing
        System.out.println(a);
    }
}
