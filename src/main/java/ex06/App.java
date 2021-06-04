/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex06;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String curAge = myApp.currentAge();
        String retireAge = myApp.retirementAge();

        int yearsToRetire = myApp.yearsToRetirement(curAge, retireAge);

        int curYear = myApp.curYear();
        int retirementYear = myApp.retireYear(curYear, yearsToRetire);

        String generateOutput = myApp.concatString(yearsToRetire, curYear, retirementYear);
        myApp.output(generateOutput);

    }

    public String currentAge() {
        System.out.print("What is your current age? ");
        return in.nextLine();
    }

    public String retirementAge() {
        System.out.print("At what age would you like to retire? ");
        return in.nextLine();
    }

    public int yearsToRetirement(String curAge, String retireAge) {
        return Integer.parseInt(retireAge) - Integer.parseInt(curAge);
    }

    public int curYear(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.get(Calendar.YEAR);
    }

    public int retireYear(int curYear, int addYears) {
        return curYear + addYears;
    }

    public String concatString(int yearsToRetire, int curYear, int retirementYear) {
        return String.format("You have %d years left until you can retire.\nIt's %d, so you can retire in %d.",
                yearsToRetire, curYear, retirementYear);
    }

    public void output(String output) {
        System.out.println(output);
    }
}
