/*

Program: PersonalAcct.java          Last Date of this Revision: November 19, 2024

Purpose: An application that requires a minimum balance of $100 if the balance falls below then $2 is charged 

Author: Sahil Doad
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

public class PersonalAcct extends Account {
    public PersonalAcct(double balance) {
    // Call the constructor of Account
    	super(balance);
    }
    // Implementation of withdrawal with a penalty for low balance
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            balance -= 2;  // Penalty for falling below $100

        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Personal Account, " + super.toString();
    }
}
