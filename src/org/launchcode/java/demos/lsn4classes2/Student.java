package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int credits) {
        String studentLevel;
        if (credits >= 0 && credits <= 29) {
            studentLevel = "Freshman";
        } else if (credits >= 30 && credits <= 59) {
            studentLevel = "Sophomore";
        } else if (credits >= 60 && credits <= 89) {
            studentLevel = "Junior";
        } else {
            studentLevel = "Senior";
        }
        return studentLevel;
        // Determine the grade level of the student based on numberOfCredits
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double qualityScore;
        qualityScore = courseCredits * grade;
        double totalQualityScore;
        totalQualityScore = getGpa() * getNumberOfCredits();
        double updatedQualityScore;
        updatedQualityScore = totalQualityScore + qualityScore;
        setNumberOfCredits(getNumberOfCredits() + courseCredits);
        setGpa(updatedQualityScore/getNumberOfCredits());
        // Update the appropriate fields: numberOfCredits, gpa
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
//        System.out.println("Sally has a GPA of " + sally.getGpa() + "on " + sally.getNumberOfCredits() + "credits.");
//        sally.addGrade(3, 4.0);
//        System.out.println(sally);
//        System.out.println("Sally has a GPA of " + sally.getGpa() + "on " + sally.getNumberOfCredits() + "credits.");
//        System.out.println(sally.getNumberOfCredits());
//        System.out.println("Sally is a " + sally.getGradeLevel(sally.getNumberOfCredits()));
    }
}
