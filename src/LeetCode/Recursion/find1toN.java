package LeetCode.Recursion;

public class find1toN {

    public static void find1ton(int n){
//        base condition
        if(n == 0){
            return;
        }
//        hypothetical -- 1 2 3 ... n
//        indution
        find1ton(n - 1);
        System.out.println(n);
    }

    public static void findnto1(int n){
//        hypothetical --- (5) -- 5 4 3 2 1
//        base condition
        if(n == 0){
            return;
        }
        System.out.println(n);
//        induction
        findnto1(n-1);
//
    }

    public static void main(String[] args) {
//        find1ton(5);
        findnto1(5);
    }
}
