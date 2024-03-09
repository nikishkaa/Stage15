package by.itstep.goutor.javastage.stage15.task.leveld.task.model.logic;

public class MatrixLogic {
    public static boolean getZeroElementUpTheMainDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        boolean zeroElUpMainD = false;

        //O(N^2)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j > i; j--) {
                if (matrix[i][j] == 0) {
                    zeroElUpMainD = true;
                    break;
                }
            }
        }

        return zeroElUpMainD;
    }

    public static boolean getZeroElementDownTheMainDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        boolean zeroElDownMainD = false;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] == 0) {
                    zeroElDownMainD = true;
                    break;
                }
            }
        }

        return zeroElDownMainD;
    }
}
