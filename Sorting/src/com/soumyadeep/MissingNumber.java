package com.soumyadeep;

public class MissingNumber {
    public static void main(String[] args) {
        int[] n={3,1,5,4,2,8,6,7,9,0};
        System.out.println(missingNumber(n));

    }
    static int missingNumber(int[] n){
        int i=0;
        while(i<=n.length-1){
            int correct=n[i];
            if(n[i]<n.length && n[correct]!=n[i])
                swap(n,correct,i);
            else
                i++;
        }
        for (int index = 0; index < n.length; index++) {
            if(n[index]!=index)
                return index;
        }
        return n.length;
    }
    static void swap(int[] n,int a,int b){
        int temp=n[a];
        n[a]=n[b];
        n[b]=temp;
    }
}
