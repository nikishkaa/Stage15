package by.itstep.goutor.javastage.stage15.task.levela.task.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixLogicTest {

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
    public void testNullMatrixForNull() {
        matrix = null;

        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxUoElement(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDownElementForNull() {
        matrix = null;

        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxDownElement(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testBiggestElementUpSideDiagonalForNull() {
        matrix = null;

        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getMaxDownElement(matrix);

        assertEquals(expected, actual);
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


    @Test
    public void testMaxUoElement() {
        int expected = 6;

        int actual = MatrixLogic.getMaxUoElement(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDownElement(){
        int expected = 8;

        int actual = MatrixLogic.getMaxDownElement(matrix);

        assertEquals(expected,actual);
    }



}
