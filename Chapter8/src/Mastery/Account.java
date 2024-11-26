/*

Program: Account.java          Last Date of this Revision: November 19, 2024

Purpose: An application that checks the balances and amount

Author: Sahil Doad
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;
//Abstract base class for accounts
public abstract class Account {
	 // Shared balance field
	protected double balance;

	 //  initialize balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Abstract method for withdrawal
    public abstract void withdraw(double amount);

    // Get the current balance
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Balance: $" + balance;
    }
}
