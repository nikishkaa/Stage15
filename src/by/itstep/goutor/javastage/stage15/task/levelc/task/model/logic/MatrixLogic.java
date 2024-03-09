package by.itstep.goutor.javastage.stage15.task.levelc.task.model.logic;

public class MatrixLogic {
    public static int getCountEvenElementUpTheMainDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int countEvElementUpMainD = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] > 0) {
                    countEvElementUpMainD++;
                }
            }
        }

        return countEvElementUpMainD;
    }
}
