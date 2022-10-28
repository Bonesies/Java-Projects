
// ******************************************************************************
// Caesar.java
// Kirsten Scott
// 9/3/2022
// Encrypt/decrypt a customer's PIN and last 4 of SSN using a Caesar cipher.
// ******************************************************************************

import java.util.Scanner;
    
 public class Caesar
{
    public static void main (String[] args)
    {
        String FirstName, LastName, FullName;
        int PIN, SocialSecurity, ShiftValue, EncryptPIN, EncryptSSN, DecryptPIN,
            DecryptSSN;

        Scanner scan = new Scanner (System.in);
        
        // ***********************************************************************
        // Ask user for first name, last name, PIN, last 4 of SSN, and shift value.
        // ***********************************************************************
        System.out.print ("Enter first name: ");
        FirstName = scan.nextLine();
        System.out.print ("Enter last name: ");
        LastName = scan.nextLine();
        System.out.print ("Enter PIN: ");
        PIN = scan.nextInt();
        System.out.print ("Enter last 4 of SSN: ");
        SocialSecurity = scan.nextInt();
        System.out.print ("Enter shift value: ");
        ShiftValue = scan.nextInt();
        
        // ***********************************************************************
        // Concatenate first and last name and assign to variable.
        // ***********************************************************************
        FullName = FirstName + " " + LastName;
        
        // ***********************************************************************
        // Encrypt PIN and last 4 of SSN.
        // ***********************************************************************
        EncryptPIN = PIN + ShiftValue;
        EncryptSSN = SocialSecurity + ShiftValue;
        
        // ***********************************************************************
        // Decrypt PIN and last 4 of SSN.
        // ***********************************************************************
        DecryptPIN = EncryptPIN - ShiftValue;
        DecryptSSN = EncryptSSN - ShiftValue;
        
        // ***********************************************************************
        // Output user name, PIN, last 4 of SSN, shift value, encrypted PIN/SSN,
        // followed by the decrypted PIN/SSN.
        // ***********************************************************************
        System.out.printf("%-22s%s%n","Customer: ",FullName,"\n");
        System.out.printf("%-22s%s%n","PIN: ",PIN,"\n");
        System.out.printf("%-22s%s%n","Last 4 of SSN: ",SocialSecurity,"\n");
        System.out.printf("%-22s%s%n","Caesar Shift: ",ShiftValue,"\n");
        System.out.printf("%-22s%s%n","Encrypted PIN: ",EncryptPIN,"\n");
        System.out.printf("%-22s%s%n","Encrypted SSN: ",EncryptSSN,"\n");
        System.out.printf("%-22s%s%n","Decrypted PIN: ",DecryptPIN,"\n");
        System.out.printf("%-22s%s%n","Decrypted SSN: ",DecryptSSN,"\n");
            
    }
}
