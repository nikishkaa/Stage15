package by.itstep.goutor.javastage.stage15.task.levelb.task.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(int countEvenUpMain) {


        return BUILDER.append("Count even element up the main diagonal ")
                .append(countEvenUpMain);
    }
}
