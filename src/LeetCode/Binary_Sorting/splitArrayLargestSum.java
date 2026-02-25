package LeetCode.Binary_Sorting;

import java.util.Arrays;

public class splitArrayLargestSum {

    public static int splitArray(int[] nums, int k) {
        int sum = 0;
        int ans = -1;

        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }

        for(int i = k; i < nums.length; i++){

            sum = sum + nums[i] - nums[i-k];
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int ans = splitArray(nums,k);
        System.out.println(ans);
    }
}
