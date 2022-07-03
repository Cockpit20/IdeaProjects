package com.soumyadeep.interfaces.extendDemo2;

public interface A {
//    Static Interface methods should always have a body
//    Call via the interface name
    static void greeting(){
        System.out.println("Hey I am static method");
    }

    default void fun(){
        System.out.println("I am in A");
    };
}
