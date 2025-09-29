/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author RC_Student_Lab
 */
public class JavaApplication1 {

    private static int[][] runsScored;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Batsmen
        String[] batsmen={"Jacques Kallis","Hashim Amla", "AB de Villiers"};
        
        // Stadiums
        String[] stadiums= {"Kingsmead", "St Georges's", "Wanders"};
        
        //Runs scored: rows= batsmen, colums= stadiums
        int[][] runs = {
            {5000, 3500, 6200}, //Jacques Kallis
            {3800, 3700, 5000}, // Hashim Amla
            {4200, 3000, 5200}, //AB de Villiers
        }
                
        //Calculate total runs scored by each batsmen
        int[] totalRunsPerBatsmen = new int[batsmen.length];
        for (int i = 0;i ,< batsmen.length; i++) {
             for (int j = 0; j < stadiums.length; j++) {
                 totalRunsPerBatsmen[i] += runsScored[i][j];
             }
    }
        
    // Display total runs scored by each batsmen
    System.out.printIn("Total Runs Scored by Each Batsmen:");
    for (int i = 0; i < batsmen.length; i++) {
        System.out.printIn(batsmen[i] + ": "+ totalRunsPerBatsmen[i]);
             }
    // Calculate highest runs scored per stadium
    int[] highestRunsPerStadium = new int[stadiums.length];
    String[]highestScorePerStadium = new String[stadiums.length];
    for (int j = 0; j < stadiums.length; j++) {
        int maxRuns = 0;
            int highestScore = 0;
        for (int i = 0; i < batsmen.length; i++){
            if (runsScored[i][j] > maxRuns) {
                maxRuns = runsScored[i][j];
                highestScorer = batsmen[i];
            }
        }
        highestRunsPerStadium = new int[stadium.length];
        for (int i = 0; i < stadiums.length; j++){
            for (String stadium : stadiums) {
            }
        }
     
    int maxRuns = 0;
    String stadiumWithMostRuns = "";
    for (int i = 0; i < stadiums.length; i++) {
        if (totalRunsPerStadium[i > maxRuns]){
    }
           
    }
    }
   
    
}
