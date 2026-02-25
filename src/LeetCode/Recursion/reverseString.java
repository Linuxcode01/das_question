package LeetCode.Recursion;

public class reverseString {
    public static boolean revString(String str,int low, int high){
        int len = high - low + 1;
        if(len == 0 || len == 1){
            return true;
        }

        if(str.charAt(low) != str.charAt(high)){
            return false;
        }

        revString(str, low + 1, high - 1);
        return true;
    }

    public static void main(String[] args) {
        String str = "chandan";
        int low = 0;
        int high = str.length() - 1;
        boolean isPalindrome =  revString(str,low, high);
        System.out.println(isPalindrome);
    }
}
