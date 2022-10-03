package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class FindByNameActionTest {
    @Test
    public void execute() {
        Output out = new StubOutput();
        MemTracker tracker = new MemTracker();
        tracker.add(new Item("Find items by name"));
        FindByNameAction rep = new FindByNameAction(out);

        Input input = mock(Input.class);

        when(input.askStr(any(String.class))).thenReturn(tracker.findAll().get(0).getName());

        rep.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Find items by name ==="
                + ln + tracker.findAll().get(0).toString() + ln));
    }
}