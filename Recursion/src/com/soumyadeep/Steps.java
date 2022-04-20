package com.soumyadeep;

public class Steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(41));
    }
    static int numberOfSteps(int n){
        return helper(n,0);
    }

    static int helper(int n, int steps) {
        if(n==0)
            return steps;
        if(n%2==0)
            n/=2;
        else
            n-=1;
        return helper(n,steps+1);
    }
}
