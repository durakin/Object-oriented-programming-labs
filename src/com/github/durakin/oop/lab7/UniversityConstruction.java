package com.github.durakin.oop.lab7;

public abstract class UniversityConstruction {
    private static int MAXCOST = 1001;
    private final String TITLE;
    private int NUMBER = 0;

    public UniversityConstruction(String TITLE) {
        this.TITLE = TITLE;
    }

    public static int getMAXCOST() {
        return MAXCOST;
    }

    public static void setMAXCOST(int MAXCOST) {
        UniversityConstruction.MAXCOST = MAXCOST;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversityConstruction that = (UniversityConstruction) o;
        return NUMBER == that.NUMBER;
    }

    public String getTITLE() {
        return TITLE;
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(int NUMBER) {
        this.NUMBER = NUMBER;
    }
}
