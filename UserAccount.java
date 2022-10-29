//********************************************************************
//  UserAccount.java
//  Kirsten Scott
//  10/19/2022
//  This user-defined class creates an account username and password, and
//  contains methods for encrypting and decrypting the user's password
//  using a Caesar cipher. The class is meant to be tested with
//  AccountDriver.java.
//********************************************************************

import java.util.Random;

public class UserAccount
{
   private String userName;
   private String password;
   private int CaesarShift;
   
   // ******************************************************************
   // Default constructor with no parameters.
   // ******************************************************************
   public UserAccount(){
       userName = "";
       password = "";
       CaesarShift = 0;
   }
   
   // ******************************************************************
   // Overloaded constructor that takes 2 parameters. Use loops
   // to validate username and password before updating data.
   // ******************************************************************
   public UserAccount(String userName, String password){
       if(userName.length() >= 8 && userName.length() <= 16)
           this.userName = userName;   
       else
           System.out.println("That's an invalid username!");
       if(password.length() >= 8 && password.length() <= 20)
           this.password = password;
       else
           System.out.println("That's an invalid password!");
   }
   
   // ******************************************************************
   // Create an accessor method to get the username.
   // ******************************************************************
   public String getUserName(){
       return userName;
   }
   
   // ******************************************************************
   // Create an accessor method to get user password.
   // ******************************************************************
   public String getPassword(){
       return password;
   }
   
   // ******************************************************************
   // Create a mutator method to set user password. Validate the password 
   // before updating data.
   // ******************************************************************
   public void setPassword(String password){
       if(password.length() >= 8 && password.length() <= 20)
           this.password = password;
   }
   
   //-----------------------------------------------------------------
   //  This method uses a Caesar  to encrypt the password. 
   //  The shift amount is passed in as a parameter.
   //  It will not encrypt an already encrypted password.
   //-----------------------------------------------------------------
   public void encrypt(int shift)
   {

      if (CaesarShift == 0 && (shift > 0 && shift < 20))
      {
         String masked = "";
         
         for (int index = 0; index < password.length(); index++)
            masked = masked + (char)(password.charAt(index)+shift);
        
         password = masked;
         CaesarShift = shift;
      }

   }

   // ******************************************************************
   // A method to decrypt the password. It will only decrypt a
   // a password that has been encrypted.
   // ******************************************************************
   public void decrypt(int shift){
       if(CaesarShift>0){
           String masked = "";
           
           for(int index=0; index < password.length(); index++)
               masked = masked + (char)(password.charAt(index)-shift);
               
           password = masked;
           CaesarShift = 0;
       }
    }
   
   // ******************************************************************
   // A boolean method that returns true if the password is
   // encrypted (greater than 0).
   // ******************************************************************
   public boolean isEncrypted(){
       return CaesarShift > 0;
   }
   
   // ******************************************************************
   // Override the toString method to return the username and the current
   // version of the password.
   // ******************************************************************
   public String toString(){
       return "Username: " + userName +
           "\nCurrent password: " + getPassword();
   }
   
}
