package LeetCode;

import java.util.Arrays;

public class duplicateRemove {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length){
            if(right == 0) {
                k++;
                left++;
                right++;
                continue;
            }
            if(nums[right] == nums[right-1]){
                right++;
            }else {

                nums[left]=nums[right];
                k++;
                left++;
                right++;

            }

        }
        return k;
    }

    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
       int ans =  removeDuplicates(arr);
        System.out.println(ans);
    }
}
