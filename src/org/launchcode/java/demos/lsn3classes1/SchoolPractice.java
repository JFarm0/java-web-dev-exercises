package org.launchcode.java.demos.lsn3classes1;



public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

//        Student jared = new Student(name: "Jared", studentId: 1, numberOfCredits: 1, gpa: 4.0);


        Student jared = new Student();
        jared.setNumberOfCredits(1);
        jared.setName("Jared Farmer");
        jared.setGpa(4.0);

//        System.out.println(jared.getName());
//        System.out.println(jared.getStudentId());
//        System.out.println(jared.getNumberOfCredits());
//        System.out.println(jared.getGpa());
    }
}
