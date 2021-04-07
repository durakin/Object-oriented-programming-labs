package com.github.durakin.oop.sem1.lab7;

import java.util.ArrayList;
import java.util.List;

public class University {

    private final String TITLE;
    private final List<UniversityConstruction> universityObjects;

    private int nextNumber(){
        return universityObjects.size()+1;
    }

    public University(String TITLE) {
        this.TITLE = TITLE;
        this.universityObjects = new ArrayList<>();
    }

    public void addObject(UniversityConstruction object) {
        if (objectByNumber(object.getNUMBER()) != null && object.getNUMBER() != 0) {
            throw new RuntimeException("Number is occupied");
        }
        object.setNUMBER(this.nextNumber());
        universityObjects.add(object);
    }

    public UniversityConstruction objectByNumber(int number) {
        for (UniversityConstruction i :
                universityObjects) {
            if (i.getNUMBER() == number) {
                return i;
            }
        }
        return null;
    }

    public String getTITLE() {
        return TITLE;
    }

    public List<UniversityConstruction> getUniversityObjects() {
        return universityObjects;
    }
}
