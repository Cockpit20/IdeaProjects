package com.soumyadeep.singleton;

import com.soumyadeep.access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj= Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();

        // ALL 3 VARIABLES POINT TO JUST ONE OBJECT



        A a=new A(34,"Kunal");
        a.getNum();
//        int n=a.num;
    }
}
