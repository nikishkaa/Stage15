package by.itstep.goutor.javastage.stage15.task.levela.task.controller;


import by.itstep.goutor.javastage.stage15.task.levela.task.model.logic.MatrixLogic;
import by.itstep.goutor.javastage.stage15.task.levela.task.util.MatrixConverter;
import by.itstep.goutor.javastage.stage15.task.levela.task.util.MatrixInit;
import by.itstep.goutor.javastage.stage15.task.levela.task.util.MatrixUI;
import by.itstep.goutor.javastage.stage15.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = MatrixInit.initMatrix();

        int maxUpElement = MatrixLogic.getMaxUoElement(matrix);

        int maxDownElement = MatrixLogic.getMaxDownElement(matrix);

        StringBuilder startMatrix = MatrixConverter.matrixToStr(matrix);


        Printer.print(startMatrix);
        Printer.print(MatrixUI.getLevelAUI(maxUpElement, maxDownElement));
    }
}
