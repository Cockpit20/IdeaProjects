package com.soumyadeep;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] n={3,1,5,4,2,8,6,10,9,7};
        System.out.println(Arrays.toString(CyclicSort(n)));
    }

    static int[] BubbleSort(int[] n) {
        //with the first pass through the array the largest element is at the end
        //with the second pass through the array the second-largest element is at the 2nd index from last index
        //with the third pass through the array the third-largest element is at the 3rd index from last index
        //.
        //.
        //.
        //with the nth pass through the array the nth-largest element is at the nth index from last index

        //Space Complexity=O(1)//constant
        //No extra space required i.e. copying th array etc.

        //Time Complexity:
        //Best Case: O(N)=>Sorted
        //Worst Case: O(N^2)=>Sorted in reverse

        boolean swapped;
        for (int i = 0; i < n.length-1; i++) {
            swapped=false;
            for (int j = 1; j < n.length-i; j++) {
                if(n[j]<n[j-1])
                {
                    swap(n,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
        return n;
    }

    static int[] SelectionSort(int[] n) {
        //Time Complexity:
        //Best Case:O(N^2)
        //Worst Case:O(N^2)
        //Performs well in small lists

        for (int i = 0; i < n.length-1; i++) {
            int last=n.length-i-1;
            int maxIndex=getMaxIndex(n,last);
            swap(n,maxIndex,last);
        }
        return n;
    }

    static void swap(int[] n,int a,int b){
        int temp=n[a];
        n[a]=n[b];
        n[b]=temp;
    }

    static int getMaxIndex(int[] n, int end) {
        int max=n[0];
        int maxIndex=0;
        for (int i = 0; i <= end; i++) {
            if (n[i]>max){
                max=n[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    static int[] InsertionSort(int[] n){
        //Complexity:
        //Worst Case: O(N^2)
        //Best Case: O(N)
        for (int i = 0; i <= n.length-2; i++) {
            for (int j = i+1; j >0; j--) {
                if (n[j]<n[j-1])
                    swap(n,j,j-1);
                else break;
            }
        }
        return n;
    }

    static int[] CyclicSort(int[] n){
        //When given nos. are in the range 1 to N -->Use Cyclic Sort
        //Worst Case: O(N)
        //Best Case: O(1)//constant
        int i=0;
        while(i<=n.length-1){
            int correct=n[i]-1;
            if(n[correct]!=n[i])
                swap(n,correct,i);
            else
                i++;
        }
        return n;
    }

}