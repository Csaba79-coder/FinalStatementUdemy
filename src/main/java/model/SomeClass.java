package model;

public class SomeClass {

    private static int classCounter = 0;
    public final int INSTANCE_NUMBER;
    private final String NAME;


    public SomeClass(String NAME) {
        this.NAME = NAME;
        classCounter++;
        INSTANCE_NUMBER = classCounter;
        System.out.println(NAME + " created, instance is " + INSTANCE_NUMBER);
    }

    public int getINSTANCE_NUMBER() {
        return INSTANCE_NUMBER;
    }

    public static int getClassCounter() {
        return classCounter;
    }

    public static void setClassCounter(int classCounter) {
        SomeClass.classCounter = classCounter;
    }

    public String getNAME() {
        return NAME;
    }
}
