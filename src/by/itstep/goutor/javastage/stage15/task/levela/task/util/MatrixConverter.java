package by.itstep.goutor.javastage.stage15.task.levela.task.util;

public class MatrixConverter {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }
    public static StringBuilder matrixToStr(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                BUILDER.append(matrix[i][j]).append(" ");
            }
            BUILDER.append("\n");
        }


        return BUILDER;
    }
}
