package com.soumyadeep;

public class IthBit {
    public static void main(String[] args) {
        int n=19;
        int i=4;
        System.out.println(ithBit(n,i));
    }

    static int ithBit(int n,int i) {
        return (int)((n&(1<<(i-1)))/(Math.pow(2,i-1)));
    }


}
