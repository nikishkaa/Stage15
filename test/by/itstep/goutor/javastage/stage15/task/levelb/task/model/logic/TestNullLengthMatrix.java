package by.itstep.goutor.javastage.stage15.task.levelb.task.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNullLengthMatrix {
    public int[][] matrix;

    public void matrixInit() {
        matrix = new int[0][0];
    }

    @Test
    public void testCountEvenElementUpTheMainDiagonalByZeroLength() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementDownTheMainDiagonalByNullMatrixLength() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheSideDiagonalByNullMatrixLength() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementDownTheSideDiagonalByNullMatrixLength() {
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }

}
