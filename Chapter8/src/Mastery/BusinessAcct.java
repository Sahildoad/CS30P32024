/*

Program: BusinessAcct.java          Last Date of this Revision: November 19, 2024

Purpose: An application that requires a minimum balance of $500 if the balance falls below then $10 is charged 

Author: Sahil Doad
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

public class BusinessAcct extends Account {
    public BusinessAcct(double balance) {
    // Call the constructor of Account
    	super(balance);
    }
    // Implementation of withdrawal with a penalty for low balance
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 500) {
            balance -= 10;  // Penalty for falling below $500
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Business Account, " + super.toString();
    }
}
