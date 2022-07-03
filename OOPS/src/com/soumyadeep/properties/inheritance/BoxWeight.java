package com.soumyadeep.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        super();
        this.weight=-1;
    }

//    @Override
//    static void greeting(){
//        System.out.println("Hey I am in BoxWeight class. Greetings! ");
//    }

    BoxWeight (BoxWeight other){
        super(other);
        weight= other.weight;
    }

    BoxWeight(double side,double weight) {
        super(side);
        this.weight=weight;
    }

    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w); //to call the parent class
        this.weight=weight;
    }

}
