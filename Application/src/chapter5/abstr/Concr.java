package chapter5.abstr;

public class Concr extends B implements intr1, intr2{
    //    @Override
    //    public void run() {
    //        intr1.super.run();
    //    }

    //abstract methodu ilk override eleyen class
    @Override
    public void runInter() {
        System.out.println(" my run");
    }

    @Override
    public void run() {

    }
}
