// Lab 1: AccountTest.java
// Create and manipulate an Account object.

import java.util.Scanner;

public class AccountTest
{
   // main method begins execution of Java application
   public static void main( String args[] ) 
   {
      double creditAmount; // deposit credit amount read from user
      double withdrawalamount;
      Scanner input = new Scanner( System.in );

      Account account1 = new Account(50.00); // create Account object
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      
      System.out.print( "Enter credit amount for account1: " );
      creditAmount = input.nextDouble(); // obtain user input
      System.out.printf( "Adding %.2f to account1 balance\n", creditAmount );
      account1.credit(creditAmount);
      System.out.printf( "account1 balance: $%.2f\n\n", account1.getBalance() );
      
      System.out.print( "Enter withdrawal amount for account1: " );
      withdrawalamount = input.nextDouble(); 
      account1.withdrawal(withdrawalamount);
      System.out.printf( "account1 balance: $%.2f\n\n", account1.getBalance() );


       
       
      Account account2 = new Account(0.00); // create Account object
      System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );

      System.out.print( "Enter withdrawal amount for account2: " );
      withdrawalamount = input.nextDouble(); 
      account2.withdrawal(withdrawalamount);
      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
       
       
     
      input.close();
   } // end main

} // end class AccountTest
