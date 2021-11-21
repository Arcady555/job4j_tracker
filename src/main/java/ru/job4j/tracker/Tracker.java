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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        } else {
            items[index].setId(id);
            items[index].setName(item.getName());
            return items[index] == item;
        }
    }
}