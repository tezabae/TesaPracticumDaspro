package Jobsheet11;

import java.util.Scanner;

public class CinemaStudenIDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [][] audience = new String [4][2];

        audience [0][0] = "Amin";
        audience [0][1] = "Bena";
        audience [1][0] = "Chandra";
        audience [1][1] = "Dela";
        audience [2][0] = "Eka";
        audience [2][1] = "Farhan";
        audience [3][0] = "Gisel";

        System.out.printf("%s \t \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t \t %s\n", audience[3][0], audience[3][1]);
    }
}
