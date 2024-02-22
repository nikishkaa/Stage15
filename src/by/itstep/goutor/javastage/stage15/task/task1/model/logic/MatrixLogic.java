package by.itstep.goutor.javastage.stage15.task.task1.model.logic;

public class MatrixLogic {
    public static int getSumMainDiagonal(int[][] matrix) {

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }


        return sum;
    }
}
