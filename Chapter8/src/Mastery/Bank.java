/*

Program: Bank.java          Last Date of this Revision: November 19, 2024

Purpose: An application that checks the personal and business Acct to withdrawal deposit or check account balance 

Author: Sahil Doad
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
    	// Create instances of Personal and Business accounts
        PersonalAcct personalAcct = new PersonalAcct(150);
        BusinessAcct businessAcct = new BusinessAcct(600);

        Scanner input = new Scanner(System.in);
        String action;
        // Default to personal account
        Account account = personalAcct; 

        do {
        	// Display menu for user action
            System.out.println("\n(A)ccount Details \\ (D)eposit \\ (W)ithdraw \\ (Q)uit");
            System.out.print("Enter choice: ");
            action = input.next();

            if (!action.equalsIgnoreCase("Q")) {
            	 // Ask for the account type
                System.out.print("Enter Account type (1 for Personal, 2 for Business): ");
                int acctType = input.nextInt();

                // Assign the selected account
                switch (acctType) {
                    case 1:
                        account = personalAcct;
                        break;
                    case 2:
                        account = businessAcct;
                        break;
                    default:
                        System.out.println("Invalid Account type!");
                        continue;
                }

                // Perform actions based on user input
                if (action.equalsIgnoreCase("A")) {
                    System.out.println(account);
                } else if (action.equalsIgnoreCase("D")) {
                    System.out.print("Enter deposit amount: ");
                    double amount = input.nextDouble();
                    account.deposit(amount);
                    System.out.println("Deposit successful.");
                } else if (action.equalsIgnoreCase("W")) {
                    System.out.print("Enter withdraw amount: ");
                    double amount = input.nextDouble();
                    account.withdraw(amount);
                    System.out.println("Withdrawal successful.");
                }
            }
        } while (!action.equalsIgnoreCase("Q"));

        System.out.println("Exiting program.");
        input.close();
    }
}
/* Screen Dump


(A)ccount Details \ (D)eposit \ (W)ithdraw \ (Q)uit
Enter choice: A
Enter Account type (1 for Personal, 2 for Business): 1
Personal Account, Balance: $150.0

(A)ccount Details \ (D)eposit \ (W)ithdraw \ (Q)uit
Enter choice: A
Enter Account type (1 for Personal, 2 for Business): 2
Business Account, Balance: $600.0

(A)ccount Details \ (D)eposit \ (W)ithdraw \ (Q)uit
Enter choice: W
Enter Account type (1 for Personal, 2 for Business): 1
Enter withdraw amount: 100
Withdrawal successful.

(A)ccount Details \ (D)eposit \ (W)ithdraw \ (Q)uit
Enter choice: A
Enter Account type (1 for Personal, 2 for Business): 1
Personal Account, Balance: $48.0

(A)ccount Details \ (D)eposit \ (W)ithdraw \ (Q)uit
Enter choice: Q
Exiting program.
 
 */