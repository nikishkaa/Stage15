package by.itstep.goutor.javastage.stage15.task.levelb.task.model.logic;

import org.junit.After;
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
    public void testCountEvenElementUpTheMainDiagonalByNullMatrix() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementDownTheMainDiagonalByNullMatrix() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheSideDiagonalByNullMatrix() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementDownTheSideDiagonalByNullMatrix() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }
}
