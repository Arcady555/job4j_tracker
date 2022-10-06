package ru.job4j.pojo.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.ItemDescByName;

import java.util.ArrayList;
import java.util.List;

public class ItemDescByNameTest {

    @Test
    public void whenSortAsc() {
        List<Item> items = new ArrayList<>();
        items.add(0, new Item("Arcady"));
        items.add(1, new Item("Stas"));
        items.add(2, new Item("Petr"));
        items.sort(new ItemDescByName());
        List<Item> expected = new ArrayList<>();
        expected.add(0, new Item("Stas"));
        expected.add(1, new Item("Petr"));
        expected.add(2, new Item("Arcady"));
        Assert.assertEquals(expected, items);
    }
}