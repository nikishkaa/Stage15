package by.itstep.goutor.javastage.stage15.task.levela.task.model.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixNullTest {
    public int[][] matrix;

    @Before
    public void initMatrix() {
        matrix = null;
    }

    @Test
    public void testNullMatrixForNull() {
        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxUoElement(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDownElementForNull() {
        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxDownElement(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testBiggestElementUpSideDiagonalForNull() {
        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxDownElement(matrix);

        assertEquals(expected, actual);
    }
}
