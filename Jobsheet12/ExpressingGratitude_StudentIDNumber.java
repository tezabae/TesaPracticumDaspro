package Jobsheet12;

import java.util.Scanner;

public class ExpressingGratitude_StudentIDNumber {

    // Method to get greeting recipient from user input
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    // Method to display thank you message with recipient
    public static void sayThankyou() {
        String recipient = getGreetingRecipient();
        System.out.println("Thank you " + recipient + " for being the best Teacher in the world.\n" +
            "You inspired me to love learning and made me feel like I could ask you anything.");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        sayThankyou();
    }
}
