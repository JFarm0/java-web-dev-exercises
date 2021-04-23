package exercises.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Scanner input = new Scanner(System.in);

        System.out.println(getSum(intArray));

        ArrayList<String> strArray = new ArrayList<>(Arrays.asList("me","job","monks"));

        strArray.add("to");
        strArray.add("I");
        strArray.add("a");
        strArray.add("taco");
        strArray.add("dog");
        strArray.add("cat");
        strArray.add("tuck");
        strArray.add("sword");
        strArray.add("bears");
        strArray.add("beets");
        strArray.add("tacos");
        strArray.add("hen");
        strArray.add("be");
        strArray.add("an");

        ArrayListMethods.printFive(strArray);

    }

    public static int getSum(ArrayList<Integer> num) {

        int sum = 0;

        for (int number:num) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

}
