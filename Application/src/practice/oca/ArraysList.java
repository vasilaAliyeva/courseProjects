package practice.oca;

import java.util.*;

public class ArraysList extends Object {

    @Override
    public String toString() {
        return super.toString();

//        return  "Operators";
    }

    //thread safe deyil
//   public static List<String > array= Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) {


//        Thread thread = new Thread(() -> array.add("test"));
//        synchronized (Operators.class){
//            thread.start();
//        }

//        int [] arr = new int[3];
//        ArraysList arraysList = new ArraysList();


        //birincinin icindeki
//        int [][][] arr2 = new int [3][3][2];

//        for(int i=0; i<arr2.length; i++){
//            for (int j =0; j<arr2.length;j++){
//                System.out.println(arr2[i][j]+ ' ');
//            }
//        }
//        System.out.println(arr2[0]);
//        System.out.println(Arrays.toString(arr2));

//        System.out.println(Arrays.deepToString(arr2));


        // Collections framework - collection, list, set, queue, deque, map
        //LIST ordered olmayan data stuructur elementler tekrarlana biler (ArrayList, LinkedList, Vector)
        //SET unique elements
        //QUEUE FIFO - STACK bunun eksi LIFO
        // MAP key(index kimi) value pair

//
         // capacity- 10,   size - indexslerin sayi
//arraylis ordered non static yeni byuye bilir
//        List<String> firstList = new ArrayList<>(50);
//
//        firstList.add("a");
//        firstList.add("b");
//        firstList.add("c");
//        firstList.add("d");
//        firstList.add("e");
//
//        indexli proses oldugu ucun elementleri silmek probledi meslen ortadanin sildin o biriler hamisi bir bir surusmelidi

//        firstList.remove("d");
//        firstList.remove("a");
//

//        System.out.println(firstList.indexOf("b"));
//        System.out.println(firstList.get(7));
//
//        LikedList node seklinde saxlanilir ozunden evvelki ve sonrasi referance saxliyir orda eger birin silsek problem olmur
//        //arrayi get elemek zeifdi cunki onu tappana qeder iterasiya edir. implements deque interface
//
//        //   List<String> firstLinkedList = new LinkedList<>(firstList);
//
//        LinkedList<String> firstLinkedList = new LinkedList<>();
//
//        //        firstLinkedList.off
//        firstLinkedList.add("a");
//        firstLinkedList.add("b");
//        firstLinkedList.add("c");
//
//        System.out.println(firstLinkedList.poll());
//        System.out.println((firstLinkedList).pop());
//        System.out.println(firstLinkedList.offer("hello"));
//        firstLinkedList.push("hello");
//
//        //poll, offer silir fifo
//        //push pop stack
//        System.out.println(firstLinkedList.contains("a"));
//
//        //SET - Hashset, LinkedHashset, TreeSet
//
//        // order ile saxlamir
//
//        Set<String> set = new HashSet<>();
//        set.add("a");
//        set.add("b");
//        set.add("c");
//        set.add("d");
//        set.add("e");
//        set.add("f");
//        set.add("gg");
//        set.add("H");
//        set.add("ert");
//
//        set.forEach(System.out::println);
//
//
//        //daxil etdiyimiz sira ile
//        Set<String> Linkedset = new LinkedHashSet<>();
//        Linkedset.add("s");
//        Linkedset.add("b");
//        Linkedset.add("k");
//        Linkedset.add("d");
//        Linkedset.add("e");
//        Linkedset.add("f");
//        Linkedset.add("gg");
//        Linkedset.add("H");
//        Linkedset.add("ert");
//        Linkedset.forEach(System.out::println);


        //Treeset order ile


        //MAP -> K, V  hashmap, linkedhashmap,

        //key value hashe gore buckete atilir equals to key.hash axtarilir

        //eger key her hansi bir obj olsa onda hash equals override elemek lazimdi
        // ozumuzun yaratdigimiz obj biz equals ve hashcode methodu override elemek lazim

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);


        System.out.println(map.get("a"));


        Set<String> string = map.keySet();
        Collection<Integer> values = map.values();


        Map<String, Object> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("b", "a");
        map2.put("d", 'd');
//listler thread safe deyil,  onlarin valuesini

//        Object b = map2.get("b");
//        System.out.println();
//        Operators operators = b instanceof Operators ? ((Operators) b) : null;
//        if (operators != null) {
//            System.out.println(operators.name);
//        }
    }

  
//compare to o1-o2
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
