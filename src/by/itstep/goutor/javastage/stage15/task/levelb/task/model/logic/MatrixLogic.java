package by.itstep.goutor.javastage.stage15.task.levelb.task.model.logic;

public class MatrixLogic {
    public static int getCountEvenElementUpTheMainDiagonal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int count = 0;

        //O(N^2)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count += 1;
                }

            }
        }


        return count;
    }
}
