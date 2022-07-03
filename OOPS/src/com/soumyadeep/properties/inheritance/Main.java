package com.soumyadeep.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box(3,4,5);
        System.out.println(box1.getL());
//        Box box2=new Box(box1);
//        System.out.println(box2.l+" "+box2.w+" "+box2.h);
//
//        BoxWeight box3=new BoxWeight();
//        BoxWeight box4=new BoxWeight(2,3,4,8);
//        System.out.println(box4.h+" "+box4.weight);

//        Box box5=new BoxWeight(2,3,4,8);
//        System.out.println(box5.h+" "+box5.w);

//        BoxWeight box6=new Box(2,3,4);
//        System.out.println(box6);
//
//        BoxPrice box=new BoxPrice(5,8,200);


        Box.greeting();

        Box box=new BoxWeight();
        BoxWeight.greeting();
    }
}
