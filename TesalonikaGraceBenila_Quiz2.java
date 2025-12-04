import java.util.Scanner;
public class TesalonikaGraceBenila_Quiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int places = 6;
        int programs = 4;
        int [][] survey = new int[places][programs];

        //Storing or input survey result
        System.out.println("===PUBLIC SATISFACTION SURVEY===");
        for (int i = 0; i < places; i++) {
            System.out.println("\nPlaces " + (i + 1) + ":");
            for (int j = 0; j < programs; j++) {
                System.out.print("Enter score for Program " + (j + 1) + " (1-5): ");
                survey[i][j] = input.nextInt();
            }
        }

        //Display Average score for every place
        System.out.println("\nAverage Score Per Places");
        for (int i = 0; i < places; i++) {
            double sum = 0;
        for (int j = 0; j < programs; j++) {
            sum += survey[i][j];
            }
        double avg = sum / programs;
        System.out.println("Places " + (i + 1) + ": " + avg);
        }

        //Display Average Score for every programs
        System.out.println("\nAverage Score Per Programs");
        for (int j = 0; j < programs; j++) {
            double sum = 0;
            for (int i = 0; i < places; i++) {
                sum += survey[i][j];
            }
            double avg = sum / places;
            System.out.println("Program " + (j + 1) + ": " + avg);
        }

        // Display overall average score
        System.out.println("\nOverall Average Score:");
        double totalSum = 0;
        for (int i = 0; i < places; i++) {
            for (int j = 0; j < programs; j++) {
                totalSum += survey[i][j];
            }
        }
        double overallAvg = totalSum / (places * programs);
        System.out.println(overallAvg);

        // Display favorite program (highest rated) for each place
        System.out.println("\nFavorite Program Per Place:");
        for (int i = 0; i < places; i++) {
            int maxScore = survey[i][0];
            int favoriteProgram = 0;
            for (int j = 1; j < programs; j++) {
                if (survey[i][j] > maxScore) {
                    maxScore = survey[i][j];
                    favoriteProgram = j;
                }
            }
            System.out.println("Places " + (i + 1) + ": Program " + (favoriteProgram + 1) + " (Score: " + maxScore + ")");
        }

        // Display highest rating from each place
        System.out.println("\nHighest Rating Per Place:");
        for (int i = 0; i < places; i++) {
            int maxScore = survey[i][0];
            for (int j = 1; j < programs; j++) {
                if (survey[i][j] > maxScore) {
                    maxScore = survey[i][j];
                }
            }
            System.out.println("Places " + (i + 1) + ": " + maxScore);
        }

        // Display highest rating from each program
        System.out.println("\nHighest Rating Per Program:");
        for (int j = 0; j < programs; j++) {
            int maxScore = survey[0][j];
            for (int i = 1; i < places; i++) {
                if (survey[i][j] > maxScore) {
                    maxScore = survey[i][j];
                }
            }
            System.out.println("Program " + (j + 1) + ": " + maxScore);
        }

        // Display overall favorite program based on highest average rating
        System.out.println("\nOverall Favorite Program (Based on Average Rating):");
        double maxAvg = 0;
        int favoriteProgram = 0;
        for (int j = 0; j < programs; j++) {
            double sum = 0;
            for (int i = 0; i < places; i++) {
                sum += survey[i][j];
            }
            double avg = sum / places;
            if (avg > maxAvg) {
                maxAvg = avg;
                favoriteProgram = j;
            }
        }
        System.out.println("Program " + (favoriteProgram + 1) + " with average rating: " + maxAvg);

    input.close();
    }
}
