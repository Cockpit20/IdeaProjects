package com.soumyadeep.generics.comparing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal=new Student(12,89.76f);
        Student rahul=new Student(5,99.52f);
        Student karan=new Student(2,95.76f);
        Student sachin=new Student(13,77.52f);

        Student[] list={kunal,rahul,karan,sachin};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks- o2.marks));
        System.out.println(Arrays.toString(list));

        if(kunal.compareTo(rahul)<0){
            System.out.println("Rahul has more marks than Kunal");
        }
    }
}
