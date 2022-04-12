package com.soumyadeep;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(10);
        list.add(67); //adding integer to list
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        System.out.println(list.contains(657)); //returns true or false based on whether the integer is present or not
        list.set(0,99); //sets the value of provided index of the list to a new value
        list.remove(2); //removes the value at provided index
        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);
    }
}
