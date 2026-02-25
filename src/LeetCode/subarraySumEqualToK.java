package LeetCode;

public class subarraySumEqualToK {

    public static int subarraySum(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        for(int num : nums){
            sum += num;
        }

        for(int i = 0; i < nums.length; i++){
            right = sum - left - nums[i];
            left += nums[i];

            if(left == k){
                count++;
            }
            if(right == k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,1,2,1};
        int k = 3;
        System.out.println(subarraySum(nums,k));
    }
}
