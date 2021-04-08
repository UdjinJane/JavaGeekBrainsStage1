package HomeWork03;

import java.util.Random;
import java.util.Scanner;

public class KrestikiNoliki03 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static char[][] table;
    public static int sizeX = 5;
    public static int sizeY = 5;
    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = '_';
    // Размер блока.
    public static int block = 4;
    // Последние введенные координаты.
    public static int lastX = 0;
    public static int lastY = 0;


    public static void main(String[] args) {

        // Приветсвие.
        printMessage("Здравствуйте игрок!\n");
        printMessage("Поле игры 5 на 5 клеток. 4 клетки закполненные в ряд дадут вам выигрыш.\n");
        printMessage("Искуственный интеллект постарается вам помешать. Но он еще маааленький :-))\n");

        // Чертим доску.
        initTable(sizeX, sizeY);
        drawTable(sizeX, sizeY);
        // Стартуем игрулую
        turnGo();
    }
        // Игра!.
    public static void turnGo() {
        while (true) {
            // ход человека
            turnHuman();
            drawTable(sizeX, sizeY);
            printMessage("Игрок сделал ход\n");
            // проверка: если победа человека или ничья:

            if (draw(sizeX, sizeY)) {
                printMessage("Ничья!\n");
                break;
            }
            if (checkWin(human)) {
                printMessage("Вы виграли!\n");
                break;
            }

            // ход компьютера
            turnAi();
            drawTable(sizeX, sizeY);
            printMessage("AI сделал ход!\n");

            // проверка: если победа компьютера или ничья:

            if (checkWin(ai)) {
                printMessage("AI виграл!\n");
                break;
            }
            if (draw(sizeX, sizeY)) {
                printMessage("Ничья!\n");
                break;
            }

            //    сообщить и выйти из цикла
        }
    }

    // Ход AI.
    public static void turnAi() {
        int x, y, counter;
        counter = 1;
        do {
            x = lastX + random.nextInt(counter) - 1 ;
            y = lastY + random.nextInt(counter) - 1;
            counter++;
            if ((x > 4) || (y > 4)) {counter = 1;}
        } while (!isCellValid(x, y));
        table[x][y] = ai;
    }

    // Проверка на ничью.
    public static boolean draw(int maxX, int maxY) {
        for (int y = 0; y < maxY; y++) {
            for (int x = 0; x < maxX; x++) {
                if (table[x][y] == empty) return false;
            }
        }
        return true;
    }

    // Ход игрока-человекаю

    public static void turnHuman() {
        do {
            printMessage("Введите координаты в интервале 1..." + sizeX + ":");
            lastX = scanner.nextInt() - 1;
            lastY = scanner.nextInt() - 1;
            if ((lastX >= sizeX) || (lastY >= sizeY)) {
                printMessage("Введены не корректные координты. Повторите ввод.\n");
            }
        } while (!isCellValid(lastX, lastY));
        table[lastX][lastY] = human;
    }

    // Валидность поля.
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= sizeX || y >= sizeY)
            return false;
        return table[x][y] == empty;
    }

    // Инициирование доски.
    public static void initTable(int rowSize, int colSize) {
        table = new char[rowSize][colSize];
        for (int row = 0; row < rowSize; row++)
            for (int col = 0; col < colSize; col++)
                table[row][col] = empty;
    }

    // Выносим в процедуру печать сообщения.
    public static void printMessage(String message) {
        System.out.print(message);
    }

    // Чертим доску.
    public static void drawTable(int rowSize, int colSize) {
        printMessage("  ");
        for (int row = 1; row <= rowSize; row++) {
            printMessage(Integer.toString(row) + " ");
        }
        printMessage("\n");
        for (int row = 0; row < rowSize; row++) {
            printMessage(Integer.toString(row + 1) + " ");
            for (int col = 0; col < colSize; col++)
                System.out.print(table[row][col] + "|");
            System.out.println();
        }
    }

    // Проверка выигрыша, органайзер.
    public static boolean checkWin(char symb) {

        int iterCountX = sizeX % block;
        int iterCountY = sizeY % block;

        for (int row = 0; row <= iterCountX; row++) {
            for (int col = 0; col <= iterCountY; col++) {
                if (checkDiagonal(symb, col, row) || checkLanes(symb, col, row)) return true;
                // if (checkLanes(symb, col, row)) return true;
            }
        }
        // Все подквадраты в квадрате проверены. 4-х последовательностей
        // подряд не выявлено. Значит еще не победа.
        return false;
    }

    // Проверка осей.
    public static boolean checkLanes(char symb, int offsetX, int offsetY) {
        boolean cols, rows;
        for (int col = offsetX; col < block + offsetX; col++) {
            cols = true;
            rows = true;
            for (int row = offsetY; row < block + offsetY; row++) {
                cols &= (table[col][row] == symb);
                rows &= (table[row][col] == symb);
            }

            if (cols || rows) return true;
        }

        return false;
    }

    // Проверка диагоналей.
    public static boolean checkDiagonal(char symb, int offsetX, int offsetY) {
        boolean toright, toleft;
        for (int row = offsetY; row < block + offsetY; row++) {
            toright = true;
            toleft = true;
            for (int col = offsetX; col < block + offsetX; col++) {
                toright &= (table[col + (offsetY - offsetX)][col] == symb);
                toleft &= (table[col][block + offsetX + offsetY - col - 1] == symb);
            }

            if (toright || toleft) return true;
        }
        return false;
    }

}