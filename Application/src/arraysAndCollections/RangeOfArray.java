package arraysAndCollections;

import java.util.Arrays;

public class RangeOfArray {
    public static void main (String []  args){

        int [] arr= {1,43,5,66,7,78,9,65,2};

        System.out.println(Arrays.toString(getMinMax(arr)));


    }

    public static int[] getMinMax(int[] arr) {
        int[] min_max = new int[2];
        min_max[0] = minArray(arr);
        min_max[1] = maxArray(arr);
        return min_max;
    }



    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static int minArray (int[ ] arr){
        int min = arr[0];
        for (int i= 1 ;i< arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }

        }
        return min;
    }

}
