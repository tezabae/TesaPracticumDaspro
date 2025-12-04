package Learningjava;
import java.util.Scanner;
public class LearningJava1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int respondents = 10;
        int questions = 6;
        int[][] survey = new int [respondents] [questions];

        //Storing the survey result
        System.out.println("===Customer Satisfaction Survey===");
        for (int i = 0; i < respondents; i++ ) {
             System.out.println("\nRespondent " + (i + 1) + ":");
             for (int j = 0; j < questions; j++) {
             System.out.println("\nEnter the score" + (j + ":"));
             survey [i][j] = input.nextInt();
        }
    }
        //Display average score each respondents
        System.out.println("===Average Score Per Respondent===");
        for (int i = 0; i < respondents; i++) {
            double sum = 0;
            for (int j = 0; j < questions; j++) {
                sum += survey [i][j];
            }
            double avg = sum / questions;
            System.out.println("Respondent" + (i ));
    }
        //
        }

         
    }

