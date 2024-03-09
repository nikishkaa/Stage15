package by.itstep.goutor.javastage.stage15.task.levelc.task.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(int countEvElementDownMainD, int
            countEvElementUpMainD, int countPosElUpSidD) {


        return BUILDER.append("Count positive element down the main diagonal ")
                .append(countEvElementDownMainD)
                .append("\nCount positive element down the main diagonal ")
                .append(countEvElementUpMainD)
                .append("\nCount positive element up the side diagonal ")
                .append(countPosElUpSidD);

    }
}
