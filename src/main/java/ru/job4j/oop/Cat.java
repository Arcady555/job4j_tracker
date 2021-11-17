package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There is gav's name.");
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.show();
        System.out.println("There is black's name.");
        Cat black = new Cat();
        black.giveNick("black");
        black.show();
    }
}