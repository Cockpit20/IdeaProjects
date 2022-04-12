package com.soumyadeep;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] n={23,45,1,2,8,19,-3,16,-11,28};
        int target=-11;
        boolean ans=linearSearch(n,target);
        if (!ans)
            System.out.println("Not Found");
        else
        System.out.println("Found");
    }
    static boolean linearSearch(int[] arr,int target)
    {
        if (arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target)
                return true;
        }
        return false;
    }
}
