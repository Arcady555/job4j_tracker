package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        final AirbusA380 airbusA380 = new AirbusA380("A380");
        System.out.println(airbusA380);
        airbusA380.printModel();
        airbusA380.printCountEngine();
    }
}
