package by.itstep.goutor.javastage.stage15.task.levela.task.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getLevelAUI(int maxUpElement, int maxDownElement,int maxSideElement) {

        BUILDER.append("Max element up the main diagonal: ").append(maxUpElement)
                .append("\nMax element dawn the main diagonal: ").append(maxDownElement)
                .append("\nMax element up the side diagonal: ").append(maxDownElement);


        return BUILDER;
    }
}
