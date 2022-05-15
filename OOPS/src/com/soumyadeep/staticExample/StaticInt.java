package com.soumyadeep.staticExample;

//THIS IS A DEMO TO SHOW INITIALISATION OF STATIC VARIABLES
public class StaticInt {
    static int a=4;
    static int b;

    //ONLY RUN ONCE WHEN THE FIRST OBJECT IS CREATED
    static {
        System.out.println("I AM IN STATIC BLOCK");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticInt obj=new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);

        StaticInt.b+=3;

        StaticInt obj2=new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);
    }
}
