package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> even = list.stream().filter(num -> num % 2 == 0).toList();
        even.forEach(System.out::println);
    }
}
