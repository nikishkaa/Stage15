package by.itstep.goutor.javastage.stage15.task.levelb.task.controller;

import by.itstep.goutor.javastage.stage15.task.levela.task.util.MatrixConverter;
import by.itstep.goutor.javastage.stage15.task.levelb.task.model.logic.MatrixLogic;
import by.itstep.goutor.javastage.stage15.task.levelb.task.util.MatrixInit;
import by.itstep.goutor.javastage.stage15.task.levelb.task.util.MatrixUI;
import by.itstep.goutor.javastage.stage15.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = MatrixInit.initMatrix();

        int countEvenUpMain = MatrixLogic.getCountEvenElementUpTheMainDiagonal(matrix);
        int countEvenDownMain = MatrixLogic.getCountEvenElementDownTheMainDiagonal(matrix);
        int countEvenUpSideElement = MatrixLogic.getCountEvenElementUpTheSideDiagonal(matrix);

        StringBuilder startMatrix = MatrixConverter.matrixToStr(matrix);


        Printer.print(startMatrix);
        Printer.print(MatrixUI.getMatrixUI(countEvenUpMain, countEvenDownMain, countEvenUpSideElement));
    }
}
