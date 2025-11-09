package Jobsheet7;

import java.util.Scanner;

public class TheTriangleNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInput;
        String s = "";

        System.out.print("Enter a number: ");
        numInput = input.nextInt();

        for (int i = 0; i < numInput; i++) {
            s += " *";
            System.out.println(s);
        }

        input.close();
    }
}
    

