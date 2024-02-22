package by.itstep.goutor.javastage.stage15.task.task1.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(int sum, int sumSide, int upDiagonalSum) {

        BUILDER.append("Sum element in main diagonal: ").append(sum)
                .append("\nSum side diagonal: ").append(sumSide)
                .append("\nSum up main diagonal element: ").append(upDiagonalSum);

        return BUILDER;
    }
}
