package com.soumyadeep;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
        String name="Soundscape Chandra";
        String changedName=changeName(name);
        System.out.println(changedName);
    }
    static String changeName(String name){
        name="Shreya Pal";
        return name;
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
