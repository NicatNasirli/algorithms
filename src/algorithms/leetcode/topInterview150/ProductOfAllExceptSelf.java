package algorithms.leetcode.topInterview150;

import java.util.Arrays;

public class ProductOfAllExceptSelf {

    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] array = productExceptSelf(nums);
        System.out.println(Arrays.toString(array)); // Output: [0, 0, 9, 0, 0]
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answers = new int[n];

        answers[0] = 1;
        for (int i = 1; i < n; i++) {
            answers[i] = answers[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answers[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answers;
    }
}
