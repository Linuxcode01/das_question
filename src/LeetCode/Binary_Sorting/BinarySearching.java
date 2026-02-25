package LeetCode.Binary_Sorting;

import java.util.Arrays;

public class BinarySearching {
    public static int search(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + (high - low)) / 2;
            if (nums[mid] == target) {
                return mid;

            }
            if (nums[mid] < target) {
                low = mid + 1;

            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int ans = search(new int[]{5}, 5);
        System.out.println(ans);
    }
}
