package practice.oca;

import OOP.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastArrays {
    String s; //null

    public static void main(String[] args) {
//        boolean[] arrbool = new boolean[2];
//        float[] arrfloat = new float[3];
//
//
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        //finalize methodu son soz
//        System.out.println();
//
//        String[] strArr = {"1", "2", "3"};
//        System.out.println(Arrays.toString(strArr));
//
//        //binarysearch sorted uzerinde ishleyir
//        Arrays.sort(arr);
//
//        int i = Arrays.binarySearch(arr, 6);
//
//        int[] ints = Arrays.copyOf(arr, arr.length);
//        System.out.println(ints.equals(arr)); //false
//        System.out.println(Arrays.equals(arr, ints)); //false
//
//
//        int arr1[], arr2; //declaration
//
////        Person [] persons = new Person[arr.length];
////        persons[0] = new Person();
//
//      //varargs -istediyimiz qeder yaza bilirik curly braces olmadan
//
//        test("test", "test", "test");
//
//
//
//        int[] array ={1, 2, 3, 4, 5};
//        int[] array2 ={1,2, 3, 4, 5};
//
//        int compare =Arrays.compare(array, array2); //ferqe baxir birinci boyukduse 1, eynidise 0 ikinci boyukduse -1

        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.set(list.size() - 1, "test2");
        System.out.println(list.get(0) == list.get(1));//true
        System.out.println(list.get(0) == list.get(list.size() - 1));

        //eger arraylist  evvelden capacity bilsek hem tez olur bu halda linkedlist yaradiriq

        ArrayList<StringBuilder> list2 = new ArrayList(10);
        list2.add(new StringBuilder("test"));
        list2.add(new StringBuilder("test"));
        list2.add(new StringBuilder("test"));
        list2.add(new StringBuilder("test"));
        list2.add(new StringBuilder("test"));
        ArrayList list3 = new ArrayList(list2);

        list2.get(0).append(": test");
        System.out.println(list3.get(0).equals(list2.get(0)));
        System.out.println(list3.get(1).equals(list2.get(1)));

        Integer i = Integer.valueOf("086789"); //numberformat exception ola biler
        Double d = Double.valueOf("1.2");

        Integer i2 = 9; //autoboxing
        int b2 = i2; //unboxing, nullpointer exception ola biler

        String[] strArr = {"1", "2", "3", "4"};

        List<String> list_str = Arrays.asList(strArr);
        list_str.set(0, "test");
//       list_str.add("sss"); olmaz cunki uzunlugunu deyisirik
            System.out.println();
        List arraysList = Arrays.asList("TEST", "list");

        arraysList.remove(0);

        Integer integer = 1234;    //127 e qeder beraber olur ondan sonra ferqli olur
        Integer integer1 = 1234;
        System.out.println(integer = integer1);

    }

    //varargs varsa bu en sonuncu element olmalidi moterizede
    // cunki hansinin varargs oldugun bildirmek ucun
    //bosh da qala biler ustunlukdu
    //istenilen qeder element add ede bilerik
    //curly braces yazanda hemse new string yaziriq bunda
    // amma lazim deyil yeni yaratmaq adi de yazmaq olur

    public static void test(String... args) {
        System.out.println(Arrays.toString(args));

    }
}
