package com.soumyadeep;

public class Easy {

    public static void main(String[] args) {
	// write your code here
        int[] arr= {0,0};
        System.out.println(specialArray(arr));
    }

    static int mySqrt(int x) {
        return (int)Math.pow(x,0.5);
    }
    static int guessNumber(int n,int pick){
         for (int i = 0; i<=n ; i++) {
             if(i>pick)
                 i=i-1;
             else if(i<pick)
                 i=i+1;
             else
                 return i;
         }
         return -1;
    }

    static boolean isPerfectSquare(int num){
        double value=Math.sqrt(num);
        return num % value == 0;
    }

    static int search(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid])
                start=mid+1;
            else if (target<nums[mid])
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
    static int arrangeCoins(int n) {
        //write your code here
        return n;
    }
    static int findKthPositive(int[] arr, int k) {
       //write your code here
        return k;
    }

    static int searchInsert(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid])
                start=mid+1;
            else if (target<nums[mid])
                end=mid-1;
            else
                return mid;
        }
        return start;
    }

    static int countNegatives(int[][] grid) {
        int c=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]<0)
                    c++;
            }
        }
        return c;
    }

    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j && arr[i]==2*arr[j])
                    return true;
            }
        }
        return false;
    }

    static int specialArray(int[] nums) {
        //Example 1
        int noOfValues=nums.length;
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=noOfValues)
                c++;
        }
        return c;
    }

}
