package com.soumyadeep;

import java.util.ArrayList;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {
        int[] n={9,9,9};
        int k=1;
        System.out.println(addToArray(n,k));
    }

    static List<Integer> addToArray(int[] n,int k) {
        List<Integer> ans=new ArrayList<>();
        int sum=0;
        for (int i = 0; i < n.length; i++) {
            sum=sum*10+n[i];
        }
        sum=sum+k;
        //Write your code here
        return ans;
    }
}
