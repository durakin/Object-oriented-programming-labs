package com.github.durakin.oop.lab1;

public class StudentOffice {

    static void checkScore(Student s) {
        if (s.getScore() < 0) {
            s.setStatus(false);
            s.setStip(0);
        }
        if (s.getScore() >= scholarshipMerit && !s.isMerit()) {
            s.setStip(s.getStip() + 100);
            s.setMerit(true);
        }
        if (s.getScore() < scholarshipMerit && s.isMerit()) {
            s.setStip(s.getStip() - 100);
            s.setMerit(false);
        }
    }

    private static int scholarshipMerit;

    public static void setScholarshipMerit(int scholarshipMerit) {
        StudentOffice.scholarshipMerit = scholarshipMerit;
    }
}
