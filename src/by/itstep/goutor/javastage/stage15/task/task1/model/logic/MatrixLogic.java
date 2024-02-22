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


    public static int getSumSideDiagonal(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int sumSide = 0;
int a = 0;

        for (int i = 1; i <= matrix.length; i++) {
            sumSide += matrix[a++][matrix.length - i];
        }


        return sumSide;


    }

}
