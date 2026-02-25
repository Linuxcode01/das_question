package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ransomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for(int i = 0; i < ransomNote.length(); i++){
            need.put(ransomNote.charAt(i), need.getOrDefault(ransomNote.charAt(i),0) + 1);
        }

        for(int i = 0; i < magazine.length(); i++){
            have.put(magazine.charAt(i), have.getOrDefault(magazine.charAt(i), 0) +1);
        }

        for(Map.Entry<Character,Integer> entry : need.entrySet()){
            Character key = entry.getKey();

            if(have.containsKey(key)){
                if(have.get(key) < need.get(key)){
                    return false;
                }
            }else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        boolean c = new ransomNote().canConstruct("a", "b");
        System.out.println(c);
    }
}
