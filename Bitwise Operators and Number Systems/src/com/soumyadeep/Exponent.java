package com.soumyadeep;

public class Exponent {
    public static void main(String[] args) {
        int base=3;
        int power=6;
        int ans=1;

        while(power>0){ //110>0 //11>0 //1>0
            if((power&1)==1){ //110&1=0 //11&1=1 //1&1=1
                ans*=base; //Doesn't enter the loop //1*9 //9*81

            }
            base*=base; //3*3 //9*9 //81*81
            power=power>>1; //11 //1 //0
        }
        System.out.println(ans); //729 for base=3 and power=6
    }
}
