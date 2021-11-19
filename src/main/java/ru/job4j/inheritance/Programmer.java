package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String level;

    public Programmer(String name, String surname, String education
            , String birthday, String machine, String level) {
        super(name, surname, education, birthday, machine);
        this.level = level;
    }

    public Programmer(String machine, String level) {
        super(machine);
        this.level = level;
    }

    public Programmer() {
    }

    public Programmer(String level) {
        this.level = level;
    }

    public void myLevel() {
        System.out.println("I'm a " + this.level + " now.");
    }
}