package GFG;

import java.util.Arrays;

public class CoutTripletLessThanSum {

   static long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long ans = 0;
        for( int i = 0; i < arr.length - 2; i++ ){

            int left = i+1;
            int right = arr.length - 1;

            while(left < right){

                long totalSum = arr[i] + arr[left] + arr[right];
                if(totalSum >= sum){
                    right--;

                }else{
                    ans = ans + (right - left);
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       long ans = countTriplets(4,2,new long[]{-2 ,0 ,1 ,3});
        System.out.println(ans);
    }



}

// User function Template for Java

