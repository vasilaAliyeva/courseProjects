package chapter5.abstr;

public interface intr1 {

    //field public  static final olur
    //ve butun deyisenler ele yerindece initialize olmalidi
    // finaldi deye default deeyeri yoxdu, classda da static deyerleri static blok vasitesiler
    default void runInter(){
        System.out.println("run intr3");
    }
//override edile bilen methods -> virtual method
}
