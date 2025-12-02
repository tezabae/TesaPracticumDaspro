package Jobsheet12;

import java.util.Scanner;

public class Gratitude_StudentIDNumber_Corrected {
    
    // Method 1: Display thank you message (no parameters, void return type)
    public static void sayThankyou() {
        System.out.println("Thankyou for being the best Teacher in the world. \n" +
            "you inspired me a love for learning and made me feel like i could asked you anything.");
    }
    
    // Method 2: Display additional greetings (has parameter, void return type)
    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }
    
    // Method 3: Get recipient name from user (no parameters, returns String)
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = input.nextLine();  // Read the input
        input.close();
        return recipientName;  // Return the name
    }
    
    // ONLY ONE main() method - the entry point of the program
    public static void main(String[] args) {
        System.out.println("=== Gratitude Program ===\n");
        
        // Call first method
        sayThankyou();
        System.out.println();
        
        // Call second method with a parameter
        String expression = "Thankyou...wish you all the best!!";
        sayAdditionalGreetings(expression);
        System.out.println();
        
        // Call third method and use the returned value
        String name = getGreetingRecipient();
        System.out.println("\nThankyou " + name + "! May the force be with you!");
    }
}
