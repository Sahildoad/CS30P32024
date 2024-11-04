package Skillbuilders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Stats1 {

    public static void main(String[] args) {
        File dataFile = new File("../Chapter11/src/Skillbuilders/Stats1.dat");
        BufferedReader readFile;
        String name;
        String score;
        int totalScores = 0;
        int numScores = 0;
        double avgScore = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        
        try {
            readFile = new BufferedReader(new FileReader(dataFile));
            
            while ((name = readFile.readLine()) != null) {
                score = readFile.readLine();
                System.out.println("Student: " + name + ", Score: " + score);
                
              
                int scoreValue = Integer.parseInt(score);
                totalScores += scoreValue;
                numScores++;
                
                if (scoreValue > highestScore) {
                    highestScore = scoreValue;
                }
                
                if (scoreValue < lowestScore) {
                    lowestScore = scoreValue;
                }
            }
            
            avgScore = (double) totalScores / numScores;
            System.out.println("Average Score: " + avgScore);
            System.out.println("Highest Score: " + highestScore);
            System.out.println("Lowest Score: " + lowestScore);
            
            readFile.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
