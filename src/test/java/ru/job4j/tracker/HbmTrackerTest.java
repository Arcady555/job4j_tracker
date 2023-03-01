package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HbmTrackerTest {
 /*   @Test
    public void whenAddNewItemThenTrackerHasSameItem() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item = new Item();
            item.setName("test1");
            tracker.add(item);
            Item result = tracker.findById(item.getId());
            assertThat(result.getName(), is(item.getName()));
        }
    }

    @Test
    public void whenReplaceItem() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item1 = tracker.add(new Item("item1"));
            int id = item1.getId();
            Item item2 = new Item("item2");
            tracker.replace(id, item2);
            assertThat(tracker.findById(id).getName(), is("item2"));
        }
    }  */

    @Test
    public void whenDeleteItemAndFindByGeneratedIdThenMustBeNull() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item = new Item();
            item.setName("test1");
            tracker.add(item);
            int id = item.getId();
            tracker.delete(item);
            Assert.assertNull(tracker.findById(1));
        }
    }

    @Test
    public void whenShowAllItems() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item1 = tracker.add(new Item("item1"));
            Item item2 = tracker.add(new Item("item2"));
            Item item3 = tracker.add(new Item("item3"));
            List<Item> list = List.of(
                    item1,
                    item2,
                    item3
            );
        assertThat(tracker.findAll(), is(list));
        }
    }

    @Test
    public void whenFindById() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item = tracker.add(new Item("item"));
            Assert.assertEquals(tracker.findById(item.getId()), is(item));
        }
    }

    @Test
    public void whenFindByName() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item first = tracker.add(new Item("First"));
            tracker.add(new Item("Second"));
            Item third = tracker.add(new Item("First"));
            tracker.add(new Item("Fourth"));
            Item fifth = tracker.add(new Item("First"));
            List<Item> list = List.of(
                    first,
                    third,
                    fifth
            );
            assertThat(tracker.findByName("First"), is(list));
        }
    }
}