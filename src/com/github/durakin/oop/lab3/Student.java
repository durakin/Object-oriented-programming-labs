package com.github.durakin.oop.lab3;

import java.util.*;

public class Student {
    private final String NAME;
    private Map<Subject, Integer> Marks;

    public Student(String name) {
        NAME = name;
        Marks = new HashMap<Subject, Integer>();
    }

    public void SetMark(Subject subject, int mark){
        Marks.put(subject, mark);
    }

    public int GetMark(Subject subject)
    {
        return Marks.get(subject);
    }

    public String getNAME() {
        return NAME;
    }

    public Map<Subject, Integer> getMarks() {
        return Marks;
    }
}
