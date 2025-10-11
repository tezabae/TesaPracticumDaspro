import java.util.Scanner;
public class ifCetakKRSNoPresensi {
    // This class is intentionally left empty.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print KRS SIAKAD without attendance data");
        System.out.println("---------------------------------------");
        System.out.println("Have the tuition fee been paid? (Y/N)");
        boolean uktLunas = sc.nextLine().equalsIgnoreCase("Y");
        if (uktLunas) {
            System.out.println("UKT payment confirmed.");
            System.out.println("KRS now can be printed.");
        } else {
            System.out.println("UKT payment not confirmed.");
            System.out.println("KRS cannot be printed.");   
        }
    }
}