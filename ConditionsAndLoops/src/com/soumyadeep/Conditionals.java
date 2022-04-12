package com.soumyadeep;

public class Conditionals {

    public static void main(String[] args) {
	// write your code here
        int salary=25400;
        if (salary>10000 && salary<20000)
            salary=salary+2000;
        else if (salary >20000 )
            salary=salary+3000;
        else
            salary=salary+1000;
        System.out.println(salary);
    }
}
