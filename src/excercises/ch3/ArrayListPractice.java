package excercises.ch3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    static int sumOfEvens(ArrayList<Integer> numsArray) {
        int sum = 0;
        for (int i = 0; i < numsArray.size(); i++) {
            if (numsArray.get(i)%2 == 0) {
                sum += numsArray.get(i);
            }
        }
        return sum;
    }

    static void arrayPrint(ArrayList<String> stringArray, int userLength) {
        for (int i = 0; i < stringArray.size(); i++) {
            if (stringArray.get(i).length() == userLength) {
                System.out.println(stringArray.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numsArray = new ArrayList<Integer>();

        numsArray.add(3);
        numsArray.add(4);
        numsArray.add(2);
        numsArray.add(8);
        numsArray.add(9);
        numsArray.add(4);
        numsArray.add(2);
        numsArray.add(1);
        numsArray.add(5);
        numsArray.add(6);

        System.out.println(sumOfEvens(numsArray));

        ArrayList<String> wordsArray = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length: ");
        int inputInt = input.nextInt();
        input.close();

        wordsArray.add("kara");
        wordsArray.add("matthew");
        wordsArray.add("house");

        arrayPrint(wordsArray, inputInt);

    }
}
