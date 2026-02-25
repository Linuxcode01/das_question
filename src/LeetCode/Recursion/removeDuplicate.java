package LeetCode.Recursion;

public class removeDuplicate {

    public static String removeDuplicateString(String str,int i, char c){
        if(str.isEmpty()) return str;
        String ans = "";
        if(i == str.length()) return ans;

        if(str.charAt(i) != c){
           ans = ans + str.charAt(i);
        }
        removeDuplicateString(str,i+1, c);
        return ans;
    }

    public static void main(String[] args) {
        String str = "chandan";
        char c = 'c';
       String ans = removeDuplicateString(str,0,c);
        System.out.println(ans);
    }
}
