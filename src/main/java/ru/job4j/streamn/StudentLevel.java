package ru.job4j.streamn;

import java.util.List;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<ru.job4j.streamn.Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(st -> st != null)
                .sorted((left, right) -> Integer.compare(right.getScore(), left.getScore()))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}