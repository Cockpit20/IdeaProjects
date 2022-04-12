package com.soumyadeep;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();
//        if (n1>n2 && n1>n3)
//            System.out.println(n1+" is largest");
//        else if (n2>n1 && n2>n3)
//            System.out.println(n2+" is largest");
//        else
//            System.out.println(n3+" is largest");

//        int max=n1;
//        if (n2>max)
//            max=n2;
//        if (n3>max)
//            max=n3;

        int max=Math.max(n3,Math.max(n1, n2));
        System.out.println(max+" is largest");
    }
}
