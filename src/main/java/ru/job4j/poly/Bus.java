package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void drive() {
        System.out.println("Go!");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Вмещает " + passenger + " пассажиров");
    }

    @Override
    public int fill(int fuel) {
        return 0;
    }

    @Override
    public void name() {
        System.out.print("Автобус");
    }

    @Override
    public void move() {
        System.out.println(" едет по шоссе со скоростью " + speed() + "км/ч");
    }

    @Override
    public int speed() {
        return 100;
    }
}
