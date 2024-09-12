package algorithms.searching;

public class TernarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int elementToSearch = 4;
        int result = ternarySearch(array, elementToSearch);

        if (result == -1)
            System.out.println("Element do not exist in array");
        else
            System.out.println("Index of element is: " + result);
    }

    public static int ternarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int firstMiddle = left + (right - left) / 3;
            int secondMiddle = right - (right - left) / 3;
            if (element == array[firstMiddle]) {
                return firstMiddle;
            }
            if (element == array[secondMiddle]) {
                return secondMiddle;
            }
            if (element < array[firstMiddle]) {
                right = firstMiddle - 1;
            } else if (element > array[secondMiddle]) {
                left = secondMiddle + 1;
            } else {
                right = secondMiddle - 1;
                left = firstMiddle + 1;
            }
        }
        return -1;
    }
}
