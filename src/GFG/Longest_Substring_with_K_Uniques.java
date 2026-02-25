package GFG;

public class Longest_Substring_with_K_Uniques {
    public static int longestKSubstr(String s, int k) {
        // code here
        int low = 0;
        int high = 0;
        int rem = k;
        int res = Integer.MIN_VALUE;
        StringBuilder str = new StringBuilder();

       while (high < s.length()) {

           if (rem < 0){
               if(str.indexOf(String.valueOf(s.charAt(high))) != -1){
                   str.append(s.charAt(high));
                   high++;
               }else {
                   str.append(s.charAt(high));
                   high++;
                   rem--;
               }
           }else {
               int len = high - low + 1;
               res = Math.max(res,len);
               str.deleteCharAt(0);
               low++;
           }
       }
       return res;
    }

    public static void main(String[] args) {
        int ans = longestKSubstr("aabacbebebe", 3);
        System.out.println(ans);
    }
}
