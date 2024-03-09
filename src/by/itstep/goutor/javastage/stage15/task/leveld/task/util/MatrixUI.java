package by.itstep.goutor.javastage.stage15.task.leveld.task.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static final String POSIT_RES = "YES";
    public static final String NEGATIVE_RES = "NO";

    public static StringBuilder getMatrixUI(boolean zeroElUpMainD,
                                            boolean zeroElDownMainD) {

        return BUILDER.append("in yor matrix: ").
                append(zeroElUpMainD ? POSIT_RES : NEGATIVE_RES)
                .append(" element up main diagonal, ")
                .append("\n").append(zeroElDownMainD ? POSIT_RES : NEGATIVE_RES)
                .append(" element down main diagonal, ");
    }
}
