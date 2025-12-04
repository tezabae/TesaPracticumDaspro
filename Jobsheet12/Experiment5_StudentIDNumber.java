package Jobsheet12;
import java.util.Scanner;
public class Experiment5_StudentIDNumber {
    static void show (String str, int... a) {
        System.out.println("String; "+str);
        System.out.println("Number of arguments/parameters: "+ a.length);

        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        show("programming fundamentals 2023", 100, 200);
        show("information technology", 1,2,3,4,5);
        show("informatics");
    }

}
