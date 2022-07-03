package com.soumyadeep.generics;

import java.util.Arrays;

public class CustomGenArrayList<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenArrayList(){
        data=new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;
    }

    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }

    private boolean isFull() {
        return size== data.length;
    }

    @Override
    public String toString() {
        return  Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list=new CustomGenArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);

    }
}
