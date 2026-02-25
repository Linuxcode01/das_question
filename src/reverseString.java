
import java.util.Arrays;
import java.util.Stack;

public class reverseString {
    public static void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        char[] sb = new char[s.length];

        for(int i = 0; i < s.length; i++){
            stack.push(s[i]);
        }

        for(int i = 0; i < s.length; i++){
            sb[i] = stack.pop();
        }
        System.out.println(Arrays.toString(sb));
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
