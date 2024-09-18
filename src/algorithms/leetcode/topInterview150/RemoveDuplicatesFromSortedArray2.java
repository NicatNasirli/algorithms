package algorithms.leetcode.topInterview150;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }

    public static int removeDuplicates(int[] nums) {
        int duplicated = 1;
        int finalLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[finalLength++] = nums[i];
                duplicated = 1;
            } else if (duplicated < 2){
                nums[finalLength++] = nums[i];
                duplicated++;
            }
        }
        return finalLength;
    }
}
