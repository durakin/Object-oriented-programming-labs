package com.github.durakin.oop.lab1;

public class Main {
    public static void main(String[] args) {

        StudentOffice.setScholarshipMerit(8);
        Student student = new Student("Chloe Price", 5, 800);

        System.out.println(student);
        System.out.println();

        while (!student.isMerit()) {
            try {
                student.goToLecture();
                System.out.println(student);
                System.out.println();
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }

        while (true) {
            try {
                student.goToBuffet();
                System.out.println(student);
                System.out.println();
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
                break;
            }
        }

        try {
            student.goToLecture();
            System.out.println(student);
            System.out.println();
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
