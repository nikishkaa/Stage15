package by.itstep.goutor.javastage.stage15.task.levela.task.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getLevelAUI(int maxUpElement, int maxDownElement) {

        BUILDER.append("Max element up the main diagonal: ").append(maxUpElement)
                .append("\nMax element up the main diagonal: ").append(maxDownElement);


        return BUILDER;
    }
}
