package LeetCode;

import java.util.HashMap;

public class longest_substring_with_k_distinct_element {
    public static int longestKSubstr(String s, int k) {
        // code here

        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int high = 0;
        int res = -1;

        while(high < s.length()){
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);

            while(map.size() > k){
                map.put(s.charAt(low), map.get(s.charAt(low)) - 1);

                if(map.get(s.charAt(low)) == 0){

                    map.remove(s.charAt(low));

                }

                low++;
            }

            if(map.size() == k){
                int len = high - low + 1;
                res = Math.max(res, len);
            }
            high++;

        }
        return res;

    }

    public static void main(String[] args) {
        int ans = longestKSubstr("aabacbebebe", 3);
        System.out.println(ans);
    }
}
