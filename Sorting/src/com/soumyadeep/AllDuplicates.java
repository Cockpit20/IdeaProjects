package com.soumyadeep;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] n={4,3,2,7,8,2,3,1};
        System.out.println(duplicateNumber(n));
    }
    static List<Integer> duplicateNumber(int[] n) {
        int i = 0;
        while (i <= n.length - 1) {
            if(n[i]!=i+1) {
                int correct = n[i] - 1;
                if (n[correct] != n[i])
                    swap(n, correct, i);
                else
                    i++;
            }
            else
                i++;
        }
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index < n.length; index++) {
            if(n[index]!=index+1)
                ans.add(n[index]);
        }
        return ans;
    }

    static void swap(int[] n,int a,int b){
        int temp=n[a];
        n[a]=n[b];
        n[b]=temp;
    }
}
