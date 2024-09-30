package com.pluralsight;

import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {

//        //Invoking or calling (Instance)
//        Calculator calc = new Calculator();
//        calc.addInstance(1,2);
//
//        //Invoking or calling (Static) Inside the same class
//        addStatic(3,4);
//        //Outside the class
//        Calculator.addStatic(5,6);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("do you want to add anymore numbers? Y/N");
        String input = sc.next();

        if(input.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter a third number: ");
            int c = sc.nextInt();
            System.out.println("Would you like to add anymore numbers? Y/N");
            String input2 = sc.next();
            if(input2.equalsIgnoreCase("Y"))
            {
                System.out.println("Enter a fourth number: ");
            }
        }

    }


    public static int add(int a, int b)
    {
        int c = a + b;
        return c;
    }

    public static int subtract(int a, int b)
    {
        int c = a - b;
        return c;
    }

    public static int multiply(int a, int b)
    {
        int c = a * b;
        return c;
    }

    public static int divide(int a, int b)
    {
        int c = a / b;
        return c;
    }

    public static double mod(double a, double b)
    {
        double c = a % b;
        return c;
    }

    public static double area(double a, double b)
    {
        double c = a * b;
        return c;
    }

    public static double perrimeter(double a, double b, double c, double d)
    {
        double e = a + b + c + d;
        return e;
    }




//    public void addInstance(int num1, int num2)
//    {
//        System.out.println(num1 + num2);
//
//    }
//
//    public static void addStatic(int num1, int num2)
//    {
//        System.out.println(num1 + num2);
//
//    }
}