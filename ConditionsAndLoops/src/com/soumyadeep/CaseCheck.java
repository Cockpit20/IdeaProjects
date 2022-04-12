package com.soumyadeep;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        if (ch>=65 && ch<90)
            System.out.println(ch+" is in uppercase");
        else
            System.out.println(ch+" is in lowercase");


    }
}
