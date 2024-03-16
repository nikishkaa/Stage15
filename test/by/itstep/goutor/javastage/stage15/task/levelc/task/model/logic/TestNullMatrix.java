package by.itstep.goutor.javastage.stage15.task.levelc.task.model.logic;

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

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheMainDiagonalByNull() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountPositElementUpTheSideDiagonalByNull() {
        int expected = -1;

        int actual = MatrixLogic.getCountPositElementUpTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }

}