package excercises.ch2;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner square = new Scanner(System.in);

        System.out.println("Enter the length: ");
        double length = square.nextDouble();
        System.out.println("Enter the width: ");
        double width = square.nextDouble();

        double area = length*width;
        System.out.println("Area of Rectangle is: " + area);
    }
}
