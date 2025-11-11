package Jobsheet11;
import java.util.Arrays;
import java.util.Scanner;
public class NumberStudentID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++){
            System.out.println(Arrays.toString(myNumbers[i]));
        for (int j = 0; i < myNumbers.length; i++) {
            System.out.println("length of row " + (i + 1) + ": " + myNumbers[i].length);

        }
        }
    }
}
