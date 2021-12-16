package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTask {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -4, -3, 0, 4, 5, 6, 7, 8, 9));
        List<Integer> positive = list.stream().filter(num -> num > 0).toList();
        positive.forEach(System.out::println);
    }
}
