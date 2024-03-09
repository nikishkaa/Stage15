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
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    @After
    public void clearing() {
        matrix = null;
    }
}
