package org.launchcode.java.studios.funwithquizzes;

public abstract class Question {
    private int pointValue;
    private String text;

    public Question(int pointValue, String text) {
        this.pointValue = pointValue;
        this.text = text;
    }

    public void displayQuestion() {
        System.out.println(text);
    }

    public void setPointValue(int x) {
        this.pointValue = x;
    }

    public int getPointValue() {
        return pointValue;
    }

    public abstract void displayAnswer();

    public abstract int getAnswers();
}