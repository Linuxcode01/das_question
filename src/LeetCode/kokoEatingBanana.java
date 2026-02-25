package LeetCode;

import java.util.Arrays;

public class kokoEatingBanana {

    public static long Hour(int []piles, int speed){

        long res = 0;
        for(int i = 0; i < piles.length; i++){
           int hour = piles[i]/speed;
            if(piles[i] % speed != 0){
                hour++;
            }
            res = res + hour;
        }

        return res;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int res = Integer.MAX_VALUE;
        while(low <= high){
            int speed = low + (high - low)/2;
            long hr = Hour(piles,speed);

            if(hr > h){
                low = speed + 1;
            }else{
                res = Math.min(res,speed);
                high = speed - 1;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int []piles = {805306368,805306368,805306368};
        int ans = minEatingSpeed(piles,1000000000);
        System.out.println(ans);
    }
}
