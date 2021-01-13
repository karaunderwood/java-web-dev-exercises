package excercises.ch3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] someInts = {1,1,2,3,5,8};

        /* Prints all integers in the array
        for (int oneInt : someInts) {
            System.out.println(oneInt);
        }
        */

        // Prints only the odd integers
        for (int i = 0; i < someInts.length; i++) {
            if (someInts[i]%2 == 1) {
                System.out.println(someInts[i]);
            }
        }

        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] drSeussArray = drSeuss.split(" ");

        for (int i = 0; i < drSeussArray.length; i++) {
            System.out.println(drSeussArray[i]);
        }

        System.out.println(Arrays.toString(drSeussArray));

    }
}
