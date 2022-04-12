package com.soumyadeep;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] n={'c','f','j'};
        char target='c';
        System.out.println("Ceiling of "+target+" is "+ceiling(n,target));
    }

    static char ceiling(char[] n, char target) {
        int start=0;
        int end=n.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<n[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return n[start%n.length];
    }
}
