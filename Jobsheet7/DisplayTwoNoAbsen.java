package Jobsheet7;

import java.util.Scanner;

public class DisplayTwoNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input some number: ");
        int numInput = input.nextInt();

        for (int i = 2; i <= numInput; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println(); // move to next line after printing
        input.close();
    }
}