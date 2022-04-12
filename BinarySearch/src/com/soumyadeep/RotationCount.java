package com.soumyadeep;

public class RotationCount {
    public static void main(String[] args) {
        int[] n = {0,0,1,2,2,5,6};
        System.out.println(pivotWithDuplicates(n) + 1);
    }

    static int pivotWithDuplicates(int[] n) {
        int start = 0;
        int end = n.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && n[mid] > n[mid + 1])
                return mid;
            if (mid > start && n[mid] < n[mid - 1])
                return mid - 1;
            //check elements at start, middle and end
            //if they are equal,just skip the duplicates
            if (n[mid] == n[start] && n[mid] == n[start]) {
                if (start < end && n[start] > n[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && n[end] < n[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (n[start] < n[mid] || (n[start] == n[mid] && n[mid] > n[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
