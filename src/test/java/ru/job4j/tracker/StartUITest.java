package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenInvalidExit() {

        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"8", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                        "Menu:" + ln
                                + "0. Exit" + ln
                                + "Wrong input, you can select: 0 .. 0" + ln
                                + "Menu:" + ln
                                + "0. Exit" + ln
                )
        );
    }
}