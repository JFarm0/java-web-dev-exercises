package exercises.lsn1datatypes;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String rawString = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";

        String firstSentence = rawString.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your search term: ");
        String searchTerm = input.nextLine().toLowerCase();
        input.close();
        Boolean result = firstSentence.contains(searchTerm);
        System.out.println("The first sentence of Alice in Wonderland contains your search term: " + result);

        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("The index of " + searchTerm + " is " + index + ". It has a length of " + length + ".");
        String editedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(editedSentence);

    }

}
