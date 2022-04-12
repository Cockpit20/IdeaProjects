package com.soumyadeep;

public class Floor {

    public static void main(String[] args) {
        int[] n={2,4,6,9,11,12,14,20,36,48};
        int target=1;
        System.out.println("Floor of "+target+" is "+floor(n,target));
    }

    static int floor(int[] n, int target) {
        int start=0;
        int end=n.length-1;
        if(target<n[start])
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
        return n[end];
    }
}
