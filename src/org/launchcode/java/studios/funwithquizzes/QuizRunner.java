package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
    Quiz myQuiz = new Quiz(new ArrayList<>());
    ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("Cheshire", "Garfield", "Tom"));
    ArrayList<Integer> correctAns1 = new ArrayList<>(Arrays.asList(1,2));
    Checkbox newQuestion1 = new Checkbox(2, "Which two cats are best? (hint: 1 & 2)", possAns1, correctAns1);
    myQuiz.addQuestion(newQuestion1);

    ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("Benji", "Doc", "Gizmo", "Nala", "Tillie"));
    MultipleChoice newQuestion2 = new MultipleChoice(1, "Who won the costume contest? (hint: 3)", possAns2, 3);
    myQuiz.addQuestion(newQuestion2);

    TrueFalse newQuestion3 = new TrueFalse(1, "Are all dogs the best dog? (hint: not false");
    myQuiz.addQuestion(newQuestion3);

    myQuiz.runQuiz();
    myQuiz.gradeQuiz();


    }
}
