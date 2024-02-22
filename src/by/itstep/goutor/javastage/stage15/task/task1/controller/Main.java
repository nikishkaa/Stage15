package by.itstep.goutor.javastage.stage15.task.task1.controller;

import by.itstep.goutor.javastage.stage15.task.task1.model.logic.MatrixLogic;
import by.itstep.goutor.javastage.stage15.task.task1.util.Converter;
import by.itstep.goutor.javastage.stage15.task.task1.util.MatrixInit;
import by.itstep.goutor.javastage.stage15.task.task1.util.MatrixUI;
import by.itstep.goutor.javastage.stage15.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = MatrixInit.getMatrix();

        int sum = MatrixLogic.getSumMainDiagonal(matrix);

        int sumSide = MatrixLogic.getSumSideDiagonal(matrix);

        int upDiagonalSum = MatrixLogic.getSumUpDiagonal(matrix);

        int downDiagonalSum = MatrixLogic.getSumDownDiagonal(matrix);

        StringBuilder startMatrixUI = Converter.convertMatrix(matrix);


        Printer.print(startMatrixUI);
        Printer.print(MatrixUI.getMatrixUI(sum, sumSide, upDiagonalSum, downDiagonalSum));

    }
}
