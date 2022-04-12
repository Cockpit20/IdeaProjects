package com.soumyadeep;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] n={3,1,3,4,2};
        System.out.println(duplicateNumber(n));

    }
    static int duplicateNumber(int[] n) {
        int i = 0;
        while (i <= n.length - 1) {
            if(n[i]!=i+1) {
                int correct = n[i] - 1;
                if (n[correct] != n[i])
                    swap(n, correct, i);
                else
                    return n[i];
            }
            else
                i++;
        }
        return -1;
    }

    static void swap(int[] n,int a,int b){
        int temp=n[a];
        n[a]=n[b];
        n[b]=temp;
    }
}

