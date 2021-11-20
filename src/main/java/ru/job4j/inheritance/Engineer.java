package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String machine;

    public Engineer(String name, String surname, String education, String birthday, String machine) {
        super(name, surname, education, birthday);
        this.machine = machine;
    }

    public Engineer() {
    }

    public Engineer(String machine) {
        this.machine = machine;
    }

    public void makeProject() {
        System.out.println("Для своей работы я использую " + this.machine);
    }
}