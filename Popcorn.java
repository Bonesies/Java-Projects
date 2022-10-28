// *************************************************************************
// Popcorn.java
// Kirsten Scott
// 9/10/2022
// Generate a unique receipt for a customer's popcorn and drink order.
// *************************************************************************

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Popcorn
{
    public static void main (String[] args)
    {
        String PurchaseDate, FirstName, LastName, VendorId, ConfirmNum,
        NewDate;
        int BagsOfPopcorn, DrinkNumber, ReceiptNum, AmountOwed;
        final int POPCORN_PRICE = 450, DRINK_PRICE = 100;

        Scanner scan = new Scanner (System.in);
        
        // ******************************************************************
        // Ask user to input date, first name, last name, # of bags of 
        // popcorn purchased, # of drinks purchased, and vendor ID.
        // ******************************************************************
        System.out.print ("Enter date of purchase (MMDDYYY): ");
        PurchaseDate = scan.nextLine();
        System.out.print ("Enter first name: ");
        FirstName = scan.nextLine();
        System.out.print ("Enter last name: ");
        LastName = scan.nextLine();
        System.out.print ("How many bags of popcorn purchased?: ");
        BagsOfPopcorn = scan.nextInt();
        System.out.print ("How many drinks purchased?: ");
        DrinkNumber = scan.nextInt();
        System.out.print ("Enter 5-character vendor ID: ");
        scan.nextLine();
        VendorId = scan.nextLine();
        
        // ******************************************************************
        // Create random object.
        // ******************************************************************
        Random random = new Random();
        
        // ******************************************************************
        // Generate receipt number and assign to variable.
        // ******************************************************************
        ReceiptNum = random.nextInt(3999) + 1000;
        
        // ******************************************************************
        // Build a confirmation number for receipt, assign to variable.
        // ******************************************************************
        ConfirmNum = "POPCORN" + "#" + LastName + "#" +
        FirstName.substring(0,1) + "#" + ReceiptNum + "#" + VendorId;
        
        // ******************************************************************
        // Create new date of purchase with hyphens included.
        // ******************************************************************
        NewDate = PurchaseDate.substring(0,2) + "-" + 
        PurchaseDate.substring(2,4) + "-" + PurchaseDate.substring(4);
        
        // ******************************************************************
        // Calculate the amount the customer owes.
        // ******************************************************************
        AmountOwed = ((BagsOfPopcorn*POPCORN_PRICE)+(DrinkNumber*DRINK_PRICE));
        
        // ******************************************************************
        // Create format object and display a formatted receipt.
        // ******************************************************************
        DecimalFormat MoneyFormat = new DecimalFormat("0.00");
        System.out.println();
        System.out.println("**Kandy's Kountry Kettle Korn**");
        System.out.println();
        System.out.println("Confirmation for "+FirstName+" "+LastName);
        System.out.println();
        System.out.println("Confirmation Number: "+ConfirmNum.toUpperCase());
        System.out.println();
        System.out.printf("%-20s%s%s%s%s","Popcorn: ",BagsOfPopcorn," @ $",
        MoneyFormat.format((double)POPCORN_PRICE/100)," each\n");
        System.out.printf("%-20s%s%s%s%s","Soft Drinks: ",DrinkNumber," @ $",
        MoneyFormat.format((double)DRINK_PRICE/100)," each\n");
        System.out.println();
        System.out.printf("%-20s%s%s%n","TOTAL: ","$",
        MoneyFormat.format((double)AmountOwed/100),"\n");
        System.out.println();
        System.out.println("Thanks for visiting our booth on "+
        NewDate);
    }
}
