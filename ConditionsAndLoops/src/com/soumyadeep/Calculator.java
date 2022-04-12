package com.soumyadeep;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true)
        {
            System.out.println("Enter an operator: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.println("Enter 2 numbers: ");
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                if (op == '+')
                {
                    ans = n1 + n2;
                }
                if (op == '-')
                {
                    ans = n1 - n2;
                }
                if (op == '*')
                {
                    ans = n1 * n2;
                }
                if (op == '/')
                {
                    if (n2 != 0)
                        ans = n1 / n2;
                }
                if (op == '%')
                {
                    ans = n1 % n2;
                }

                System.out.println(ans);
            } else if (op == 'x' || op == 'X')
                break;
            else
            {
                System.out.println("Invalid operator");
            }
        }
    }
}
