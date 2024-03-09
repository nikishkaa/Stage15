package by.itstep.goutor.javastage.stage15.task.levelc.task.model.logic;

public class MatrixLogic {
    public static int getCountEvenElementDownTheMainDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int countEvElementDownMainD = 0;

        //O(N^2)
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] > 0) {
                    countEvElementDownMainD++;
                }
            }
        }

        return countEvElementDownMainD;
    }


    public static int getCountEvenElementUpTheMainDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int countEvElementUpMainD = 0;

        //O(N^2)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j > i; j--) {
                if (matrix[i][j] > 0) {
                    countEvElementUpMainD++;
                }
            }
        }
        return countEvElementUpMainD;
    }


    public static int getCountPositElementUpTheSideDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int countPosElUpSidD = 0;

        //O(N^2)
        for (int i = matrix.length - 2; i > 0; i--) {
            for (int j = i - 1; j < i; j++) {
                System.out.println(matrix[i][j]);
                if (matrix[i][j] > 0) {
                    countPosElUpSidD++;
                }
            }
        }
        return countPosElUpSidD;
    }
}
