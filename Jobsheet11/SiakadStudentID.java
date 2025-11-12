package Jobsheet11;
import java.util.Scanner;
public class SiakadStudentID {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int[][] values = new int[4][3];

        
        for (int i = 0; i < 4; i++) { // students
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) { // courses
                System.out.print("Course " + (j + 1) + ": ");
                values[i][j] = input.nextInt();
            }
        }

        System.out.println("\nAverage score per student:");
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += values[i][j];
            }
            double avg = (double) sum / 3;
            System.out.println("Student " + (i + 1) + ": " + avg);
        }

        System.out.println("\nAverage score per course:");
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += values[i][j];
            }
            double avg = (double) sum / 4;
            System.out.println("Course " + (j + 1) + ": " + avg);
        }

        input.close();
    }
}


