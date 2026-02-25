package Tnp_Dsa;

import java.util.Timer;

public class Demo {
    public static void passByRef(int a){
//        for (int i = 0; i < num.length; i++) {
//            num[i] = num[i] * 2;
//        }
//        for (int i = 0; i < num.length; i++){
//            System.out.print(num[i] + " ");
//        }
        a = 20;
        System.out.println(a);
    }
    public static void main(String[] args) {
//        int [] num = {1,2,3,4};
        int a = 10;
        passByRef(a);
        System.out.println(a);
    }

}
