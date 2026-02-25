package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class minimum_window_substring {

    public static boolean sahi(Map<Character,Integer> map, Map<Character, Integer> needMap){
        for (Map.Entry<Character, Integer> entry : needMap.entrySet()) {
            int have = map.getOrDefault(entry.getKey(), 0);
            if (have < entry.getValue()) {
                return false;
            }
        }
        return true;
    }


    static public String minWindow(String s, String t) {
        int low = 0;
        int high = 0;
        int res= 0;
        int start = 0;
        HashMap<Character, Integer> needMap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            needMap.put(c, needMap.getOrDefault(c, 0) + 1);
        }


        while(high < s.length()){

            map.put(s.charAt(high), map.getOrDefault(s.charAt(high),0) + 1);

            while(sahi(map, needMap)){
                int len = high - low + 1;
                if(len < res){
                    res = len;
                    start = low;

                }
                map.put(s.charAt(low), map.get(s.charAt(low)) - 1);
                low++;
            }
            high++;
        }
        return s.substring(start, res+start);

    }

    public static void main(String[] args) {
        String str = minWindow("a","aa");
        System.out.println(str);
    }

}
