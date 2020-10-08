package com.github.durakin.oop.lab2;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private final String NAME;
    private final List<Student> STUDENTS;

    public StudyGroup(String name) {
        NAME = name;
        STUDENTS = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.STUDENTS.add(student);
    }

    public double score() {
        double result = 0;
        for (Student i :
                this.STUDENTS) {
            result += i.score();
        }
        return result / this.STUDENTS.size();
    }

    public String getNAME() {
        return NAME;
    }

    public List<Student> getSTUDENTS() {
        return STUDENTS;
    }

    @Override
    public String toString() {
        var students = "";
        for (Student i : STUDENTS) {
            students += i + "\n";
        }
        return "StudyGroup " + NAME + "\nStudents:\n" + students;
    }

}
