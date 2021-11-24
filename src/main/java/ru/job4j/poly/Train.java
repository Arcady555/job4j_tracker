package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void name() {
        System.out.print("Поезд");
    }

    @Override
    public void move() {
        System.out.println(" едет по железной дороге со скоростью " + speed() + "км/ч");
    }

    @Override
    public int speed() {
        return 90;
    }
}
