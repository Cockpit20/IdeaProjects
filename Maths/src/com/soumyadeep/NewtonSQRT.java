package com.soumyadeep;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.printf("%.3f",sqrt(36));
    }
    static double sqrt(double n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<0.001)
                break;
            x=root;
        }
        return root;
    }
}
