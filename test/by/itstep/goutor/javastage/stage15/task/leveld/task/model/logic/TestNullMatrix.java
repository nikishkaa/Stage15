package by.itstep.goutor.javastage.stage15.task.leveld.task.model.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNullMatrix {
    public int[][] matrix;

    @Before
    public void matrixInit() {
        matrix = null;
    }

    @Test
    public void testZeroElementUpTheMainDiagonalByNull() {
        boolean expected = false;

        boolean actual = MatrixLogic.getZeroElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testZeroElementDownTheMainDiagonalByNull() {
        boolean expected = false;

        boolean actual = MatrixLogic.getZeroElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

}
