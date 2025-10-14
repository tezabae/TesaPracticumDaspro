import java.util.Scanner;
public class tesalonikagb_cafeCashier {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Input 
        System.out.println("Enter ordertime morning/afternoon/evening:");
        String time = input.nextLine().toLowerCase();

        System.out.println("Enter drink temperature hot/cold:");
        String temperature = input.nextLine().toLowerCase();

        double basePrice = 0;
        double discount = 0;

        // Determine base price
        if (time.equals("morning")) {
            if (temperature.equals("hot")) {
                basePrice = 15000;
                discount = 0.10;
            } else if (temperature.equals("cold")) {
                basePrice = 18000;
                discount = 0;   
            }
        }else if (time.equals("afternoon") ) {
            if (temperature.equals("hot")) {
                basePrice = 20000;
                discount = 0.05;
            } else if (temperature.equals("cold")) {
                basePrice = 22000;
                discount = 0.05;
            }
        }else if (time.equals("evening")) {
            if (temperature.equals("hot")) {
                basePrice = 17000;
                discount = 0;    
            } else if (temperature.equals("cold")) {
                basePrice = 19000;
                discount = 0.15;
            }
        } else {
            System.out.println("Invalid input. Please make sure time = (morning/afternoon/evening) and temperature = (hot/cold).");
            return;
        }

        // Calculate final price 
        double finalPrice = basePrice - (basePrice * discount);
        System.out.printf("Final drink price: IDR %.0f\n", finalPrice);
    input.close();
    }
}

    

