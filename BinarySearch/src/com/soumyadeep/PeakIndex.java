package com.soumyadeep;

public class PeakIndex {

    public static void main(String[] args) {
        // write your code here
        int[] n={2,4,6,9,11,12,20,9,7,5,3};
        System.out.println(peakIndex(n));
    }
    static int peakIndex(int[] n)
    {
        int start=0;
        int end=n.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if (n[mid]>n[mid+1])
                //You are in the descending part of the array
                //So the larger value can be the possible answer
                //But we need to check on the left-hand side too
                //So end is the index of the larger value i.e. mid
                //And we check the left of the remaining array
                end=mid;
            else
                //You are in the ascending part of the array
                //So the larger value can be the possible answer
                //But we need to check on the right-hand side too
                //So start is the index of the larger value i.e. mid+1
                //And we check the right-side of the remaining array
                start=mid+1;
        }
        return start; //or return end;
        //As start and end will point to the same element at the end of the check
    }
}

