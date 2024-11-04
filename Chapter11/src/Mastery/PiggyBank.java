/*

Program: MySavings.java          Last Date of this Revision: October 31, 2024

Purpose: An application that Stores Money in a File for the user 

Author: Sahil Doad
School: CHHS
Course: Computer Science 30
 

*/
package Mastery;

import java.io.*;


class PiggyBank implements Serializable {

 private double total;

 public PiggyBank() 
 {
     total = 0.0;
 }

 public void addPenny() {
     total += 0.01;
 }

 public void addNickel() {
     total += 0.05;
 }

 public void addDime() {
     total += 0.10;
 }

 public void addQuarter() {
     total += 0.25;
 }

 public void takeMoneyOut(double amount) {
     if (amount <= total) {
         total -= amount;
         System.out.println("You took out: $" + amount);
     } else {
         System.out.println("Not enough funds.");
     }
 }

 public double getTotal() {
     return total;
 }

 public void addAmount(double amount) {
     total += amount;
 }


}

/* Screen Dump


1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 4

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 2

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 1
Total in bank: $0.86

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 0
Exiting and saving data...


  */

