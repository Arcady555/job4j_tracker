package ru.job4j.ooa;

public class AirbusA380 extends Aircraft {
    private String name;

    public AirbusA380(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    @Override
    public void printCountEngine() {
        System.out.println("Количество двигателей равно: 4");
    }

    @Override
    public String toString() {
        return "AirbusA380{"
                + "name='" + name + '\''
                + '}';
    }
}