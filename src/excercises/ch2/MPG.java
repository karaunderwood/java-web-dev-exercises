package excercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {

        Scanner trip = new Scanner(System.in);

        System.out.println("Enter the miles driven: ");
        double miles = trip.nextDouble();
        System.out.println("Enter the gallons of gas consumed: ");
        double gas = trip.nextDouble();

        double milesPerGallon = miles/gas;
        System.out.println("Your car gets " + milesPerGallon + " miles per gallon");
    }
}
