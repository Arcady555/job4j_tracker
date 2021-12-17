package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransMatrix {
    public static List<Integer> matrixToList(Integer[][] array) {
        return Stream.of(array).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}