package Tnp_Dsa;

import java.util.Scanner;

public class Recursion {
    static void meggi(int x){
        if(x< 200000){
            x++;
            System.out.println("X: " +x);
            meggi(x);
        }
        
    }

    public static void main(String[] args) {
//        Recursion rec =  new Recursion();
//        rec.meggi(0);
        meggi(0);
    }
}
