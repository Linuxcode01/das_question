package LeetCode.Recursion;

public class isSortedArray {

   public static Boolean isSortedArr(int []num, int len,int i){
       if(i == len || len == 0){
           return true;
       }
       if(num[i] > num[i+1]) return false;

       boolean isTrue =  isSortedArr(num,len,i+1);
       if(isTrue){
           return true;
       }
       return false;
   }

    public static void main(String[] args) {
        int [] num = {5,2,3,7};
        System.out.println(isSortedArr(num,num.length - 1,0));
    }
}
