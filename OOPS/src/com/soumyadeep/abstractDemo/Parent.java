package com.soumyadeep.abstractDemo;

public abstract class Parent {
    int age;

    final int VALUE;

    public Parent(int age){
        this.age=age;
        VALUE=32456789;
    }

//    Abstract constructors cannot be created
//    Abstract static methods cannot be created

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("This is just a normal method");
    }

//    If one of the method is abstract, the class has to be abstract as well
    abstract void career();
    abstract void partner();
}
