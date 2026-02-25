package LeetCode.Binary_Sorting;

public class searchInRotatedArray {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums.length == 1){
                if(nums[0] == target) {return 0;}
                else{
                    return -1;
                }
            }

            if(nums[mid] == target) return mid;
            if(nums[mid] >= nums[mid + 1]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1};
        int ans = search(arr, 3);
        System.out.println(ans);
    }
}
