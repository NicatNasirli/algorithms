package algorithms.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int elementToSearch = 20;
        int result = linearSearch(array, elementToSearch);
        if (result == -1)
            System.out.println("Element do not exist in array");
        else
            System.out.println("Index of element is: " + result);
    }

    public static int linearSearch(int[] array, int element) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
