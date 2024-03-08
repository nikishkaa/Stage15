package by.itstep.goutor.javastage.stage15.task.levela.task.model.logic;

public class MatrixLogic {
    public static int getMaxUoElement(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxUpElement = Integer.MIN_VALUE;

        //O(N^2)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {

                if (matrix[j][i] > maxUpElement) {
                    maxUpElement = matrix[i][j];
                }
            }
        }


        return maxUpElement;
    }


    public static int getMaxDownElement(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }


        int maxDownElement = Integer.MIN_VALUE;

        //O(N^2)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i - 1; j >= 0; j--) {

                if (matrix[i][j] > maxDownElement) {
                    maxDownElement = matrix[i][j];
                }
            }
        }


        return maxDownElement;
    }


    public static int getBiggestElementUpSideDiagonal(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxSideElement = Integer.MIN_VALUE;

        //O(N^2)
        for (int i = 1, line = 0; i <= matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[line++][matrix.length - i] > maxSideElement) {
                    maxSideElement = matrix[line++][matrix.length - i];
                }
            }
        }

        return maxSideElement;
    }
}
