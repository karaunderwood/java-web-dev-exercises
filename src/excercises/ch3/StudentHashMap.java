package excercises.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1. It takes in student names and ID numbers (as integers) instead of names and grades.
2. The keys should be the IDs and the values should be the names.
3. Modify the roster printing code accordingly
 */

public class StudentHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish");

        // Get students names and ID numbers
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID Number: ");
                Integer newIDnumber = input.nextInt();
                students.put(newStudent, newIDnumber);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roaster:");
        int sum = 0;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + ": ID number(" + student.getValue() + ")");
            sum += student.getValue();
        }

    }
}
