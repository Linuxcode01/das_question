package LeetCode.Binary_Sorting;

import java.util.Arrays;

public class findKthRotation {
    public static int findKRotation(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int max = Arrays.stream(arr).max().getAsInt();
        int res = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if (arr[mid] == max) {
                res = max - arr[arr.length - 1];
                break;
            }

            if(arr[mid] > arr[arr.length - 1]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res + 1;

    }
    public static void main(String[] args) {
        int ans = findKRotation(new int[]{5,1, 2, 3, 4});
        System.out.println(ans);
    }
}
