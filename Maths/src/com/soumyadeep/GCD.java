package com.soumyadeep;

public class GCD {
    public static void main(String[] args) {
        int n1=105;
        int n2=224;
        System.out.println(gcd(n1,n2));
        int lcm=(n1*n2)/gcd(n1,n2);
        System.out.println(lcm);
    }

    static int gcd(int n1, int n2) {
        if(n1%n2==0)
            return n2;
        return gcd(n2,n1%n2);
    }
}
