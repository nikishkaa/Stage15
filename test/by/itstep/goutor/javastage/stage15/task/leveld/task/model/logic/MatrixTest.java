package by.itstep.goutor.javastage.stage15.task.leveld.task.model.logic;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class MatrixTest {
    public int[][] matrix;

    @Before
    public void init() {
        matrix = new int[][]{
                {0, 2, 0},
                {4, 5, 6},
                {0, 8, 0}
        };
    }

    @After
    public void clearing() {
        matrix = null;
    }

    @Test
    public void testZeroElementUpTheMainDiagonal() {
        boolean expected = true;

        boolean actual = MatrixLogic.getZeroElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testZeroElementUpTheMainDiagonalByNull() {
        boolean expected = false;

        boolean actual = MatrixLogic.getZeroElementUpTheMainDiagonal(null);

        assertEquals(expected, actual);
    }

    @Test
    public void testZeroElementUpTheMainDiagonalByZeroLength() {
        int[][] zeroLengthMatrix = new int[0][0];
        boolean expected = false;

        boolean actual = MatrixLogic.getZeroElementUpTheMainDiagonal(zeroLengthMatrix);

        assertEquals(expected, actual);
    }


    @Test
    public void testZeroElementDownTheMainDiagonal() {
        boolean expected = true;

        boolean actual = MatrixLogic.getZeroElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testZeroElementDownTheMainDiagonalByNull() {
        boolean expected = false;

        boolean actual = MatrixLogic.getZeroElementDownTheMainDiagonal(null);

        assertEquals(expected, actual);
    }

    @Test
    public void testZeroElementDownTheMainDiagonalByZeroElement() {
        int[][] zeroMatrix = new int[0][0];
        boolean expected = false;

        boolean actual = MatrixLogic.getZeroElementDownTheMainDiagonal(zeroMatrix);

        assertEquals(expected, actual);
    }
}
