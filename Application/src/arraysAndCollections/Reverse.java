package arraysAndCollections;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] arr = {12, 4, 45, 7, 87, 65, 3, 5};

        getReverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void getReverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }


}
