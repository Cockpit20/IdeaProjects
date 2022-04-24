package com.soumyadeep;

public class Pattern {
    public static void main(String[] args) {
        //(1/2)
        pattern(5,0);
    }
    static void pattern(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print(col+1);
            pattern(row,col+1);
            System.out.print(col+1);
        }else{
            System.out.println();
            pattern(row-1,0);
            System.out.println();
        }
    }
}
