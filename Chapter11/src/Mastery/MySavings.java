/*

Program: MySavings.java          Last Date of this Revision: October 31, 2024

Purpose: An application that Stores Money in a File for the user 

Author: Sahil Doad
School: CHHS
Course: Computer Science 30
 

*/

package Mastery;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MySavings {
	
     static PiggyBank piggyBank = new PiggyBank();
     
    
     public static PiggyBank loadFromFile() 
     {
         try{
        	 /*read object */
        	 
        	 //FileInputStrea ....
        	 //ObjectInputStream  readBank ...
        	 //piggyBank = (PiggyBank) ..STR..STR..STR..STR.
        	 
             FileInputStream fileIn = new FileInputStream("../Chapter11/src/Mastery/piggybank.dat");
            
             ObjectInputStream readBank = new ObjectInputStream(fileIn);
             
             
             piggyBank = (PiggyBank) readBank.readObject();        	
        	 
        	 readBank.close();
            
         } catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} catch (IOException e) {
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	} catch (ClassNotFoundException e) {
			System.out.println("Class could not be used to cast object.");
    		System.err.println("ClassNotFoundException: " + e.getMessage());
		}
         
		return(piggyBank);
     }
	
      public static void storeFile(PiggyBank piggyBank) 
    
      {
    	 
    	 try{
        	 /*write object */
        	 
        	 //FileOutputStrea ....
        	 //ObjectOutputStream writeBank...
        	 //writeBank.writeObjec....
    		 //writeBank...
    		 
    		 FileOutputStream fileOut = new FileOutputStream("../Chapter11/src/Mastery/piggybank.dat");
             ObjectOutputStream writeBank = new ObjectOutputStream(fileOut);
             
             writeBank.writeObject(piggyBank);
           
             writeBank.close();

                        
         } catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} catch (IOException e) {
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	}
    	 
     }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
          int choice;

        do {
            System.out.println("\n1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Total in bank: $" + piggyBank.getTotal());
                case 2 -> piggyBank.addPenny();
                case 3 -> piggyBank.addNickel();
                case 4 -> piggyBank.addDime();
                case 5 -> piggyBank.addQuarter();
                case 6 -> {
                    System.out.print("Enter amount to take out: ");
                    double amount = scanner.nextDouble();
                    piggyBank.takeMoneyOut(amount);
                }
                case 0 -> {
                    System.out.println("Exiting and saving data...");
                    storeFile(piggyBank);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        
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
