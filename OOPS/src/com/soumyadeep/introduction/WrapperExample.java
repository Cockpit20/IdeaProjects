package com.soumyadeep.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;

        Integer a=10;
        Integer b=20;
        swap(a,b);
        // Pass by reference doesn't work in JAVA
        System.out.println(a+" "+b);
        Integer num= 45;

        // Using final, the primitive data-type or classes
        // CANNOT BE RE_INITIALIZED
        final A kunal=new A("Kunal Kushwaha");
        kunal.name="Shoe Lover";
        
        A obj;
        // WHEN HEAP MEMORY GETS OVERLOADED
        // THE OBJECT IS DESTROYED BY THE GARBAGE COLLECTOR
        for (int i = 0; i < 1000000000; i++) {
            obj=new A("Random name");
        }
    }

    // WON'T SWAP (PASSED  BY REFERENCE)
    static void swap(Integer a,Integer b){
        int temp=a;
        a=b;
        b=temp;
    }

}

class A{
    // Final Keyword
    final int num=10;
    String name;

    public A(String name){
        this.name=name;
    }


    // Garbage Collector
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}