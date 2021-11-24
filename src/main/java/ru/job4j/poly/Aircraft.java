package ru.job4j.poly;

public class Aircraft implements Vehicle {

    @Override
    public void name() {
        System.out.print("Самолёт");
    }

    @Override
    public void move() {
        System.out.println(" летит в небе со скоростью " + speed() + "км/ч");
    }

    @Override
    public int speed() {
        return 900;
    }
}
