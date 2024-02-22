package by.itstep.goutor.javastage.stage15.task.task1.model.logic;

public class MatrixLogic {
    public static int getSumMainDiagonal(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }


        return sum;
    }
}
