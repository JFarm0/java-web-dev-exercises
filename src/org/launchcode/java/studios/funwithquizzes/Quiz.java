package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;
    private int total;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.score = 0;
        this.total = 0;
        for (Question question : questions) {
            this.total = this.total + question.getPointValue();
        }
    }

    public void addQuestion (Question newQuestion) {
        this.questions.add(newQuestion);
        this.total = this.total + newQuestion.getPointValue();
    }

    public void updateScore(int number) {
        score += number;
    }

    public void gradeQuiz() {
        System.out.println("You have finished the finished quiz! Your score is " + score + "/" + total);
    }

    public void runQuiz () {
        for (Question question : questions) {
            question.displayQuestion();
            question.displayAnswer();
            int points = question.getAnswers();
            updateScore(points);
        }
    }
}
