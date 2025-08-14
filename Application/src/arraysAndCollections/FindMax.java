package arraysAndCollections;

public class FindMax {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 65, 3};
        System.out.println(MaxArray(arr));


    }

    public static int MaxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}
