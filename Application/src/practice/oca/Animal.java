package practice.oca;

public abstract class Animal implements AnimalInterface {

    public String name;
    public int age;


    public abstract void run();


//    public void run() {
//        System.out.println("Animal: " + name + " is running!");
//    }


    public void eat(){
        System.out.println("Animal " + name+" is eating!");
    }


}
