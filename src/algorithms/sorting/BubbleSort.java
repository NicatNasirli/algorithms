package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 7, 9, 43, 2, 10};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] array){
        int length = array.length;
        int elementToSwap;
        boolean swapped;
        for (int i = 0; i < length; i++){
            swapped = false;
            for (int j = 0; j < length - 1; j++){
                if(array[j] > array[j + 1]){
                    elementToSwap = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = elementToSwap;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return array;
    }
}
