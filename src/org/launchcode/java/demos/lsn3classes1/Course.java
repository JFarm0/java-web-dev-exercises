package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn2controlflowandcollections.ArrayListGradebook;

import java.util.ArrayList;

public class Course {

    private String courseTitle;
    private int creditHours;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseTitle, int creditHours) {
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

}
