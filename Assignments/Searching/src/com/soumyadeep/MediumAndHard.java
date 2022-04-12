package com.soumyadeep;

public class MediumAndHard {
    public static void main(String[] args) {
        int[]a={12,34,67,90};
        int n=4;
        int m=2;
        System.out.println(findPages(a,n,m));
    }
    static int singleNonDuplicate(int[] nums) {
        if(nums.length<2)
            return nums[0];
        int start=0;
        int end= nums.length-1;
        while(start<=end) {
            if(nums[start]==nums[start+1])
                start+=2;
            else
                return nums[start];
            if(nums[end]==nums[end-1])
                end-=2;
            else
                return nums[end];
        }
        return -1;
    }
    static int findMin(int[] nums) {
        int pivot=findPivotWithDuplicates(nums);
        if(pivot==-1)
            return nums[0];
        else return nums[pivot+1];
    }
    static int findPivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            if(mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            if(nums[mid]<=nums[start])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(cols==0){
            return false;
        }
        if(rows==1)
            return search(matrix,0,target,0,cols-1);
        int cMid=cols/2;
        int rStart=0;
        int rEnd=rows-1;
        while(rStart<rEnd-1)
        {
            int rMid=rStart+(rEnd-rStart)/2;
            if(matrix[rMid][cMid]==target)
                return true;
            if(target<matrix[rMid][cMid])
                rEnd=rMid;
            else
                rStart=rMid;
        }
        if(matrix[rStart][cMid]==target)
            return true;
        if (matrix[rStart + 1][cMid] == target)
            return true;
        if (target<=matrix[rStart][cMid-1])
            return search(matrix,rStart,target,0,cMid-1);
        if (target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1])
            return search(matrix,rStart,target,cMid+1,cols-1);
        if (target <= matrix[rStart + 1][cMid - 1])
            return search(matrix, rStart + 1, target, 0,cMid-1);
        else
            return search(matrix, rStart + 1, target, cMid+1,cols - 1);
    }

    static boolean search(int[][] nums,int row, int target,int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[row][mid])
                start=mid+1;
            else if (target<nums[row][mid])
                end=mid-1;
            else
                return true;
        }
        return false;
    }
    static int findPivotWithDuplicates(int[] nums){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            if(mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            if(nums[mid]==nums[start]&&nums[mid]==nums[end]){
                if(start<end && nums[start]>nums[start+1])
                    return start;
                start++;
                if(end>start && nums[end]<nums[end-1])
                    return end-1;
            }else if(nums[start]<nums[mid] || (nums[start]==nums[mid]&&nums[mid]>nums[end]))
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int start=0;
        int end=0;
        for (int i = 0; i < N; i++) {
            start=Math.max(start,A[i]);
            end=end+A[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int i = 0; i < N; i++) {
                if(sum+A[i]>mid){
                    sum=A[i];
                    pieces++;
                }else
                    sum=sum+A[i];
            }
            if(pieces>M)
                start=mid+1;
            else
                end=mid;
        }
        return end;
    }
}
