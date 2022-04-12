package com.soumyadeep;

public class AugustOutings {
    public static void main(String[] args) {
        int c=0;
        for (int i = 1; i <=31 ; i++) {
            if(i%2==0)
                c=c+1;
        }
        System.out.println("No of days Kunal can go out in the month of august is "+c);
        System.out.println("(Condition: He can go out only on the even days)");
    }
}
