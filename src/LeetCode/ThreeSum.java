package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//


class ThreeSum {
    public static  void main(String[] args) {
        int [] nums = {-100,-70,-60,110,120,130,160};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> data = new ArrayList<>();


        for(int i = 0; i< nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            int sum = -1 * nums[i];
            while(left < right){
                int s = nums[left] + nums[right];
                if(s == sum){
                    data.add(List.of(nums[i],nums[left],nums[right]));

                    left++;
                    right--;

                    while(left < nums.length && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while(right >= 0 && nums[right] == nums[right + 1]){
                        right--;
                    }
                }else if(s > sum){
                    right--;
                }else{
                    left++;
                }
            }

        }

        System.out.println(data);

    }
}