package arraysAndCollections;

import java.util.Arrays;

public class MatrixDiagonal {

    public static void main(String[] args) {
        int[][] arr = {

                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };



        System.out.println(Arrays.toString(getDiagonal(arr)));
        System.out.println(Arrays.toString(getRightDiagonal(arr)));
    }

    public static int[] getDiagonal(int[][] arr) {
        int[] diagonalArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            diagonalArr[i] = arr[i][i];
        }

        return diagonalArr;
    }

    //0 2
    //1 1
    //2 0

    public static int[] getRightDiagonal(int[][] arr) {
        int rightDiagonalArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            rightDiagonalArr[i] = arr[i][arr.length - 1 - i];

        }

        return rightDiagonalArr;
    }


}
