package com.soumyadeep;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SOD(528));
        System.out.println(POD(632));
    }

    static int SOD(int n) {
        if(n/10==0)
            return n;
        return n%10+SOD(n/10);
    }

    static int POD(int n) {
        if(n/10==0)
            return n;
        return n%10*POD(n/10);
    }
}
