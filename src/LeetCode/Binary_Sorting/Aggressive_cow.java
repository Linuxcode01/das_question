package LeetCode.Binary_Sorting;

import java.util.Arrays;

public class Aggressive_cow {

    public static boolean True(int[] stalls, int k, int guess){
        int prev = 0;
        int cow = 1;

        for(int i = 1; i < stalls.length; i++){
            int dist = stalls[i] - stalls[prev];

            if(dist >= guess){
                cow++;
                prev = i;
            }
        }
        return cow >= k;
    }

    public static int cow(int[] stalls, int k) {
        // code here

        Arrays.sort(stalls);
        int low = 0;
        int high = stalls[stalls.length - 1];

        int res = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if( True(stalls,k, mid) ){
                res = Math.max(res,mid);
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []stalls = {7,13, 11};
        int k= 3;

       int res =  cow(stalls,k);
        System.out.println(res);
    }

}
