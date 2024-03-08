package by.itstep.goutor.javastage.stage15.task.levela.task.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixLogicTest {

    public int[][] matrix;

    @Before
    public void initMatrix() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    @After
    public void MatrixClearing() {
        matrix = null;
    }

    @Test
    public void testNullMatrix() {
        matrix = null;

        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxUoElement(matrix);
        assertEquals(expected, actual);
    }
}
