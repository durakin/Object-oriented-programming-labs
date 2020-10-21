package com.github.durakin.oop.lab3;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final String NAME;
    private final Map<Subject, Integer> MARKS;

    public Student(String name) {
        NAME = name;
        MARKS = new HashMap<>();
    }

    public void setMark(Subject subject, int mark) {
        MARKS.put(subject, mark);
    }

    public String getNAME() {
        return NAME;
    }

}
