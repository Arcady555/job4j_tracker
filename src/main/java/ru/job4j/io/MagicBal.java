package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        print(answer);
    }

    private static void print(int answer) {
        String rsl = "";
        switch (answer) {
            case 1: rsl = "да";
                break;
            case 2: rsl = "нет";
                break;
            default: rsl = "может быть";
        }
        System.out.println(rsl);
    }
}