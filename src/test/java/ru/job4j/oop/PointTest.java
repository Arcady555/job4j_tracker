package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distWen1362Then5dot1() {
        double expected = 5.1;
        Point a = new Point(1, 3);
        Point b = new Point(6, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distWen137629Then5dot47() {
        double expected = 5.47;
        Point a = new Point(1, 3, 7);
        Point b = new Point(6, 2, 9);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}