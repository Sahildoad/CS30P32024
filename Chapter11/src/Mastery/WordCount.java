/*

Program: WordCount.java          Last Date of this Revision: October 21, 2024

Purpose: An application That goes in a file and tells the user Number of words and Average word length

Author: Sahil Doad, 
School: CHHS
Course: Computer Science 30
 

*/

package Mastery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String fileName = "../Chapter11/src/Mastery/source.txt"; 
        int wordCount = 0;
        int totalLength = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+"); 
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                        totalLength += word.length();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (wordCount > 0) {
            double averageWordLength = (double) totalLength / wordCount;
            System.out.println("Number of words: " + wordCount);
            System.out.println("Average word length: " + averageWordLength);
        } else {
            System.out.println("No words found.");
        }
    }
}

/* Screen Dump

Number of words: 6
Average word length: 3.6666666666666665
 
 */
