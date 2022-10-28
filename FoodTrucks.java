// *************************************************************************************
// FoodTrucks.java
// Kirsten Scott
// 9/17/2022
// This program allows the user to check a park's event schedule according to the day entered.
// *************************************************************************************

import java.util.Scanner;

public class FoodTrucks
{
    public static void main (String[] args)
    {
        int WeekDay;
        
        Scanner scan = new Scanner (System.in);
        
        // *******************************************************************************
        // Print name of park, title of program, and a greeting for the user.
        // *******************************************************************************
        System.out.print("--------------------------------------------------------------\n");
        System.out.printf("%40s","Shepherd's Park\n");
        System.out.printf("%45s","Event Schedule Application\n");
        System.out.print("--------------------------------------------------------------");
        System.out.println();
        System.out.println("Welcome to Shepherd's Park.");
        System.out.println();
        System.out.println("\tWe are delighted you are interested in the food trucks");
        System.out.println();
        System.out.println("\tcoming to our parks and our special events.");
        System.out.println();
        
        // ********************************************************************************
        // Ask user to input a day of the week and display the appropriate schedule.
        // ********************************************************************************
        System.out.println("Please enter a day of the week (1 for Sunday, 2 for monday ");
        System.out.println();
        System.out.println(",...,7 for Saturday): ");
        System.out.println();
        WeekDay = scan.nextInt();
        System.out.println();
        System.out.println("Food trucks and events for the remainder of the week: ");
        System.out.println();
    
        // *********************************************************************************
        // Use switch statements to determine relevant schedule information.
        // *********************************************************************************
        switch (WeekDay)
        {
            case 1:
                System.out.println("\tSunday Night:");
                System.out.println("\t\tTaco Truck");
                System.out.println("\t\tMike's Burger Truck");
            case 2:
                System.out.println("\tMonday Night:");
                System.out.println("\t\tSushi Truck");
                System.out.println("\t\tBoysBoysBoys Burritos");
                System.out.println("\t\tSPECIAL EVENT: Star Wars Trivia Night");
            case 3:
                System.out.println("\tTuesday Night:");
                System.out.println("\t\tPizza Truck");
                System.out.println("\t\tBob's BBQ");
            case 4:
                System.out.println("\tWednesday Night:");
                System.out.println("\t\tCuban Eats");
                System.out.println("\t\tCoffee Truck");
            case 5:
                System.out.println("\tThursday Night:");
                System.out.println("\t\tHawaiian BBQ Truck");
                System.out.println("\t\tPo Boy Truck");
            case 6:
                System.out.println("\tFriday Night:");
                System.out.println("\t\tSoul Food Grill");
                System.out.println("\t\tTapas Food Truck");
                System.out.println("\t\tSPECIAL EVENT: We Love the 90's Karaoke Night");
            case 7:
                System.out.println("\tSaturday Night:");
                System.out.println("\t\tIce Cream Truck");
                System.out.println("\t\tChinese Takeout Truck");
                break;
            
            // ******************************************************************************
            // Include error-checking in the form of a default statement.
            // ******************************************************************************
            default:
                System.out.println("Invalid weekday entry (must be 1-7).");
        }
    }
}
