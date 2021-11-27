package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;

public class CreateActionTest {

    @Test
    public void whenCreateItem() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
       // Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new Exit()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }
}