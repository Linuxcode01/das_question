package LeetCode;

public class maxProductSum {

    public static int maxProduct(int[] nums) {
        int maxending = 1;
        int minending = 1;
        int res = 0;

        for(int i = 0; i < nums.length; i++){
            int v1 = maxending * nums[i];
            int v2 = minending * nums[i];
            int v3 = nums[i];

            maxending = Math.max(v1, Math.max(v2 , v3));
            minending = Math.min(v1, Math.min(v2,v3));

            res = Math.max(res, Math.max(maxending,minending));
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,-2,4};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }
}
