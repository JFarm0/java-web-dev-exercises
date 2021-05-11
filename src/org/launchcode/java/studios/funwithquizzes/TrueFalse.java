package org.launchcode.java.studios.funwithquizzes;

import java.util.Scanner;

public class TrueFalse extends Question {

    public TrueFalse(int pointValue, String text) {
        super(pointValue, text);
        setPointValue(1);
    }

    @Override
    public void displayAnswer() {
        System.out.println("True or False");
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Press 't' for True or 'f' for False.");
        String userAnswer = answer.nextLine();
        if (userAnswer.indexOf('t') >= 0) {
            return 1;
        } else {
            return 0;
        }
//        else {
//            if (isCorrectAnswer(false)) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }
    }
}
