package by.itstep.goutor.javastage.stage15.task.levelb.task.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMatrix {
    public int[][] matrix;

    @Before
    public void initMatrix() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    @After
    public void MatrixClearing() {
        matrix = null;
    }


    @Test
    public void testCountEvenElementUpTheMainDiagonal() {
        int expected = 2;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheMainDiagonalByNullMatrix() {
        int[][] NullMatrix = null;
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(NullMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheMainDiagonalByZeroLength() {
        int[][] NullMatrix = new int[0][0];

        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheMainDiagonal(NullMatrix);

        assertEquals(expected, actual);
    }


    @Test
    public void testCountEvenElementDownTheMainDiagonal() {
        int expected = 2;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementDownTheMainDiagonalByNullMatrix() {
        int[][] NullMatrix = null;
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(NullMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementDownTheMainDiagonalByNullMatrixLength() {
        int[][] NullMatrix = new int[0][0];

        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheMainDiagonal(NullMatrix);

        assertEquals(expected, actual);
    }


    @Test
    public void testCountEvenElementUpTheSideDiagonal() {
        int expected = 2;

        int actual = MatrixLogic.getCountEvenElementUpTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheSideDiagonalByNullMatrix() {
        int[][] NullMatrix = null;
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheSideDiagonal(NullMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementUpTheSideDiagonalByNullMatrixLength() {
        int[][] NullMatrix = new int[0][0];

        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementUpTheSideDiagonal(NullMatrix);

        assertEquals(expected, actual);
    }


    @Test
    public void testCountEvenElementDownTheSideDiagonal() {
        int expected = 2;

        int actual = MatrixLogic.getCountEvenElementDownTheSideDiagonal(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementDownTheSideDiagonalByNullMatrix() {
        int[][] NullMatrix = null;
        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheSideDiagonal(NullMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementDownTheSideDiagonalByNullMatrixLength() {
        int[][] NullMatrix = new int[0][0];

        int expected = -1;

        int actual = MatrixLogic.getCountEvenElementDownTheSideDiagonal(NullMatrix);

        assertEquals(expected, actual);
    }
}
