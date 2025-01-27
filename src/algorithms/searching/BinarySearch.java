package algorithms.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int elementToSearch = 8;
        int result = binarySearch(array, elementToSearch);

        if (result == -1)
            System.out.println("Element does not exist in the array");
        else
            System.out.println("Index of element is: " + result);
    }

    public static int binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == element) {
                return middle;
            }
            if (array[middle] < element) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
