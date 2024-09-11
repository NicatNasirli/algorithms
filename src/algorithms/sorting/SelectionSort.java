package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 7, 9, 43, 2, 10};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        int arrayLength = array.length;
        for (int j = 0; j < arrayLength; j++) {
            int minIndex = j;
            for (int i = j + 1; i < arrayLength; i++) {
                if (array[minIndex] > array[i]) {
                    minIndex = i;
                }
            }
            int elementToSwap = array[j];
            array[j] = array[minIndex];
            array[minIndex] = elementToSwap;

        }
        return array;
    }
}
