package exercises.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] integerArray = {1, 1, 2, 3, 5, 8};

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will " +
                "not eat them in a house. I will not eat them " +
                "with a mouse.";

        for (int integer : integerArray) {
            if(integer % 2 != 0)
                System.out.println(integer);
            }

//        String[] words = phrase.split(" ");
//        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
