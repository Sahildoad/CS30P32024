/*

Program: FindAndReplace.java          Last Date of this Revision: October 21, 2024

Purpose: An application that replaces a word or a phrase in a file 

Author: Sahil Doad
School: CHHS
Course: Computer Science 30
 

*/

package Mastery;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();

        System.out.print("Enter the word or phrase to search: ");
        String searchWord = scanner.nextLine();

        System.out.print("Enter the replacement word or phrase: ");
        String replacementWord = scanner.nextLine();

        try {
           
            String content = new String(Files.readAllBytes(Paths.get(filename)));

            String updatedContent = content.replace(searchWord, replacementWord);

            try (PrintWriter writer = new PrintWriter(filename)) {
                writer.write(updatedContent);
            }

            System.out.println("Replacement completed successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("The file '" + filename + "' does not exist.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}


/* Screen Dump

Enter the file name: ../Chapter11/src/Mastery/FindAndReplace.txt
Enter the word or phrase to search for: Hello My Name is Sahil Doad im in computer science 20
Enter the replacement word or phrase: Hello My Name is Sahil Doad im in computer science 30
Replacement completed successfully.

  */



