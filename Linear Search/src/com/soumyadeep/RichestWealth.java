package com.soumyadeep;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] n={
                {1,5},
                {7,3},
                {3,5}
        };
        int richest=maxWealth(n);
        System.out.println("The richest has "+richest);
    }

    static int maxWealth(int[][] n) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            int[] ints = n[i];
            int s = 0;
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                s = s + anInt;
            }
            if (s > max)
                max = s;
        }
        return max;
    }
}
