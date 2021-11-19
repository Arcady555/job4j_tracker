package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String operation;

    public Surgeon(String name, String surname, String education,
                   String birthday, String patient, String operation) {
        super(name, surname, education, birthday, patient);
        this.operation = operation;
    }

    public Surgeon(String patient, String operation) {
        super(patient);
        this.operation = operation;
    }

    public Surgeon() {
    }

    public Surgeon(String operation) {
        this.operation = operation;
    }

    public boolean wasAmputation(int handAmount) {
        return handAmount < 2;
    }


}
