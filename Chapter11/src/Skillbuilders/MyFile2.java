package Skillbuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile2 {
    public static void main(String[] args) {
      
        File file = new File("../Chapter11/src/Skillbuilders/zzz.txt");
        Scanner scanner = new Scanner(System.in);
        
        try {
          
            if (file.exists()) {
                System.out.println("File already exists.");
                
              
                System.out.println("Do you want to delete it? (yes/no): ");
                String response = scanner.nextLine();
                
             
                if (response.equalsIgnoreCase("yes")) {
                    if (file.delete()) {
                        System.out.println("File has been deleted successfully.");
                    } else {
                        System.out.println("Failed to delete the file.");
                    }
                }
            } else {
               
                if (file.createNewFile()) {
                    System.out.println("File has been created successfully.");
                } else {
                    System.out.println("Failed to create the file.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
       
        scanner.close();
    }
}
