package arraysAndCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOfWords {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Tes");
        list.add("Test");
        list.add("Testttt");
        list.add("Test");
        list.add("test");

//1
        Set<String > uniqueElements =  getUniqueElements(list);
    int count = countTheWord("Test", list);
        System.out.println(count);
        
    }

    private static int countTheWord(String axtarilanSoz, List<String> list) {

        int count =0;
        for (int i =0; i<list.size(); i++){
            if(list.get(i).equals(axtarilanSoz)){
                count++;
            }
        }
        return count;
    }

    private static Set<String> getUniqueElements(List<String> list) {

        Set<String> uniqueElements = new HashSet<>();
        for(String s: list){
            System.out.println(s);
            uniqueElements.add(s);
        }
        return uniqueElements;
    }


}
