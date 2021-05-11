package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultipleChoice(int pointValue, String text, ArrayList<String> possibleAnswers, int correctAnswer) {
        super(pointValue, text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
        setPointValue(1);
    }

    @Override
    public void displayAnswer() {
        for (String possibleAnswer : possibleAnswers) {
            System.out.println(possibleAnswer);
        }
    }

    public boolean isCorrectAnswer(int possibleAnswer) {
        return possibleAnswer == correctAnswer;
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter the number of the option you believe is correct.");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isCorrectAnswer(result)) {
            return 1;
        } else {
            return 0;
        }
    }
}
