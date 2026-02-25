package GFG.BinarySorting;

public class Ceil_in_Sorted_Array {

    public static int findCeil(int[] arr, int x) {
        // code here
        int low = 0;
        int high = arr.length - 1;
        int res = -1;

        while(low <= high){

            int mid = low + (high - low) /2;

            if(arr[mid] >= x){
                res = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int ans = findCeil(new int[]{1, 2, 8, 10, 11, 12, 19}, 5);
        System.out.println(ans);
    }
}
