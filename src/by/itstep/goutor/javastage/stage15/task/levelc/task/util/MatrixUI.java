package by.itstep.goutor.javastage.stage15.task.levelc.task.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(int countEvElementDownMainD,int countEvElementUpMainD) {


        return BUILDER.append("Count positive element down the main diagonal ")
                .append(countEvElementDownMainD)
                .append("\nCount positive element down the main diagonal ")
                .append(countEvElementUpMainD);
    }
}
