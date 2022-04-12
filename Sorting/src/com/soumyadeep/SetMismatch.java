package com.soumyadeep;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] n={2,1,4,2,6,5};
        System.out.println(Arrays.toString(errorNumbers(n)));

    }
    static int[] errorNumbers(int[] n) {
        int i=0;
        while(i<=n.length-1){
            int correct=n[i]-1;
            if(n[correct]!=n[i])
                swap(n,correct,i);
            else
                i++;
        }
        for (int index = 0; index < n.length; index++) {
            if(n[index]!=index+1)
                return new int[]{n[index],index+1};
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] n,int a,int b){
        int temp=n[a];
        n[a]=n[b];
        n[b]=temp;
    }
}
