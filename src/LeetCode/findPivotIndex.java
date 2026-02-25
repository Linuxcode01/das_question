package LeetCode;

public class findPivotIndex {

    public static int pivotIndex(int[] nums) {
        int left=0;
        int sum = 0;
        int right;

        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);

        for(int i = 1; i < nums.length; i++){
            right = sum - left - nums[i];
            if(left == right ) return i;
            left += nums[i - 1];

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,-1};
        int ans = pivotIndex(arr);
        System.out.println(ans);
    }
}
