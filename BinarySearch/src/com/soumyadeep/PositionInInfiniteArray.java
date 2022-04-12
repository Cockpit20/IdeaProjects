package com.soumyadeep;

//import java.util.Arrays;

public class PositionInInfiniteArray {
    //JL4zJH#WbWS6Cqi - Geeks For Geeks password
    public static void main(String[] args) {
        // write your code here
        int[] n = {3,5,7,9,10,90,100,120,130,140,160,170,190,200};
        int target = 190;
        System.out.println(findRange(n,target));
    }

    static int findRange(int[] n, int target){
        int start=0;
        int end=1;
        while (target>n[end])
        {
            int temp=end+1;
            end=end+2*(end-start+1);
            start=temp;
        }
        return binarySearch(n,target,start,end);
    }
    static int binarySearch(int[] n, int target,int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < n[mid])
                end = mid - 1;
            else if (target > n[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}

