package com.soumyadeep;

public class Main {

    public static void main(String[] args) {
	// write your code here
        pattern01(4,0);
        pattern02(4,0);
    }

    static void pattern01(int r,int c) {
        if (r == 0)
            return;
        if (c < r) {
            System.out.print("*");

            pattern01(r, c + 1);
        }else{
            System.out.println();
            pattern01(r-1,0);
        }
    }

    static void pattern02(int r,int c) {
        if (r == 0)
            return;
        if (c < r) {
            pattern02(r, c + 1);
            System.out.print("*");
        }else{
            pattern02(r-1,0);
            System.out.println();
        }
    }

}
