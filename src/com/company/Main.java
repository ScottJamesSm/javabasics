package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //b/oolean hasACat = true;

        //char favoriteLetter = 'c';

      //  String typeOfDay = "good day";

    //    int evenNumber = 1232;

  //      double numberWithDecimal = 1232.022;


//        int add = 5 + 4;
        //int subtract = 5 - 4;
        //int multiply = 5 * 4;
        //int divide = 5 / 4;
// System.out.println("the time of day is" + (5 - 2));

      //  System.out.println(divide);

        //System.out.println("this is the modulo" + ( 4 % 5));
    // EX of concatination
        String hello = "Hello";
        String name = "scott";
                System.out.println(hello + " " + name);
               Scanner input = new Scanner (System.in);
    //Scanner input = new Scanner (System.in);
        System.out.println("what is your name?");
       name = input.nextLine();
        System.out.println(hello + " " + name);

        System.out.println("what greeting do you like?");

        hello = input.nextLine();

        System.out.println(hello + " " + name);
        System.out.println("what is your age");
                int age = input.nextInt();
        System.out.println(hello + " " + name);
        System.out.println(hello + name+ "! " + "You are" + age);
    }

}
