package algorithms.leetcode.topInterview150;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.
public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2};
        System.out.println(majorityElement(array));
    }

    public static int majorityElement(int[] array) {
        int arrayLength = array.length;
        int count;
        for (int i = 0; i < arrayLength; i++) {
            count = 0;
            for (int j = 0; j < arrayLength; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > arrayLength / 2) {
                return array[i];
            }
        }
        return -1;
    }
}
