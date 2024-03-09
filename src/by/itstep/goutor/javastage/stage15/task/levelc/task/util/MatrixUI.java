package by.itstep.goutor.javastage.stage15.task.levelc.task.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(int countEvElementUpMainD) {


        return BUILDER.append("Count positive element up the main diagonal ")
                .append(countEvElementUpMainD);
    }
}
