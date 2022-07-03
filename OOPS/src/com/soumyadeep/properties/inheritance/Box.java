package com.soumyadeep.properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("Hey I am in Box class. Greetings! ");
    }

    Box (){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    public double getL(){
        return l;
    }

    Box(double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }

    Box(double l,double h,double w){
        System.out.println("Box Class Constructor");
        this.h=h;
        this.l=l;
        this.w=w;
    }

    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }

    public void information(){
        System.out.println("Running the box...");
    }

}
