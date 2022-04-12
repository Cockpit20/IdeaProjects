package com.soumyadeep;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] n ={234,35,-2342,63423,734896};
        int end=END(n);
        System.out.println("No of integers with even number of digits is "+end);
    }

    static int END(int[] n) {
        int d=0;
        for (int j : n) {
            int b = j;
            int c = 0;
            while (b > 0) {
                c++;
                b = b / 10;
            }
            if (c % 2 == 0)
                d = d + 1;
        }
        return d;
    }
}
