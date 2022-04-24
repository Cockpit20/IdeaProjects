package com.soumyadeep;

import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
        char ch='a';
        System.out.println(ch+0);
        subsetASCII("","ab");
        System.out.println(subsetASCII2("","ab"));
    }
    static void subsetASCII(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch=up.charAt(0);

        subsetASCII(p+ch,up.substring(1));
        subsetASCII(p,up.substring(1));
        subsetASCII(p+(ch+0),up.substring(1));
    }

    static ArrayList<String> subsetASCII2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);

        ArrayList<String> left= subsetASCII2(p+ch,up.substring(1));
        ArrayList<String> right= subsetASCII2(p,up.substring(1));
        ArrayList<String> ascii= subsetASCII2(p+(ch+0),up.substring(1));

        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
