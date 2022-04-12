package com.soumyadeep;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // write your code here
        String eo=eligibility(null);
        System.out.println(eo);
    }
    static String eligibility(String type){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        n = input.nextInt();
        if (n>=18)
            type="You're eligible to vote";
        else
            type="You're not eligible to vote";
        return type;
    }
}
