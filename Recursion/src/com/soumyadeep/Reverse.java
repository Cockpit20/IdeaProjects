package com.soumyadeep;

public class Reverse {
    //WAY 01
    static int sum=0;
    static void rev1(int n){
        if(n==0)
            return;
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }

    //WAY 02
    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    static int helper(int n, int digits) {
        if(n/10==0)
            return n;
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }

    //PALINDROME
    static boolean palindrome(int n){
        return rev2(n)==n;
    }

    public static void main(String[] args) {
        int n=122;
        System.out.println(palindrome(n));
    }


}
