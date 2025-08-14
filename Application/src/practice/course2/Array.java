package practice.course2;

import java.util.Arrays;
import java.util.Random;

public class Array {

    //equals, toString, sort

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        changePrimitiveValue(a);
        System.out.println(a);

        int[] ededler = {1, 2, 3, 4, 5};

        changereferenceeValue(ededler);
        printArray2(ededler);

        int[] ededler2 = new int[]{10, 20, 30};
        System.out.println("original array: " + Arrays.toString(ededler2));
        int[] copy = ededler2.clone();
        System.out.println("Clone arr: " + Arrays.toString(copy));
        int copyofArray[] = ededler2;
        System.out.println("copy of array " + Arrays.toString(copyofArray));


        System.out.println("After change ------");


        ededler[0] = 1000;


        System.out.println("original array: " + Arrays.toString(ededler2));
        System.out.println("Clone arr: " + Arrays.toString(copy));
        System.out.println("copy of array " + Arrays.toString(copyofArray));

        System.out.println("------------------------");

        int arr[] = {1, 2, 3};
        System.out.println("hashcode of original array: "+arr.hashCode());

        int[] newArr = copyArray(arr);
        System.out.println("hashcode of new array: "+newArr.hashCode());
        System.out.println("cloning: "+Arrays.toString(newArr));


        int n = 4;
        int[] ededler3 = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            ededler3[i] = random.nextInt(2, 10);
        }


//        System.out.println("Ilk array for each ile");
//        printArray(ededler);
//
//        System.out.println("Ikinci array for each ile");
//        printArray(ededler2);

//        System.out.println("Ucuncu array for each ile ");
//        printArray(ededler3);
//
//
//        System.out.println("Arrays.to String ile  Ilk array");
//        System.out.println(Arrays.toString(ededler));
//
//        System.out.println("Arrays.toString ile Ikinci array ");
//        System.out.println(Arrays.toString(ededler2));
//
//        System.out.println("Arrays.toString ile Ucuncu array");
//        System.out.println(Arrays.toString(ededler3));
//
//        System.out.println("Ilk array for loop ile ");
//        printArray2(ededler);
//
//        System.out.println("Ikinci array for loop ile ");
//        printArray2(ededler2);
//
//        System.out.println("Ucuncu array for loop ile ");
//        printArray2(ededler3);

    }

    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void printArray2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void changePrimitiveValue(int a) {
        a = 7;
    }


    private static void changereferenceeValue(int[] a) {
        a[0] = -5;
    }


    private static int[] copyArray(int[] oldArr) {

        int[] newArr = new int[oldArr.length];

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        return newArr;
    }
}
