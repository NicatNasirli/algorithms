package algorithms.leetcode.topInterview150;

import java.util.Arrays;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class RotateArray {
    public static void main(String[] args) {
        int[] array = {-1,-100,3,99};
        int k = 2;
        System.out.println(Arrays.toString(rotateArray(array, k)));
    }

    public static int[] rotateArray(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int[] newNums = new int[length];
        for (int i = 0; i < k; i++) {
            newNums[i] = nums[length - k + i];
        }

        for (int i = 0; i < length - k; i++) {
            newNums[k + i] = nums[i];
        }

        for (int i = 0; i < length; i++) {
            nums[i] = newNums[i];
        }

        return nums;
    }
}
