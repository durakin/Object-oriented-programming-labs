package com.github.durakin.oop.lab1;


public class Student {
    private final String NAME;
    private int score;
    private boolean status;
    private int stip;
    private boolean merit;

    Student(String initName, int initScore, int initStip) {
        NAME = initName;
        score = initScore;
        stip = initStip;
        status = true;
        merit = false;
    }

    public void goToLecture() throws RuntimeException {
        if (!this.status) {
            throw new RuntimeException("Student is expelled");
        }
        this.score++;
        StudentOffice.checkScore(this);
    }

    public void goToBuffet() throws RuntimeException {
        if (!this.status) {
            throw new RuntimeException("Student is expelled");
        }
        this.score--;
        StudentOffice.checkScore(this);
    }

    public String getNAME() {
        return NAME;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStip(int stip) {
        this.stip = stip;
    }

    public int getStip() {
        return stip;
    }

    public void setMerit(boolean merit) {
        this.merit = merit;
    }

    public boolean isMerit() {
        return merit;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student " + NAME +
                "\nScore: " + score +
                "\nStatus: " + ((status) ? "Studies" : "Expelled") +
                "\nScholarship: " + stip + " RUB";
    }


}
