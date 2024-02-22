package by.itstep.goutor.javastage.stage15.task.task1.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(int sum, int sumSide) {

        BUILDER.append("Sum element in main diagonal is: ").append(sum)
                .append("\n Sum side diagonal: ").append(sumSide);

        return BUILDER;
    }
}
