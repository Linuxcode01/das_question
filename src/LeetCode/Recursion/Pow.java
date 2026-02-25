package LeetCode.Recursion;

public class Pow {

    public static double myPow(double x, int n) {

       if (n == 0) return 1;
       return x * myPow(x, n-1);
    }

    public static int sum(int n){

        if(n == 0) return 0;
        return n + sum(n-1);
    }

    public static int count(int n){
        if (n == 1){
            return 1;
        }
        System.out.println(n);
        return count(n-1);
    }

    public static void main(String[] args) {
//        double ans = myPow(2.000,10);
//        int ans = sum(5);
        System.out.println(count(5));
//        System.out.println(ans);
    }
}
