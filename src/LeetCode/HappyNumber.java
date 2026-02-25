package LeetCode;

public class HappyNumber {

    static int sumOfNo(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem * rem;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(fast != 1){
            slow = sumOfNo(slow);
            fast = sumOfNo(fast);
            fast = sumOfNo(fast);

            if(slow == fast && slow != 1){
                System.out.println("value of fast : " + fast);
                System.out.println("value of slow : " + slow);

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean  res = isHappy(19);
        System.out.println(res);
    }
}
