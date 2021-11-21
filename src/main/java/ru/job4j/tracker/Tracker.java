package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNulls = new Item[items.length];
        int newSize = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNulls[index] = item;
                newSize++;
            }
        }
        return Arrays.copyOf(itemsWithoutNulls, newSize);
    }

    public Item[] findByName(String key) {
        Item[] itemsWithNames = new Item[items.length];
        int newSize = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                itemsWithNames[index] = items[index];
                newSize++;
            }
        }
        return Arrays.copyOf(itemsWithNames, newSize);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (Item item : items) {
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}