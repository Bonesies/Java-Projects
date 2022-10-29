// ****************************************************************************
// AccountDriver.java
// Kirsten Scott
// 10/19/2022
// This class serves as the driver for UserAccount.java. It tests the class 
// constructor, accessors, mutator, encrypt(), and decrypt() methods.
// ***************************************************************************

import java.util.Scanner;

public class AccountDriver
{
    public static void main (String[] args){

        String userName = "", password = "", pass;
        int CaesarShift = 0, count = 0;

        Scanner scan = new Scanner(System.in);
        
        // *******************************************************************
        // Inform the user that the constructors are being tested, then
        // prompt them to create a user name and password.
        // *******************************************************************
        System.out.println("This part of the program will test constructors.");
        System.out.println("Enter a username (8-16 characters): ");
        userName = scan.nextLine();
        System.out.println();
        System.out.println("Enter a password (8-20 characters): ");
        password = scan.nextLine();
        System.out.println();
        
        // *******************************************************************
        // Instantiate a new UserAccount object and pass the entered username and 
        // password as parameters.
        // *******************************************************************
        UserAccount user1 = new UserAccount(userName, password);
        user1.setPassword(password);
        
        // *******************************************************************
        // Display the newly created object to the user.
        // *******************************************************************
        System.out.println();
        System.out.println(user1.toString());
        
        // *******************************************************************
        // Use a loop that allows the user to test the UserAccount constructor
        // 3 times.
        // *******************************************************************
        while(count<3){
            System.out.println();
            System.out.println("Enter a username (8-16 characters): ");
            userName = scan.nextLine();
            System.out.println();
            System.out.println("Enter a password (8-20 characters): ");
            password = scan.nextLine();
            System.out.println();
            UserAccount user2 = new UserAccount(userName, password);
            user2.setPassword(password);
            System.out.println(user2.toString());
            count++;
        }
        
        System.out.println();
        System.out.println("This part of the program will test accessors.");
        
        // *******************************************************************
        // Instantiate a new UserAccount object with the username John Smith and
        // password Zab98W55k and display the information using getUserName()
        // and getPassword() accessors to ensure they function correctly.
        // *******************************************************************
        UserAccount testUser = new UserAccount ("John Smith","Zab98W55k");
        System.out.println("Username: "+ testUser.getUserName());
        System.out.println("Password: "+ testUser.getPassword());
        
        // *******************************************************************
        // Inform the user that the mutator is being tested.
        // *******************************************************************
        System.out.println();
        System.out.println("This part of the program will test the mutator.");
        System.out.println("Enter a new password for John Smith: ");
        pass = scan.nextLine();
        testUser.setPassword(pass);
        System.out.println("New password: " + testUser.getPassword());
        
        // *******************************************************************
        // Inform the user that the encryption method is being tested and display
        // username and password, pre-encryption.
        // *******************************************************************
        System.out.println();
        System.out.println("This part of the program will test the encryption.");
        System.out.println();
        System.out.println("Before encryption: ");
        System.out.println(testUser.toString());
        System.out.println();
        
        // *******************************************************************
        // Ask user to pick a shift value between 1 and 19.
        // *******************************************************************
        System.out.println("Enter a shift amount(between 1 and 19): ");
        int shift = scan.nextInt();
        scan.nextLine();
        
        // *******************************************************************
        // Call the encryption method for the object and display new data.
        // Try to encrypt a second time to ensure an already encrypted password
        // is not encrypted again.
        // *******************************************************************
        testUser.encrypt(shift);
        System.out.println("After encryption- first time: ");
        System.out.println(testUser.toString());
        System.out.println();
        testUser.encrypt(shift);
        System.out.println("After encryption- second time: ");
        System.out.println(testUser.toString());
        
        // *******************************************************************
        // New object to test these steps again so valid and invalid 
        // values can be tested.
        // *******************************************************************
        UserAccount testUser1 = new UserAccount ("John Smith","Zab98W55k");
        System.out.println();
        System.out.println("Let's test the encryption again.");
        System.out.println("Before encryption: ");
        System.out.println(testUser1.toString());
        System.out.println();
        System.out.println("Enter a shift amount(between 1 and 19): ");
        shift = scan.nextInt();
        scan.nextLine();
        testUser1.encrypt(shift);
        System.out.println("After encryption- first time: ");
        System.out.println(testUser1.toString());
        System.out.println();
        testUser1.encrypt(shift);
        System.out.println("After encryption- second time: ");
        System.out.println(testUser1.toString());
        System.out.println();
        
        System.out.println("This part of the program will test the decryption.");
        System.out.println();
        
        // *******************************************************************
        // Instantiate a new object with different arguments. Repeat encryption
        // steps.
        // *******************************************************************
        UserAccount testUser2 = new UserAccount ("Sally McIntosh","B1N8hop10");
        System.out.println("Before encryption: ");
        System.out.println(testUser2.toString());
        System.out.println();
        System.out.println("Enter a shift amount(between 1 and 19): ");
        shift = scan.nextInt();
        scan.nextLine();
        testUser2.encrypt(shift);
        System.out.println("After encryption: ");
        System.out.println(testUser2.toString());
        
        // *******************************************************************
        // Call the isEncrypted() method and display boolean value.
        // *******************************************************************
        System.out.println("Encryption status: " + testUser2.isEncrypted());
        
        // *******************************************************************
        // Call decrypt() method to test decryption. Display the result.
        // *******************************************************************
        testUser2.decrypt(shift);
        System.out.println();
        System.out.println("After decryption: ");
        System.out.println(testUser2.toString());
        
        // *****************************************************************
        // Try to decrypt a second time to ensure an already decrypted password
        // is not changed.
        // *****************************************************************
        testUser2.decrypt(shift);
        System.out.println();
        System.out.println("After decryption: ");
        System.out.println(testUser2.toString());
        
        // *******************************************************************
        // Call the isEncrypted() method again.
        // *******************************************************************
        System.out.println("Encryption status: " + testUser2.isEncrypted());
        
        System.out.println();
        System.out.println("Testing ended");
    }
}
