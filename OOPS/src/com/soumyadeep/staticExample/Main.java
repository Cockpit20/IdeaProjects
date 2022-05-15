package com.soumyadeep.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal=new Human(22,"Kunal",10000,false);
        Human rahul=new Human(34,"Rahul",15000,true);
        Human arpit=new Human(20,"Arpit",8000,false);

        System.out.println(Human.population);

        // Object created to run non-static method fun();
        Main fun2=new Main();
        fun2.fun2();

        fun();
    }

    static void fun(){
        // Object created to run non-static method greeting();
        Main obj=new Main();
        obj.greeting();
    }

    // Non-static methods need an object to run
    void fun2(){
        greeting();
    }

    void greeting(){
        System.out.println("HELLO WORLD");
    }
}
