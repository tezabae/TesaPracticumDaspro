package Jobsheet7;
import java.util.Scanner;
public class ForMultiplesNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int multiple;
        int sum = 0;
        int counter = 0;

        System.out.print("Input the multiple: ");
        multiple = input.nextInt(); 
        
        for (int i=1; i<=50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
                
                System.out.printf("Multiple %d: %d\n", counter, multiple);
                System.out.printf("the sum of all multiples of %d in range 1 t0 50 is %d. \n", multiple , sum);
            }
        }
        
    }
}
