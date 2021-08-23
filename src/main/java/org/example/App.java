/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        //creating Scanner object
        Scanner s = new Scanner(System.in);

        String in;

        //input
        System.out.print("What is your name? ");

        in = s.nextLine();

        //string concatenation
        in = "Hello, " + in + ", nice to meet you!";

        //output
        System.out.print(in);

        //closing Scanner object
        s.close();
    }
}
