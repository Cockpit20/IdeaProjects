package com.soumyadeep;

import java.util.ArrayList;
import java.util.List;

public class LeetCode {
    public static void main(String[] args) {
//        subsequences("","abc");
//        System.out.println(subsequencesList("","abc"));
//
//        System.out.println(subset(new int[]{1, 2, 3}));
//
//        permutations("","abc");
//
//        System.out.println(subsequenceList("abc"));
//        System.out.println(subsetList(73));
//
//        diceFace("",5,8);
//        System.out.println(diceFaceList("",4,10));

        letterCombination("","12");
        System.out.println(letterCombinationList("","52"));
    }
    static void subsequences(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subsequences(p+ch,up.substring(1));
        subsequences(p,up.substring(1));
    }

    static ArrayList<String> subsequencesList(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subsequencesList(p+ch,up.substring(1));
        ArrayList<String> right=subsequencesList(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n= outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first=p.substring(0,i);
            String second=p.substring(i);
            permutations(first+ch+second,up.substring(1));
        }
    }

    static List<String> subsequenceList(String up){
        List<String> outer=new ArrayList<>();
        outer.add("");
        for(int i=0;i<up.length();i++){
            int n= outer.size();
            for (int j = 0; j < n; j++) {
                String internal=(outer.get(j))+up.charAt(i);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<String> subsetList(int digits){
        String up=Integer.toString(digits);
        List<String> outer=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        if(digit>=2 && digit<=6){
            for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
                char ch=(char) ('a'+i);
                outer.add(String.valueOf(ch));
            }
        }else if(digit==7){
            for (int i = (digit-2)*3; i <= (digit-1)*3; i++) {
                char ch=(char) ('a'+i);
                outer.add(String.valueOf(ch));
            }
        }else if(digit==8){
            for (int i = ((digit-2)*3)+1; i <= (digit-1)*3; i++) {
                char ch=(char) ('a'+i);
                outer.add(String.valueOf(ch));
            }
        }else if(digit==9){
            for (int i = ((digit-2)*3)+1; i <= ((digit-1)*3)+1; i++) {
                char ch=(char) ('a'+i);
                outer.add(String.valueOf(ch));
            }
        }
        for(int i=0;i< up.length();i++){
//            int n= outer.size();
//            for (int j = 0; j < n; j++) {
//                String internal=(outer.get(j))+up.charAt(i);
//                outer.add(internal);
//            }
            if(digit>=2 && digit<=6){
                for (int j = (digit-2)*3; j < (digit-1)*3; j++) {
                    String ch=outer.get(i)+(char) ('a'+i);
                    outer.add(ch);
                }
            }else if(digit==7){
                for (int j = (digit-2)*3; j <= (digit-1)*3; j++) {
                    String ch=outer.get(i)+(char) ('a'+i);
                    outer.add(ch);
                }
            }else if(digit==8){
                for (int j = ((digit-2)*3)+1; j <= (digit-1)*3; j++) {
                    String ch=outer.get(i)+(char) ('a'+i);
                    outer.add(ch);
                }
            }else if(digit==9){
                for (int j = ((digit-2)*3)+1; j <= ((digit-1)*3)+1; j++) {
                    String ch=outer.get(i)+(char) ('a'+i);
                    outer.add(ch);
                }
            }
        }

        return outer;
    }

    static void diceFace(String p,int target,int face){
        if(target==0){
            System.out.print(p+" ");
            return;
        }
        for (int i = 1; i <= target && i<= face ; i++) {
            diceFace(p+i,target-i,face);
        }
    }

    static ArrayList<String> diceFaceList(String p,int target,int face){
        ArrayList<String> ans=new ArrayList<>();
        if(target==0){
            ArrayList<String > list=new ArrayList<>();
            list.add(p);
            return list;
        }
        for (int i = 1; i <= target && i<= face ; i++) {
            ans.addAll(diceFaceList(p+i,target-i,face));
        }
        return ans;
    }

    static void letterCombination(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch= (char) ('a'+i);
            letterCombination(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> letterCombinationList(String p,String up){
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch= (char) ('a'+i);
            ans.addAll(letterCombinationList(p+ch,up.substring(1)));
        }
        return ans;
    }

}
