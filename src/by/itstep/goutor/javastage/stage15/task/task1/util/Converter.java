package by.itstep.goutor.javastage.stage15.task.task1.util;

public class Converter {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder convertMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                BUILDER.append(matrix[i][j]).append(" ");
            }
            BUILDER.append("\n");
        }


        return BUILDER;
    }
}
