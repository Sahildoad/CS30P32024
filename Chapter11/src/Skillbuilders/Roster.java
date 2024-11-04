package Skillbuilders;

import java.io.*;
import java.util.Scanner;

public class Roster {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the file name to store student data (e.g., students.dat): ");
        String fileName = input.nextLine();

      
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine();  
       
        StuName[] students = new StuName[numStudents];

      
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter first name of student " + (i + 1) + ": ");
            String firstName = input.nextLine();
            System.out.print("Enter last name of student " + (i + 1) + ": ");
            String lastName = input.nextLine();

            students[i] = new StuName(firstName, lastName);
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (StuName student : students) {
                out.writeObject(student);
            }
            System.out.println("Student data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

     
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            System.out.println("\nClass Roster:");
            for (int i = 0; i < numStudents; i++) {
                StuName student = (StuName) in.readObject();
                System.out.println(student);
            
            }
        }
    }
}
          
