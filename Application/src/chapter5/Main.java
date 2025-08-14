package chapter5;

import practice.oca.Test;

public class Main {
    public static void main(String[] args) {
//        Animal dog1 = new Dog();
//
//        Super2 dog2 = new Dog();
//        Super2 cat1 = new Cat();
//
//        Dog dog3 = new Dog();
//
//        Animal dog4 = new Super2();
//
//
////        Animal animal  = new Super2();
//
//        Dog d = (Dog) dog2; // supe yazmisiq deye tipi deqiq bile bilmir
//
////        Dog d2 = (Dog) cat1; //compile error vermir amma runtime errordu cunki cat instance dogda saxlamaq olmaz
//
//        Super2 w = (Super2) dog1;
//
//        //  Dog dd =(Dog) dog4; //runtime error


        Dog dog = new Dog("toplan");
        dog.eat();
        A a = new A();
        a.printing();
        AbstractTest abstractTest = new AbstractTest() {
            @Override
            public String print(int length) {
                return "printing";
            }
            @Override
            public String run(int length) {
                return "running";
            }
        };
        abstractTest.printing();

    }
}
