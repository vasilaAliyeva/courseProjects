package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SumNums {
    public static List<Integer> integerList = new ArrayList<>();


    public static void main(String[] args) {
        integerList.add(70);
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(60);

        System.out.println(sum());
        System.out.println(sumStream());
    }

    public static int sum() {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > 50)
                sum += integerList.get(i);
        }
        return sum;
    }

    public static int sumStream() {
        return integerList.stream()
                .filter(i -> i > 50)
                .mapToInt(Integer::intValue)
                .sum();
    }

}
