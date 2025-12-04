package Jobsheet11;
import java.util.Scanner;
public class customerSatisfactionSurvey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int respondents = 10;
        int questions = 6;
        int[][] survey = new int[respondents][questions];

        // Input survey results
        System.out.println("=== Customer Satisfaction Survey ===");
        for (int i = 0; i < respondents; i++) {
            System.out.println("\nRespondent " + (i + 1) + ":");
            for (int j = 0; j < questions; j++) {
                System.out.print("Enter score for Question " + (j + 1) + " (1-5): ");
                survey[i][j] = input.nextInt();
            }
        }

        // Display average score for each respondent
        System.out.println("\n--- Average Score per Respondent ---");
        for (int i = 0; i < respondents; i++) {
            double sum = 0;
            for (int j = 0; j < questions; j++) {
                sum += survey[i][j];
            }
            double avg = sum / questions;
            System.out.println("Respondent " + (i + 1) + ": " + avg);
        }

        // Display average score for each question
        System.out.println("\n--- Average Score per Question ---");
        for (int j = 0; j < questions; j++) {
            double sum = 0;
            for (int i = 0; i < respondents; i++) {
                sum += survey[i][j];
            }
            double avg = sum / respondents;
            System.out.println("Question " + (j + 1) + ": " + avg);
        }

        // Display overall average score
        double totalSum = 0;
        for (int i = 0; i < respondents; i++) {
            for (int j = 0; j < questions; j++) {
                totalSum += survey[i][j];
            }
        }
        double overallAvg = totalSum / (respondents * questions);
        System.out.println("\nOverall Average Score: " + overallAvg);

        input.close();
    }
}

