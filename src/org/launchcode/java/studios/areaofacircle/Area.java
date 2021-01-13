package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        // we need this Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of your circle: ");
        double radius = input.nextDouble(); // this makes the input be treated as a double
        double area = Circle.getArea(radius);

        if (radius > 0) {
            System.out.println("The area of a circle of radius" + radius + " is: " + area);
        }
        else if (radius < 0) {
            System.out.println("Error! The radius must be a positive number.");
        }
    }
}
