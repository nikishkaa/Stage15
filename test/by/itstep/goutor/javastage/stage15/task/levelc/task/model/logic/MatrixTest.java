package by.itstep.goutor.javastage.stage15.task.levelc.task.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTest {

    public int[][] matrix;

    @Before
    public void init() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    @After
    public void clearing() {
        matrix = null;
    }

    @Test
    public void testCountEvenElementDownTheMainDiagonal() {
        int expected = 3;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheMainDiagonalByNullMatrix() {
        int[][] nullMatrix = null;
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(nullMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheMainDiagonalByNullLength() {
        int[][] nullLengthMatrix = new int[0][0];
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(nullLengthMatrix);

        assertEquals(expected, actual);
    }


    @Test
    public void testCountEvenElementUpTheMainDiagonal() {
        int expected = 3;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheMainDiagonalByNull() {
        int[][] nullMatrix = null;
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(nullMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheMainDiagonalByZeroLength() {
        int[][] ZeroLengthMatrix = new int[0][0];
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(ZeroLengthMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountPositElementUpTheSideDiagonal() {
        int expected = 3;

        int actual = MatrixLogic.getCountPositElementUpTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountPositElementUpTheSideDiagonalByNull() {
        int[][] nullMatrix = null;
        int expected = -1;

        int actual = MatrixLogic.getCountPositElementUpTheSideDiagonal(nullMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountPositElementUpTheSideDiagonalByZeroLength() {
        int[][] matrixZeroLength = new int[0][0];
        int expected = -1;

        int actual = MatrixLogic.getCountPositElementUpTheSideDiagonal(matrixZeroLength);

        assertEquals(expected, actual);
    }

}
