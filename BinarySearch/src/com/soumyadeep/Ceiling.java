package com.soumyadeep;

public class Ceiling {
    public static void main(String[] args) {
        int[] n={2,4,6,9,11,12,14,20,36,48};
        int target=9;
        System.out.println("Ceiling of "+target+" is "+ceiling(n,target));
    }

    static int ceiling(int[] n, int target) {
        int start=0;
        int end=n.length-1;
        if(target>n[end])
            return -1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (target<n[mid])
                end=mid-1;
            else if (target>n[mid])
                start=mid+1;
            else
                return n[mid];
        }
        return n[start];
    }

}
