package chapter5;

public class Dog extends Animal {
String name;
//    public Dog() {
//        this(5); //conxtructor cagiririq, constructor chain from overriden constructor ve ilkk linede olmalidi

    ////        super(); bu da animal classdan olan constructor goturur, yazsaq da var yazamasaq da
//
//        System.out.println(this.name); //instance yuxardaki
//        System.out.println("Dog constructor");
//    }
//    public Dog(int age) {
//
//        System.out.println("Dog constructor");
//    }

    static {
        System.out.println("dog static");
    }

    {
        System.out.println("dog instance blok");
    }

//    public Dog() {
//        this("parent name");
////        super("default name");
//        System.out.println("Dog empty constructor");
//    }

    public Dog(String name) {
        super(name);
        this.name=name;

        System.out.println("Dog name constructor");
    }

    public void eat() {
        System.out.println(super.name + " dog eating");
    }

}
