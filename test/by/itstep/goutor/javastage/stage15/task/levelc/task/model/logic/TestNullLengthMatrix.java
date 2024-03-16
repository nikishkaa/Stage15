package by.itstep.goutor.javastage.stage15.task.levelc.task.model.logic;

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
    public void testCountEvenElementUpTheMainDiagonalByNullLength() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheMainDiagonalByZeroLength() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountPositElementUpTheSideDiagonalByZeroLength() {
        int expected = -1;

        int actual = MatrixLogic.getCountPositElementUpTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }
}
