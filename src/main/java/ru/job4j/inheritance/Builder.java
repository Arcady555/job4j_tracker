package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String material;

    public Builder(String name, String surname, String education,
                   String birthday, String machine, String material) {
        super(name, surname, education, birthday, machine);
        this.material = material;
    }

    public Builder(String material) {
        this.material = material;
    }

    public void advertising() {
        System.out.println("The best " + material + " houses!");
    }
}
