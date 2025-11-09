package Jobsheet7;

import java.util.Scanner;

public class DoWhileLeaveEntitlementNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement;
        int numLeave;
        String confirmation;

        // Step 1: Ask for initial leave entitlement
        System.out.print("Input the number of leave entitlement: ");
        leaveEntitlement = input.nextInt();
        input.nextLine(); // consume leftover newline

        // Step 2: Loop for leave requests
        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.nextLine().trim();

            // Stop the program if user enters "t"
            if (confirmation.equalsIgnoreCase("t")) {
                System.out.println("Program stopped by user input 't'.");
                break;
            }

            if (confirmation.equalsIgnoreCase("y")) {
                // Ask for number of leave days until valid
                do {
                    System.out.print("How many day(s)? ");
                    numLeave = input.nextInt();
                    input.nextLine(); // consume leftover newline

                    if (numLeave > leaveEntitlement) {
                        System.out.println("You don't have enough leave entitlement. Please enter a valid number.");
                    }
                } while (numLeave > leaveEntitlement);

                // Deduct leave and show remaining
                leaveEntitlement -= numLeave;
                System.out.println("Remaining leave entitlement: " + leaveEntitlement);

                // Warning if only 2 days left
                if (leaveEntitlement == 2) {
                    System.out.println("Warning: Only 2 days of leave remaining. Please stop using leave.");
                }

                // Stop if no leave remains
                if (leaveEntitlement == 0) {
                    System.out.println("No leave remaining.");
                    break;
                }
            }

        } while (leaveEntitlement > 0);

        input.close();
    }
}