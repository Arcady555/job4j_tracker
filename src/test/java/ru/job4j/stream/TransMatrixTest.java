package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransMatrixTest {

    @Test
    public void matrixToList() {
        Integer[][] matrix = new Integer[][] {
                {1, 2, 3},
                {4, 5, 6}
        };
        List<Integer> rsl = TransMatrix.matrixToList(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        Assert.assertArrayEquals(expected.toArray(), rsl.toArray());
    }
}