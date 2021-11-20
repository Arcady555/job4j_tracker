package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String patient;

    public Doctor(String name, String surname, String education, String birthday, String patient) {
        super(name, surname, education, birthday);
        this.patient = patient;
    }

    public Doctor() {
    }

    public Doctor(String patient) {
        this.patient = patient;
    }

}
