package com.soumyadeep.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj=new A(34,"Kunal");


//        ArrayList<Integer> list=new ArrayList<>();

        obj.getNum();
        int n=obj.num;
    }
}

// Access Modifiers:
// 1. Private: Cannot be accessed outside the class
//    (Exception : Can be accessed through getters and setters)
//    Used to hide sensitive data

// 2. Public: Can be accessed everywhere

// 3. No/Default Access Modifier: Cannot be accessed outside the package
//    Not to be used outside a particular package

// 4. Protected: Cannot be used in a different package
//    But can be used in subclass of a different package
//    Not to be used in a different package
//    Unless it is to be used in the subclass of the package

//    Only the subclass of a different package can access the protected members
