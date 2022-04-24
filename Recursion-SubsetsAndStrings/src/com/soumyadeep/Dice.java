package com.soumyadeep;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("",4);
//        diceFace("",3,8);
        System.out.println(dice2("",4));
        System.out.println(diceFace2("",5,8));
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            dice(p+i,target-i);
        }
    }

    static void diceFace(String p,int target,int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=face && i<=target ; i++) {
            diceFace(p+i,target-i,face);
        }
    }

    static ArrayList<String> dice2(String p, int target){
        ArrayList<String> ans=new ArrayList<>();
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            ans.addAll(dice2(p+i,target-i));
        }
        return ans;
    }
    static ArrayList<String> diceFace2(String p, int target,int face){
        ArrayList<String> ans=new ArrayList<>();
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        for (int i = 1; i <=face && i<=target ; i++) {
            ans.addAll(diceFace2(p+i,target-i,face));
        }
        return ans;
    }
}
