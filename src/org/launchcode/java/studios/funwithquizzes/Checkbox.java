package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;

    public Checkbox(int pointValue, String text, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(pointValue, text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
        setPointValue(this.correctAnswers.size());
    }

    public int checkAnswers(ArrayList<Integer> check) {
        int answersCorrect = 0;
        for (Integer integer : check) {
            if (correctAnswers.contains(integer)) {
                answersCorrect += 1;
            } else {
                answersCorrect -= 1;
            }

        }
        return answersCorrect;
    }

    @Override
    public void displayAnswer() {
        for (String possibleAnswer : possibleAnswers) {
            System.out.println(possibleAnswer);
        }
    }

    @Override
    public int getAnswers() {
        ArrayList<Integer> userAnswers = new ArrayList<>();
        System.out.println("There are multiple correct answers for this question. To begin, press 'y' & then 'enter'.");
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while (goingToContinue.indexOf('y') >= 0 && userAnswers.size() <= possibleAnswers.size()) {
            System.out.println("What is your answer? Enter the number of the option you believe is correct.");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            userAnswers.add(option);

            System.out.println("To add more answers, press 'y' & then 'enter'. Otherwise, just press 'enter'.");
            goingToContinue = userContinue.nextLine();
        }

        return checkAnswers(userAnswers);
    }
}
