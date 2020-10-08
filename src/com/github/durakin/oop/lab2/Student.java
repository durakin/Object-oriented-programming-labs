package com.github.durakin.oop.lab2;

import java.util.Arrays;
import java.util.Random;

public class Student {
    private static final int NUMBER_OF_MARKS = 8;
    private static final int MAX_MARK = 5;
    private static final int MIN_MARK = 1;


    private final String NAME;
    private final int[] MARKS;


    public Student(String name) {
        Random random = new Random();
        this.NAME = name;
        MARKS = new int[NUMBER_OF_MARKS];
        for (int i = 0; i < NUMBER_OF_MARKS; i++) {
            this.MARKS[i] = MIN_MARK + random.nextInt(MAX_MARK - MIN_MARK);
        }
    }

    public double score() {
        var result = Arrays.stream(this.MARKS).average();
        return (result.isPresent()) ? result.getAsDouble() : 0;
    }

    public String getNAME() {
        return NAME;
    }

    public int[] getMARKS() {
        return MARKS;
    }

    @Override
    public String toString() {
        return "Student " + NAME + "\nMarks: " + Arrays.toString(MARKS);
    }
}
