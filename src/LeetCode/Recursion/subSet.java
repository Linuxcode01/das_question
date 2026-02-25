package LeetCode.Recursion;

import java.util.Map;
import java.util.Stack;

public class subSet {
    public static void findSubSet(int [] num, int size, int idx, Stack temp){
        if(idx == size){
            System.out.println(temp.toString());
            return;
        }

        findSubSet(num, size, idx + 1, temp);
        temp.push(num[idx]);
        findSubSet(num, size, idx+ 1, temp);
        temp.pop();
        return;
    }

    public static void main(String[] args) {
        int [] num = {2,4,5};
        Stack<Integer> temp = new Stack<>();
        int size = num.length;
        int idx = 0;
        findSubSet(num,size,idx,temp);
    }
}
