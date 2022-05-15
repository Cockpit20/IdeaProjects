package com.soumyadeep;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        subsequences("","abc");

        System.out.println(subsequencesList("","abc"));
    }

    static void subsequences(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);

        subsequences(p+ch,up.substring(1));
        subsequences(p,up.substring(1));
    }

    static ArrayList<String> subsequencesList(String p, String up){
        ArrayList<String> ans=new ArrayList<String>();
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ans.addAll(subsequencesList(p+ch,up.substring(1)));
        ans.addAll(subsequencesList(p,up.substring(1)));

        return ans;
    }
}

