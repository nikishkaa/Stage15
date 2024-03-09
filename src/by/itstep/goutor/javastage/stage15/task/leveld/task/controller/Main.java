package by.itstep.goutor.javastage.stage15.task.leveld.task.controller;

import by.itstep.goutor.javastage.stage15.task.leveld.task.model.logic.MatrixLogic;
import by.itstep.goutor.javastage.stage15.task.leveld.task.util.MatrixConverter;
import by.itstep.goutor.javastage.stage15.task.leveld.task.util.MatrixInit;
import by.itstep.goutor.javastage.stage15.task.leveld.task.util.MatrixUI;
import by.itstep.goutor.javastage.stage15.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = MatrixInit.initMatrix();

        boolean zeroElUpMainD = MatrixLogic.getZeroElementUpTheMainDiagonal(matrix);
        boolean zeroElDownMainD = MatrixLogic.getZeroElementDownTheMainDiagonal(matrix);

        StringBuilder startMatrix = MatrixConverter.matrixToStr(matrix);

        Printer.print(startMatrix);
        Printer.print(MatrixUI.getMatrixUI(zeroElUpMainD, zeroElDownMainD));
    }
}
