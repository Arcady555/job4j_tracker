package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int toothAmount;

    public Dentist(String name, String surname, String education, String birthday, String patient, int toothAmount) {
        super(name, surname, education, birthday, patient);
        this.toothAmount = toothAmount;
    }

    public Dentist(int toothAmount) {
        this.toothAmount = toothAmount;
    }

    public boolean quality(int toothAmount) {
        return toothAmount == 32;
    }
}

