package com.soumyadeep;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n=255;
        System.out.println(Integer.toBinaryString(n));
        int ans=0;
        while(n>0){
            n=n&(n-1);
            ans++;
        }
        System.out.println(ans);
    }
}
