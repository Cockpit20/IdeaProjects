package com.soumyadeep;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(9);
        fun("Kunal");
        demo(2,3,4);
        demo("Koala","Kangaroo");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
