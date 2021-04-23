package exercises.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {

    public static void printFive(ArrayList<String> stringArrayList) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 & 5: ");
        Integer choice = input.nextInt();
        input.close();

        for (String word:stringArrayList) {
            if (word.length() == choice) {
                System.out.println(word);
            }
        }
    }
}
