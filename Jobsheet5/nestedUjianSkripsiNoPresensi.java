package Jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = "";
        System.out.println("Has the student beem cleared of compensation? (Y/T or Y/N): ");
        String compensationStatus = sc.nextLine(). trim();
        boolean free = compensationStatus.equalsIgnoreCase("Y");
        System.out.println("Enter the number of guidance logs with Supervisor 1: ");
        int Supervisor1 = sc.nextInt();
        System.out.println("Enter the number of guidance logs with Supervisor 2: ");
        int Supervisor2 = sc.nextInt();
        
        if (free) {
                if (Supervisor1 >= 8 && Supervisor2 >= 4) {
                    message = "All requirement are met. The student may register for the thesis exam";
                } else if (Supervisor1 < 8 && Supervisor2 >= 4) {
                    message = "Failed : Guidance logs qith Supervisor 1 are fewer than 8 AND Supervisor 2 fewer than 4.";
                }
            }else if (Supervisor1 < 8 && Supervisor2 < 4) {
                message = "Failed Guidance logs with Supervisor 1 are feweer than 8.";
            } else if (Supervisor1 >= 8 && Supervisor2 < 4) {
                message = "Failed Guidance logs with Supervisor 2 are fewer than 4.";
        } else {
            message = "Failed : The student has not been cleares of compensation.";
        }
        System.out.println(message);
        sc.close();
    }
    
}
