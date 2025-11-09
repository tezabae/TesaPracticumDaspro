package Jobsheet8;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        } 
    }
}

