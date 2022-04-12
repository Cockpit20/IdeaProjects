package com.soumyadeep;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int empID= input.nextInt();
        String department=input.next();
        switch (empID)
        {
            case 1:
                System.out.println("Soumyadeep Chnadra");
                break;
            case 2:
                System.out.println("Shreyan Pal");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Invalid department");
                }
                break;
            default:
                System.out.println("Invalid ID");
        }
    }
}
