package com.soumyadeep;

public class MagicNumber {
    public static void main(String[] args) {
        int n=5;
        int ans=0;
        int base=5;
        while(n>0){
            int lastDigit=n&1;
            n=n>>1;
            ans+=lastDigit*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
