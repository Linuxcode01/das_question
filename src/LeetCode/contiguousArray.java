package LeetCode;

import java.util.HashMap;

public class contiguousArray {

    public static int findMaxLength(int[] nums) {
        int zero= 0;
        int one = 0;
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                zero += 1;
            }else{
                one += 1;
            }

            int diff = zero - one;
            if(diff == 0){
                res = Math.max(res, i + 1);
            }

            if(map.containsKey(diff)){
                int ind = map.get(diff);
                int len = i - ind;
                res = Math.max(len, res);
            }else{
                map.put(diff, i);

            }

        }

        return res;

    }

    public static void main(String[] args) {
        int [] arr = {0,1,1,1,1,1,0,0,0};
        int  ans =  findMaxLength(arr);
        System.out.println(ans);
    }
}

