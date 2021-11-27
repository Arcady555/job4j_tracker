package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteActionTest {

   @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        Assert.assertNull(tracker.findById(item.getId()));
    }
}