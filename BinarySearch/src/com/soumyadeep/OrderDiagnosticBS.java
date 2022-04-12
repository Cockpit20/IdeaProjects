package com.soumyadeep;

public class OrderDiagnosticBS {
    public static void main(String[] args) {
        // write your code here
        int[] n={48,36,20,14,12,11,9,6,4,2};
        int target=4;
        System.out.println(binarySearch(n,target));

    }
    static int binarySearch(int[] n,int target)
    {
        int start=0;
        int end=n.length-1;
        if (n[start]<=n[end])
        {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < n[mid])
                    end = mid - 1;
                else if (target > n[mid])
                    start = mid + 1;
                else
                    return mid;
            }
        }
        else if (n[start]>=n[end])
        {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > n[mid])
                    end = mid - 1;
                else if (target < n[mid])
                    start = mid + 1;
                else
                    return mid;
            }
        }
        return -1;
    }
}
