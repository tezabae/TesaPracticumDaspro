package Jobsheet7;

import java.util.Scanner;

public class WhileMultiplesNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // === INPUT ===
        System.out.print("Enter the number to find its multiples: ");
        int multiple = input.nextInt();

        int i = 1;
        int sum = 0;
        int counter = 0;
        double average = 0.0;

        // === WHILE LOOP ===
        while (i <= 50) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            }
            i++;
        }

        // === OUTPUT ===
        if (counter > 0) {
            average = (double) sum / counter;
            System.out.println("Total multiples of " + multiple + " from 1 to 50: " + counter);
            System.out.println("Sum of those multiples: " + sum);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No multiples of " + multiple + " found between 1 and 50.");
        }

        input.close();
    }
}
