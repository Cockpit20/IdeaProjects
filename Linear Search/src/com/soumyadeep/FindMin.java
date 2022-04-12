package com.soumyadeep;

public class FindMin {
    public static void main(String[] args) {
        int[] n={23,450,1,2,8,19,-3,16,-198,28};
        int min=MINIMUM(n);
        int maxIndex=MAXIMUM(n);
        System.out.println("Minimum="+min);
        System.out.println("Maximum is at index="+maxIndex);
    }
    static int MINIMUM(int[] arr)
    {
        int min=0;
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            if (j < min)
                min = j;
        }
        return min;
    }
    static int MAXIMUM(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
