package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        int count = 11;
        System.out.println("Игра " + count + ".");
        play(count);
    }

    private static void play(int count) {
        Scanner input = new Scanner(System.in);
        boolean turn = true;
        System.out.println("На столе " + count + " " + grammar(count));
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches < 1 || matches > 3) {
                System.out.println("Введите корректное число");
            } else {
                turn = !turn;
                count -= matches;
                System.out.println("На столе " + count + " " + grammar(count));
            }
        }
        isWin(turn);
    }

    private static String grammar(int count) {
        if (count == 1) {
            return  "спичка";
        } else if (count > 1 & count < 5) {
            return  "спички";
        } else {
            return  "спичек";
        }
    }

    private static void isWin(boolean turn) {
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
