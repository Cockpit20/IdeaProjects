package com.soumyadeep;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            //Scope of a block
        }
        for (int i = 0; i < 5; i++) {
            //Scope of a loop
        }
    }
    static void random(){
        //Scope of a function
    }
}
