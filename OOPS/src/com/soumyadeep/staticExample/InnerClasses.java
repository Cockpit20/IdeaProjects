package com.soumyadeep.staticExample;

import java.util.Arrays;

public class InnerClasses {
    // ONLY INNER CLASSES CAN BE STATIC
    static class Test{
        // CLASS TEST IN NOT DEPENDENT ON OBJECTS OF OUTER CLASS i.e. TEST
        String name;
        public Test(String name){
            this.name=name;
        }

        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("Kunal");
        Test b=new Test("Rahul");

        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);

        Arrays.toString(new int[]{3,4,5});
    }
}

//static class A{
//
//}
