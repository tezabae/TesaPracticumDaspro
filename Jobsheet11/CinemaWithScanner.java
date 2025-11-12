package Jobsheet11;
import java.util.Scanner;

public class CinemaWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column, choice;
        String name;

        String[][] audience = new String[4][2];

        do {
            System.out.println("\n=== CINEMA MENU ===");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();

                        System.out.print("Enter row number (1-4): ");
                        row = sc.nextInt();

                        System.out.print("Enter column number (1-2): ");
                        column = sc.nextInt();
                        sc.nextLine(); // consume newline

                        if (row < 1 || row > 4 || column < 1 || column > 2) {
                            System.out.println("❌ Invalid seat position. Please enter a valid row and column.");
                            continue;
                        }

                        if (audience[row - 1][column - 1] != null) {
                            System.out.println("⚠️ Seat [" + row + "][" + column + "] is already occupied by " + audience[row - 1][column - 1]);
                            System.out.println("Please choose another seat.");
                            continue;
                        }

                        audience[row - 1][column - 1] = name;
                        System.out.println("✅ Audience added successfully.");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("\n=== Audience List ===");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            String occupant = (audience[i][j] != null) ? audience[i][j] : "***";
                            System.out.println("Seat [" + (i + 1) + "][" + (j + 1) + "]: " + occupant);
                        }
                    }
                    break;

                case 3:
                    System.out.println("👋 Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please select 1, 2, or 3.");
            }

        } while (choice != 3);
    }
}
