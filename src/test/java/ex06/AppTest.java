/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_calendar_year_and_calculations() {
        App myApp = new App();

        int yearsToRetire = 65-25;
        int current = 2021;
        int retirement = 2021 + yearsToRetire;

        String expectedOutput = "You have 40 years left until you can retire.\nIt's 2021, so you can retire in 2061.";

        String actualOutput = myApp.concatString(yearsToRetire, current, retirement);

        assertEquals(expectedOutput, actualOutput);
    }

}