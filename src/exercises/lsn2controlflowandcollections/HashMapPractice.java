package exercises.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newId;

        System.out.println("Enter your ID number (or ENTER to finish):");

        do {

            out.print("ID number: ");
            newId = input.nextInt();

            if (!students.containsKey(newId)) {
                out.print("Student Name: ");
                String newName = input.next();
                students.put(newId, newName);

                input.nextLine();
            }

        } while (newId != 0);
//If no ! on above line, it works after one loop through.

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
