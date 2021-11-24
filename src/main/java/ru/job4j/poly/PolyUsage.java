package ru.job4j.poly;

public class PolyUsage {

    public static void main(String[] args) {
        Vehicle aircraft = new Aircraft();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[] {aircraft, bus, train};
        for (Vehicle vehicle : vehicles) {
            vehicle.name();
            vehicle.move();
        }
    }

}
