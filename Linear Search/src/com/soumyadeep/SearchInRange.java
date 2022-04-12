package com.soumyadeep;

public class SearchInRange {
    public static void main(String[] args) {
        int[] n={23,45,1,2,8,19,-3,16,-11,28};
        int target=-11;
        int index1=3;
        int index2=9;
        boolean ans=linearSearch(n,target,index1,index2);
        if (!ans)
            System.out.println("Not Found");
        else
            System.out.println("Found");
    }
    static boolean linearSearch(int[] arr,int target,int index1,int index2)
    {
        if (arr.length==0){
            return false;
        }
        for (int i = index1; i < index2; i++)
        {
            int element=arr[i];
            if (element==target)
                return true;
        }
        return false;
    }
}
