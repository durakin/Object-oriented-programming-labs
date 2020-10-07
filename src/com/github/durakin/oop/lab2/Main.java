package com.github.durakin.oop.lab2;

public class Main {
    public static void main(String[] args){
        StudentOffice studentOffice = new StudentOffice();
        studentOffice.AddGroup(new StudyGroup("Group 1"));
        studentOffice.AddStudent(new Student("Chloe Price"), "Group 1");
        studentOffice.AddStudent(new Student("Warren Graham"), "Group 1");
        studentOffice.AddStudent(new Student("Maxine Caulfield"), "Group 1");
        System.out.println(studentOffice.toString());
        studentOffice.AddGroup(new StudyGroup("Group 2"));
        studentOffice.AddStudent(new Student("Nathan Prescott"), "Group 2");
        studentOffice.AddStudent(new Student("Rachel Amber"), "Group 2");
        studentOffice.AddStudent(new Student("Victoria Chase"), "Group 2");
        studentOffice.competition();
        System.out.println(studentOffice.toString());
    }
}
