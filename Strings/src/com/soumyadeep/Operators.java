package com.soumyadeep;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        //int will be converted to Integer that wil call toString()
        //Thus it becomes "a"+"1" ultimately.
        System.out.println("Kunal"+new ArrayList<>());
        //System.out.println("Kunal"+new Integer(56));
        //System.out.println(new ArrayList<>()+""+new Integer(56));
    }
}
