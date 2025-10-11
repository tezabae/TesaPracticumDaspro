package Jobsheet5;
import java.util.Scanner;
public class ganjilgenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int angka = sc.nextInt();
        if (angka % 2 == 0) {
            System.out.println(angka + " genap.");
        } else {
            System.out.println(angka + " ganjil.");
        }
        sc.close();
    }
    
}
