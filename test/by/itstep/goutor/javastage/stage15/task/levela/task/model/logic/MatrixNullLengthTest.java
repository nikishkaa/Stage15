package by.itstep.goutor.javastage.stage15.task.levela.task.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixNullLengthTest {
    public int[][] matrix;

    @Before
    public void initMatrix() {
        matrix = new int[0][0];
    }

    @After
    public void clearing() {
        matrix = null;
    }

    @Test
    public void testNullMatrixForNullLength() {
        int[][] nullLengthMatrix = new int[0][0];

        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxUoElement(nullLengthMatrix);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDownElementForNullLength() {
        int[][] nullLengthMatrix = new int[0][0];

        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxDownElement(nullLengthMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testBiggestElementUpSideDiagonalForNullLength() {
        int[][] nullLengthMatrix = new int[0][0];

        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxDownElement(nullLengthMatrix);

        assertEquals(expected, actual);
    }
}
