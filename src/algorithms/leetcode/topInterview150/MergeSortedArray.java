package algorithms.leetcode.topInterview150;

public class MergeSortedArray {

//    You are given two integer arrays nums1 and nums2,
//    sorted in non-decreasing order, and two integers m and n,
//    representing the number of elements in nums1 and nums2 respectively.

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0},  nums2 = {2,5,6};
        int n = 3,m = 3;

        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
