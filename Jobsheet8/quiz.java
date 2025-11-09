package Jobsheet8;

import java.util.Random;
import java.util.Scanner;

public class quiz {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do { 
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                
                System.out.println("Your guess: " + answer);
                if (answer < number) {
                    System.out.println("Too small!");
                } else if (answer > number) {
                    System.out.println("Too big!");
                } else {
                    System.out.println("Correct!");
                    success = true;
                }
            
            } while (!success);
            System.out.print("Do you want to play again? (y/n): ");
            menu = input.nextLine().charAt(0);
            input.nextLine();
        } while (menu == 'y' || menu == 'Y');
    }  
}
