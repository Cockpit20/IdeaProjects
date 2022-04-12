package com.soumyadeep;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        // write your code here
        String name="Chandra";
        char target='a';
        boolean ans2=Search2(name,target);
        boolean ans=Search(name,target);
        if (!ans)
            System.out.print("Character '"+target+"' not found in ");
        else if (ans2)
            System.out.print("Character '"+target+"' found in ");
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean Search2(String name,char target)
    {
        if (name.length()==0){
            return false;
        }
        for (char ch: name.toCharArray()){
            if(ch==target)
                return true;
        }
        return false;
    }
    static boolean Search(String name,char target)
    {
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            char element = name.charAt(i);
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
