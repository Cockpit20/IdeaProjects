package com.soumyadeep;

public class IsPowerOf2 {
    public static void main(String[] args) {
        int n=256;
        boolean isPowerOf2=(n&(n-1))==0;
        System.out.println(isPowerOf2);
    }
}
