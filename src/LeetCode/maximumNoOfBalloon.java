package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class maximumNoOfBalloon {
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> have = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();
        int min = Integer.MAX_VALUE;
        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);

        for(int i = 0; i < text.length(); i++){
            have.put(text.charAt(i), have.getOrDefault(text.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : need.entrySet()) {
            Character key = entry.getKey();

            if(have.containsKey(key)){
               int rem = have.get(key) / need.get(key);
               min = Math.min(min,rem);
            }else {
                min = Math.min(min,0);
            }

        }

        return min;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = maxNumberOfBalloons(s);
        System.out.println(ans);
    }
}
