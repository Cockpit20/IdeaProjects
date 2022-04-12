package com.soumyadeep;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name=input.next();
        String personalized= myGreet(name);
        System.out.println(personalized);
    }
    static String myGreet(String name)
    {

        String message="Hello,"+name;
        return message;
    }
    static String greet(){
        String greeting="Hello World";
        return greeting;
    }
}
