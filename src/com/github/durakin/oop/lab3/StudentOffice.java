package com.github.durakin.oop.lab3;

import java.util.*;

public class StudentOffice {
    private static final Map<Teacher, Subject> ASSIGNMENTS = new HashMap<>();
    private static final List<Student> STUDENTS = new ArrayList<>();

    public static void SetAssignment(Teacher teacher, Subject subject) {
        ASSIGNMENTS.put(teacher, subject);
    }

    public static void AddStudent(Student student) {
        STUDENTS.add(student);
    }

    public static void ExpellStudent(Student student) {
        STUDENTS.remove(student);
        System.out.println("Student " + student.getNAME() + " got expelled!\n");
    }

    public static Subject GetAssignment(Teacher teacher) {
        return ASSIGNMENTS.get(teacher);
    }

    public static String StudentsToStr() {
        var result = "";
        for (Student student : STUDENTS) {
            result+=student.getNAME() + "\n";
        }
        return result;
    }

    public static void GreatExams() {
        Collections.shuffle(STUDENTS);

        for (Student student : STUDENTS) {
            for (Teacher teacher : ASSIGNMENTS.keySet()) {
                teacher.AddToExam(student);
            }
        }

        System.out.println("==========EXAMS START==========");
        for (Teacher teacher : ASSIGNMENTS.keySet()) {
            System.out.println("Teacher: " + teacher.getNAME() + " Subject: " + ASSIGNMENTS.get(teacher).getNAME());
            System.out.println("----------First exam----------");
            teacher.Examination();
            System.out.println("----------First re-exam----------");
            teacher.ReExamination();
            System.out.println("----------Second re-exam----------");
            teacher.ReExamination();
            System.out.println("----------Third re-exam----------");
            teacher.ReExamination();
        }
        System.out.println("=========EXAMS ARE OVER==========");
        for (Student student : new ArrayList<>(STUDENTS)) {
            for (Teacher teacher : ASSIGNMENTS.keySet()) {
                if (!teacher.getPassed().contains(student)) {
                    StudentOffice.ExpellStudent(student);
                }
            }
        }

    }
}
