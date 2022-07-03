package com.soumyadeep.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{3,4,5,6,9,1};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // This is shallow copy
//        // Primitives will be copied as it is
//        // Non primitives will be pointing to same object
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Human twin=(Human) super.clone();
        twin.arr=new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }


}
