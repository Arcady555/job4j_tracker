package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (biC1, biC2) -> map.put(biC1, biC2);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred = (k, m) -> (k % 2 == 0 || m.length() == 4);
        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        Supplier<List<String>> sup = () -> new ArrayList<String>(map.values());
        List<String> strings = sup.get();

        Consumer<String> con = (v) -> System.out.println(v);
        Function<String, String> func = (u) -> u.toUpperCase();
        for (String s : strings) {
            con.accept(func.apply(s));
        }
    }
}