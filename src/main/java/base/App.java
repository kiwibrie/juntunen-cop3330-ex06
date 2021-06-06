package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Brianne Juntunen
 *
 * Exercise 6 - Retirement Calculator
Your computer knows what the current year is, which
* means you can incorporate that into your programs.
* You just have to figure out how your programming
* language can provide you with that information.

Create a program that determines how many years you
* have left until retirement and the year you can retire.
* It should prompt for your current age and the age you
* want to retire and display the output as shown in the
* example that follows.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        String curAge = myApp.promptCurrentAge();
        String retAge = myApp.promptRetirementAge();

        String output = myApp.generateOutput(curAge, retAge);
        myApp.printOutput(output);
    }

    public void printOutput(String output){
        System.out.print(output);
    }

    public String generateOutput(String currentAge, String retireAge){
        String getYear = new SimpleDateFormat("yyyy").format(new Date());
        int year = Integer.parseInt(getYear);
        int curAge = Integer.parseInt(currentAge);
        int retAge = Integer.parseInt(retireAge);

        return String.format("You have %d years left until you can retire.\n" +
                "It's %d, so you can retire in %d.",
                (retAge - curAge), year, (year + (retAge - curAge)));
    }

    public String promptCurrentAge(){
        System.out.print("What is your current age? ");
        return in.nextLine();
    }

    public String promptRetirementAge(){
        System.out.print("At what age would you like to retire? ");
        return in.nextLine();
    }
}
