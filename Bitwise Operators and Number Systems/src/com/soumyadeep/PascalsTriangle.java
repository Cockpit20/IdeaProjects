package com.soumyadeep;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        int ans=1<<(n-1); // 1*2^(n-1) //1<<(5-1)=10000 in binary= 16 in decimal
        System.out.println(ans);
    }
}
