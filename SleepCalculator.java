
//*******************************************************************
// SleepCalculator.java
// Kirsten Scott
// 8/28/2022
// This program is meant to calculate the number of hours, days and
// years the user has spent sleeping.
//******************************************************************* 

import java.util.Scanner;
public class SleepCalculator
{
    public static void main (String[] args)
    {  
        //************************************************************
        // Declare the variables and constants.
        //************************************************************
        String name;
        int CurrentAge;
        final int ONE_DAY=24, ONE_YEAR=365;
        float AvgHours, HoursSlept, DaysSlept, YearsSlept;

        Scanner scan = new Scanner (System.in);
        
        //************************************************************
        // Get input for user's name, age and average hours slept per
        // night.
        //************************************************************
        System.out.println ("Enter name: ");
        name = scan.nextLine();
        System.out.println ("Enter age: ");
        CurrentAge = scan.nextInt();
        System.out.println ("Enter average hours slept per night: ");
        AvgHours = scan.nextFloat();
        
        //************************************************************
        // Calculate the hours the user has slept in their life.
        //************************************************************
        HoursSlept = CurrentAge * ONE_YEAR * AvgHours;
        
        //************************************************************
        // Calculate the days the user has slept in their life.
        //************************************************************
        DaysSlept = HoursSlept / ONE_DAY;
        
        //************************************************************
        // Calculate the years user has slept in their life.
        //************************************************************
        YearsSlept = DaysSlept / ONE_YEAR;
        
        //************************************************************
        // Display results for each calculation.
        //************************************************************
        System.out.println ("Number of hours slept: " + HoursSlept);
        System.out.println ("Number of days slept: " + DaysSlept);
        System.out.println ("Number of years slept: " + YearsSlept);
    }
}
