package com.soumyadeep;

public class SplitArray {
    public static void main(String[] args) {
        int[] n={1,4,4};
        int m=3;
        System.out.println(splitArray(n,m));
    }
    static int splitArray(int[] n,int m){
        int start=0;
        int end=0;
        for (int i = 0; i < n.length; i++) {
            int j = n[i];
            start = Math.max(start, j);
            end += j;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;int pieces=1;
            for (int i = 0; i < n.length; i++) {
                int num = n[i];
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces>m)
                start=mid+1;
            else
                end=mid;
        }
        return start; //return end; //As start=end
    }
}
