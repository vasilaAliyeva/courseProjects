package practice.course2;

import java.util.Scanner;

public class EdedTesnifatcisi {

    public static void main(String[] args) {
        System.out.println("eded daxil edin: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sign(a));
        System.out.println(oddOrEven(a));
        System.out.println("eded "+ num(a)+ " elementden ibaretdir");


    }

public static String sign(int a){
        if(a> 0){
            return "eded musbetdir";
        } else if( a<0 ){
            return "eded menfidir";
        } else return "eded sifirdir";

}
    public static String oddOrEven(int a){
        if(a%2==0){
            return "Eded cutdur";
        }else
            return "eded tekdir";
    }


    public static  int num(int a){
        int counter=1;
        while (a /10!=0){
            a/=10;
            counter++;
        }
        return counter;

    }
}
