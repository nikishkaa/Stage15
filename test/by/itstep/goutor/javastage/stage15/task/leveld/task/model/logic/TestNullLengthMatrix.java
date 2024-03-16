package by.itstep.goutor.javastage.stage15.task.leveld.task.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNullLengthMatrix {
    public int[][] matrix;

    @Before
    public void matrixInit() {
        matrix = new int[0][0];
    }

    @After
    public void clearing() {
        matrix = null;
    }

    @Test
    public void testZeroElementDownTheMainDiagonalByZeroElement() {
        boolean expected = false;

        boolean actual = MatrixLogic.getZeroElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testZeroElementUpTheMainDiagonalByZeroLength() {
        boolean expected = false;

        boolean actual = MatrixLogic.getZeroElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }
}
