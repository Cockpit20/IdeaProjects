package com.soumyadeep;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] n={1};
        System.out.println(missingNumber(n));
    }
    static int missingNumber(int[] n){
        int i=0;
        while(i<=n.length-1){
            int correct=n[i]-1;
            if(n[i]>0 && n[i]<n.length && n[correct]!=n[i])
                swap(n,correct,i);
            else
                i++;
        }
        for (int index = 0; index < n.length; index++) {
            if(n[index]!=index+1)
                return index+1;
        }
        return n.length+1;
    }
    static void swap(int[] n,int a,int b){
        int temp=n[a];
        n[a]=n[b];
        n[b]=temp;
    }
}
