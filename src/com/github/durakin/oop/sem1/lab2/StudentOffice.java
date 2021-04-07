package com.github.durakin.oop.sem1.lab2;

import java.util.ArrayList;

public class StudentOffice {

    private final ArrayList<StudyGroup> STUDYGROUPS;
    private final ArrayList<Student> BESTSTUDENTS;
    private final ArrayList<StudyGroup> BESTGROUPS;

    public StudentOffice() {
        STUDYGROUPS = new ArrayList<>();
        BESTSTUDENTS = new ArrayList<>();
        BESTGROUPS = new ArrayList<>();
    }

    public void AddGroup(StudyGroup groupToAdd) throws RuntimeException {
        if (FindGroup(groupToAdd.getNAME()) != null) {
            throw new RuntimeException("Such group already exists");
        } else {
            STUDYGROUPS.add(groupToAdd);
        }
    }

    public void AddStudent(Student studentToAdd, String groupName) throws RuntimeException {
        if (FindGroup(groupName) == null) {
            throw new RuntimeException("No such group");
        } else {
            FindGroup(groupName).addStudent(studentToAdd);
        }
    }

    public StudyGroup FindGroup(String name) {
        for (StudyGroup i : this.STUDYGROUPS) {
            if (i.getNAME().equals(name)) {
                return i;
            }
        }
        return null;
    }


    public void competition() {
        this.BESTSTUDENTS.clear();
        this.BESTGROUPS.clear();
        double bestScore = 0;
        double bestGroupScore = 0;

        for (StudyGroup currentGroup : this.STUDYGROUPS
        ) {

            var groupScore = currentGroup.score();
            if (groupScore == bestGroupScore) {
                BESTGROUPS.add(currentGroup);
            }
            if (groupScore > bestGroupScore) {
                BESTGROUPS.clear();
                BESTGROUPS.add(currentGroup);
                bestGroupScore = groupScore;
            }

            for (Student currentStudent : currentGroup.getSTUDENTS()) {
                var currentScore = currentStudent.score();
                if (currentScore == bestScore) {
                    BESTSTUDENTS.add(currentStudent);
                }
                if (currentScore > bestScore) {
                    BESTSTUDENTS.clear();
                    BESTSTUDENTS.add(currentStudent);
                    bestScore = currentScore;
                }
            }
        }
    }

    public ArrayList<Student> getBESTSTUDENTS() {
        return BESTSTUDENTS;
    }

    public ArrayList<StudyGroup> getBESTGROUPS() {
        return BESTGROUPS;
    }

    public ArrayList<StudyGroup> getSTUDYGROUPS() {
        return STUDYGROUPS;
    }

    @Override
    public String toString() {
        var result = "";
        for (StudyGroup i : this.STUDYGROUPS) {
            result += i;
        }
        result += "\nBest group(s):\n";
        for (StudyGroup i : this.BESTGROUPS) {
            result += i.getNAME() + "\n";
        }
        result += "\nBest student(s):\n";
        for (Student i : this.BESTSTUDENTS) {
            result += i.getNAME() + "\n";
        }
        return result;
    }
}