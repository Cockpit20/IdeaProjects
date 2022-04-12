package com.soumyadeep;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
//        String fruit = input.next();
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Orange" -> System.out.println("Round Fruit");
//            case "Apple" -> System.out.println("A Sweet Red Fruit");
//            case "Grape" -> System.out.println("Small Fruit");
//            default -> System.out.println("Invalid Fruit");
//        }
        int day=input.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid");
        }
    }
}
