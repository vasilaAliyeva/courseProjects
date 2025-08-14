package arraysAndCollections;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        addWord(frequencyMap, "Test");
        addWord(frequencyMap, "Test");
        addWord(frequencyMap, "Testttt");
        addWord(frequencyMap, "Test");
        addWord(frequencyMap, "test");

        printFrequencies(frequencyMap);
    }

    private static void addWord(Map<String, Integer> map, String word) {
        if (map.containsKey(word)) {
            int currentCount = map.get(word);
            map.put(word, currentCount + 1);
        } else {
            map.put(word, 1);
        }
    }

    private static void printFrequencies(Map<String, Integer> frequencyMap) {
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
