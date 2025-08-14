package arraysAndCollections;

import java.util.Arrays;

public class Traverse {

    // 1 2
    // 3 4


    // 1 3
    // 2 4

    public static void main(String[] args) {

        int[][] arr = {{1, 2},
                {3, 4}
        };
        System.out.println(Arrays.deepToString(getTraverse(arr)));

    }

    public static int[][] getTraverse(int[][] arr) {

        int[][] traverse = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                traverse[i][j] = arr[j][i];
            }
        }

        return traverse;

    }

}
