package com.soumyadeep;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        String grade=null;
        String gr=gradeSytem(grade);
        System.out.println("Grade:"+gr);
    }

    static String gradeSytem(String grade) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks=input.nextInt();
        int m=marks/10;
        switch (m){
            case 9-> grade="AA";
            case 8-> grade="AB";
            case 7-> grade="BB";
            case 6-> grade="BC";
            case 5-> grade="CD";
            case 4-> grade="DD";
            default -> grade="Fail";
        }
        return grade;
    }
}
