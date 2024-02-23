package by.itstep.goutor.javastage.stage15.task.levela.task.model.logic;

public class MatrixLogic {
    public static int getMaxUoElement(int[][] matrix) {

        int maxUpElement = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {

                if (matrix[j][i] > maxUpElement) {
                    maxUpElement = matrix[i][j];
                }
            }
        }


        return maxUpElement;
    }
}
