package com.soumyadeep;

public class Palindrome {
    public static void main(String[] args) {
        String str="madam";
        System.out.println(palindromeString(str));
        System.out.println(palindrome(str));
    }

    static boolean palindrome(String str) {
        StringBuilder newStr= new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
           newStr.append(str.charAt(i));
        }
        return (str.equals(newStr.toString()));
    }

    static boolean palindromeString(String str) {
        if (str.length()==0)
            return true;
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if (str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
