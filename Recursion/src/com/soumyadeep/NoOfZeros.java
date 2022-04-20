package com.soumyadeep;

public class NoOfZeros {
    public static void main(String[] args) {
//        int n=30204;
//        count(n);
//        System.out.println(c);
        System.out.println(count2(3020004));
    }

    static int c=0;
    static void count(int n){
        if(n/10==0)
            return;
        int rem=n%10;
        if(rem==0)
            c++;
        count(n/10);
    }

    static int count2(int n){
        return helper(n,0);
    }
    static int helper(int n,int c){
        if(n/10==0)
            return c;
        int rem=n%10;
        if(rem==0)
            return helper(n/10,c+1);
        else
            return helper(n/10,c);
    }

}
