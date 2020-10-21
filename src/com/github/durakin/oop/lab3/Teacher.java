package com.github.durakin.oop.lab3;

import java.util.*;

public class Teacher {
    private static final int MAX_MARK = 5;
    private static final int MIN_MARK = 1;
    private static final int PASS_MARK = 3;
    private final String NAME;
    private List<Student> Passed;
    private Queue<Student> ExamQueue;
    private Queue<Student> ReExamQueue;

    public Teacher(String name) {
        NAME = name;
        Passed = new ArrayList<>();
        ExamQueue = new LinkedList<>();
        ReExamQueue = new PriorityQueue<>(Comparator.comparing(Student::getNAME));

    }

    public String getNAME() {
        return NAME;
    }

    public List<Student> getPassed() {
        return Passed;
    }

    public Queue<Student> getExamQueue() {
        return ExamQueue;
    }

    public Queue<Student> getReExamQueue() {
        return ReExamQueue;
    }

    public void AddToExam(Student student) {
        ExamQueue.add(student);
    }


    public void Examination() {
        while (ExamQueue.peek() != null) {
            var student = ExamQueue.poll();
            var mark = ExamStudent(student);
            if (mark >= PASS_MARK) {
                Passed.add(student);
                System.out.println("Student " + student.getNAME() + " gets " + mark + " for exam and passes!\n");
            } else {
                ReExamQueue.add(student);
                System.out.println("Student " + student.getNAME() + " gets " + mark + " for exam and doesn't pass!\n");
            }

        }
    }

    public void ReExamination() {
        var NewReExamQueue = new PriorityQueue<Student>(Comparator.comparing(Student::getNAME));
        while (ReExamQueue.peek() != null) {
            var student = ReExamQueue.poll();
            var mark = ExamStudent(student);
            if (mark >= PASS_MARK) {
                Passed.add(student);
                System.out.println("Student " + student.getNAME() + " gets " + mark + " for re-exam and passes!\n");
            } else {
                NewReExamQueue.add(student);
                System.out.println("Student " + student.getNAME() + " gets " + mark + " for re-exam and doesn't pass!\n");
            }

        }
        ReExamQueue = NewReExamQueue;
    }

    private int ExamStudent(Student student) {
        var random = new Random();
        var mark = MIN_MARK + random.nextInt(MAX_MARK - MIN_MARK);
        student.SetMark(StudentOffice.GetAssignment(this), mark);
        return mark;


    }
}
