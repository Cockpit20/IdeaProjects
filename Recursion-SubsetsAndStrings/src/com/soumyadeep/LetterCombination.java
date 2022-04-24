package com.soumyadeep;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {

//        letterCombination("","29");
        System.out.println(letterCombinationsList("29"));

    }
    static void add(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char) ('a'+i);
            add(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> add2(String p,String up){
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char) ('a'+i);
            ans.addAll(add2(p+ch,up.substring(1)));
        }
        return ans;
    }

    static int addCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char) ('a'+i);
            count=count+(addCount(p+ch,up.substring(1)));
        }
        return count;
    }

    static void letterCombination(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int digit=up.charAt(0)-'0';
        if(digit>=2 && digit<=6){
            for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
                char ch=(char) ('a'+i);
                letterCombination(p+ch,up.substring(1));
            }
        }else if(digit==7){
            for (int i = (digit-2)*3; i <= (digit-1)*3; i++) {
                char ch=(char) ('a'+i);
                letterCombination(p+ch,up.substring(1));
            }
        }else if(digit==8){
            for (int i = ((digit-2)*3)+1; i <= (digit-1)*3; i++) {
                char ch=(char) ('a'+i);
                letterCombination(p+ch,up.substring(1));
            }
        }else if(digit==9){
            for (int i = ((digit-2)*3)+1; i <= ((digit-1)*3)+1; i++) {
                char ch=(char) ('a'+i);
                letterCombination(p+ch,up.substring(1));
            }
        }
    }

//    static ArrayList<String> letterCombinationList(String p,String up){
//        ArrayList<String> ans=new ArrayList<>();
//        if(up.isEmpty()){
//            ArrayList<String> list=new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        int digit=up.charAt(0)-'0';
//        if(digit>=2 && digit<=6){
//            for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
//                char ch=(char) ('a'+i);
//                ans.addAll(letterCombinationList(p+ch,up.substring(1)));
//            }
//        }else if(digit==7){
//            for (int i = (digit-2)*3; i <= (digit-1)*3; i++) {
//                char ch=(char) ('a'+i);
//                ans.addAll(letterCombinationList(p+ch,up.substring(1)));
//            }
//        }else if(digit==8){
//            for (int i = ((digit-2)*3)+1; i <= (digit-1)*3; i++) {
//                char ch=(char) ('a'+i);
//                ans.addAll(letterCombinationList(p+ch,up.substring(1)));
//            }
//        }else if(digit==9){
//            for (int i = ((digit-2)*3)+1; i <= ((digit-1)*3)+1; i++) {
//                char ch=(char) ('a'+i);
//                ans.addAll(letterCombinationList(p+ch,up.substring(1)));
//            }
//        }
//        return ans;
//    }

    static List<String> letterCombinationsList(String digits) {
        List<String> ans=new ArrayList<>();
        String p="";
        if(digits.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        //How to pass p+ch in the recursion calls?

        int digit=digits.charAt(0)-'0';
        if(digit>=2 && digit<=6){
            for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
                char ch=(char) ('a'+i);
                ans.addAll(letterCombinationsList(digits.substring(1)));
            }
        }else if(digit==7){
            for (int i = (digit-2)*3; i <= (digit-1)*3; i++) {
                char ch=(char) ('a'+i);
                ans.addAll(letterCombinationsList(digits.substring(1)));
            }
        }else if(digit==8){
            for (int i = ((digit-2)*3)+1; i <= (digit-1)*3; i++) {
                char ch=(char) ('a'+i);
                ans.addAll(letterCombinationsList(digits.substring(1)));
            }
        }else if(digit==9){
            for (int i = ((digit-2)*3)+1; i <= ((digit-1)*3)+1; i++) {
                char ch=(char) ('a'+i);
                ans.addAll(letterCombinationsList(digits.substring(1)));
            }
        }
        return ans;
    }
}
