package org.example;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main(String[] args)
    {

        //System Year
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");

        String str_year = format.format(date);
        int year = Integer.parseInt(str_year);

        System.out.print("What is your current age? ");
        Scanner input = new Scanner(System.in);
        String age1 = input.next();

        System.out.print("At what age would you like to retire? ");
        String age2 = input.next();

        int age_1 = Integer.parseInt(age1);
        int age_2 = Integer.parseInt(age2);

        int yearsremain = age_2 - age_1;
        System.out.println("You have " + yearsremain + " years left until you can retire.");

        System.out.print("It's " + year + ", so you can retire in " + (year + yearsremain) + ".");
    }
}
