package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    //Time complexity of O(n^2)
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 7, 9, 43, 2, 10};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temporary = array[i];
            for (int j = i; j >= 0; j--) {
                if (temporary < array[j]) {
                    array[j + 1] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return array;
    }
}
