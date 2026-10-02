import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gasTank = 0.0;
        double fuelEfficiency = 0.0;
        double gasPrice = 0.0;
        double costFor100Miles = 0.0;
        double distanceOnFullTank = 0.0;
        String trash = "";
        boolean validInput = false;
        do {
            System.out.print("Enter the number, in gallons, of gas in the tank: ");
            if (in.hasNextDouble()) {
                gasTank = in.nextDouble();
                in.nextLine(); // Clear the buffer
                if (gasTank > 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        while (!validInput);
        validInput = false;
        do {
            System.out.print("Enter the fuel efficiency, in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine(); // Clear the buffer
                if (fuelEfficiency > 0) {
                    validInput = true;
                } else
                {
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        while (!validInput);
        validInput = false;
        do {
            System.out.print("Enter the price of gas per gallon: $ ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine(); // Clear the buffer
                if (gasPrice > 0) {
                    validInput = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                }
            } else
            {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a number.");
            }
        } while (!validInput);
        // Process
        costFor100Miles = (100 / fuelEfficiency) * gasPrice;
        distanceOnFullTank = gasTank * fuelEfficiency;
        // Output
        System.out.println("The cost of driving 100 miles is: $" + costFor100Miles);
        System.out.println("The distance you can drive on a full tank is: " + distanceOnFullTank + " miles");
    }
}


