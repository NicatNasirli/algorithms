package algorithms.leetcode.topInterview150;

//You are given an integer array nums.
// You are initially positioned at the array's first index,
// and each element in the array represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums)); // Expected output: false
    }

    public static boolean canJump(int[] nums) {
        int arrayLength = nums.length;
        int maxReach = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= arrayLength - 1) {
                return true;
            }
        }

        return false;
    }
}
