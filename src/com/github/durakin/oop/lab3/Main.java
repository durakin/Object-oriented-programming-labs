package com.github.durakin.oop.lab3;

public class Main {
    public static void main(String[] args) {
        StudentOffice.SetAssignment(new Teacher("Mark Jefferson"), new Subject("Photography"));
        StudentOffice.AddStudent(new Student("Rachel Amber"));
        StudentOffice.AddStudent(new Student("Nathan Prescott"));
        StudentOffice.AddStudent(new Student("Kate Marsh"));
        StudentOffice.AddStudent(new Student("Courtney Wagner"));
        StudentOffice.AddStudent(new Student("Taylor Christensen"));
        StudentOffice.AddStudent(new Student("Victoria Chase"));
        StudentOffice.AddStudent(new Student("Warren Graham"));
        System.out.println(StudentOffice.StudentsToStr());
        StudentOffice.GreatExams();
        System.out.println(StudentOffice.StudentsToStr());
    }
}
