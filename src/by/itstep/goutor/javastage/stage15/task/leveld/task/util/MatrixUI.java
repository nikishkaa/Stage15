package by.itstep.goutor.javastage.stage15.task.leveld.task.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(boolean zeroElUpMainD) {

        return BUILDER.append("in yor matrix ").
                append(zeroElUpMainD ? "YES" : "NO")
                .append(" element up main diagonal.");
    }
}
