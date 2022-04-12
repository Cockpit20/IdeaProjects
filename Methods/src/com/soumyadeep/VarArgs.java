package com.soumyadeep;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,56,87,23,45,65);
        multiple(2,3,"Soumyadeep","Shreyan");
    }
    static void multiple(int a,int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){ //Variable Length Arguments
        System.out.println(Arrays.toString(v));
    }
}
