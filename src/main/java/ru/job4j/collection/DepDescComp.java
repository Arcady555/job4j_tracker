package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int rsl = o2.split("/")[0].compareTo(o1.split("/")[0]);
        if (rsl == 0) {
            for (int i = 1; i < Math.min(o1.split("/").length,
                    o2.split("/").length); i++) {
                rsl = o1.split("/")[i].compareTo(o2.split("/")[i]);
                if (rsl != 0) {
                    return rsl;
                }
            }
            rsl = Integer.compare(o1.length(), o2.length());
        }
        return rsl;
    }
}
