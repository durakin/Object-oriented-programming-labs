package com.github.durakin.oop.sem1.lab3;

public class Main {
    public static void main(String[] args) {
        StudentOffice.setAssignment(new Teacher("Mark Jefferson"), new Subject("Photography"));
        StudentOffice.addStudent(new Student("Rachel Amber"));
        StudentOffice.addStudent(new Student("Nathan Prescott"));
        StudentOffice.addStudent(new Student("Kate Marsh"));
        StudentOffice.addStudent(new Student("Courtney Wagner"));
        StudentOffice.addStudent(new Student("Taylor Christensen"));
        StudentOffice.addStudent(new Student("Victoria Chase"));
        StudentOffice.addStudent(new Student("Warren Graham"));
        System.out.println(StudentOffice.studentsToStr());
        StudentOffice.greatExams();
        System.out.println(StudentOffice.studentsToStr());
    }
}
