package com.soumyadeep.interfaces.extendDemo2;

public class Main implements A,B {

    @Override
    public void greet() {

    }

    @Override
    public void fun() {
        A.super.fun();
    }

    public static void main(String[] args) {
        Main obj=new Main();
        A.greeting();
    }
}
