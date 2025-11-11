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
        audience [3][1] = "Hana";

        System.out.println(audience.length);
        System.out.println(audience[0].length);
        System.out.println(audience[1].length);
        System.out.println(audience[2].length);
        System.out.println(audience[3].length);



    }
}
