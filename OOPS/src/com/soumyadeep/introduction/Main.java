package com.soumyadeep.introduction;

import java.util.Arrays;

public class Main {
    //CLASSES, OBJECTS & CONSTRUCTOR

    public static void main(String[] args) {
	// write your code here
        int[] numbers=new int[5];

        String[] names=new String[5];

        int[] rn0=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];


        // CREATED A ARRAY OF CLASS (USER_DEFINED DATA_TYPE) CALLED STUDENT
        Student[] students=new Student[5];


        Student kunal=new Student(13,"Kunal Kushwaha",87.2f);
        //        kunal.name="Kushwaha";
        //        kunal.rn0=25;
        //        kunal.marks=87.2f;

        Student random=new Student(kunal);
        System.out.println(random.name);

        Student random2=new Student();
        System.out.println(random2.name);

        // TWO VARIABLES POINTING TO THE SAME OBJECT
        Student one=new Student();
        Student two=one;

        one.name="Something Something";
        System.out.println(two.name);

//        System.out.println(kunal.name);
//        System.out.println(kunal.rn0);
//        System.out.println(kunal.marks);

        kunal.changeName("Shoe Lover");
        kunal.greeting();
    }

    // Same as struct in C and C++
    // Class
    static class Student{
        // Objects under CLASS STUDENT
        int rn0;
        String name;
        float marks;

        // FUNCTION FOR GREETING
        void greeting(){
            System.out.println("Hello! My name is "+this.name);
        }

        // FUNCTION TO CHANGE NAME
        void changeName(String newName){
            this.name=newName;
        }

        // Constructor
        Student(){
            // This keyword
            // USING OTHER CONSTRUCTOR
            this(13,"Default Person",87.2f);
        }

        Student (Student other){
            // USING OBJECTS OF OTHER CONSTRUCTOR
            this.name=other.name;
            this.rn0=other.rn0;
            this.marks= other.marks;
        }

        Student(int rn0,String name,float marks){
            // CONSTRUCTOR (PASSED BY VALUE)
            this.name=name;
            this.rn0=rn0;
            this.marks=marks;
        }
    }
}
