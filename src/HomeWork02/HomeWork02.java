package HomeWork02;

public class HomeWork02 {
    public static void main(String[] args) {

// Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0.

        int[] myFirstArray = new int[]{1, 0, 0, 0, 1, 1, 1, 1, 0};

        System.out.println("Решение к заданию 1, развернутая запись if.");

        for (int i = 0; i < myFirstArray.length; i++) {
            System.out.print("Значение: " + myFirstArray[i]);
            if (myFirstArray[i] == 0) {
                myFirstArray[i] = 1;
                System.out.println(" Новое значение: " + myFirstArray[i]);
            } else {
                myFirstArray[i] = 0;
                System.out.println(" Новое значение: " + myFirstArray[i]);
            }
        }

        System.out.println("*****************");
        System.out.println("Решение к заданию 1, тренарная  запись if. Возврат массива в исходное состояние");
        // Тренарная запись
        for (int i = 0; i < myFirstArray.length; i++) {
            System.out.print("Значение: " + myFirstArray[i]);
            int a = myFirstArray[i] == 0 ? 1 : 0;
            System.out.println(" Новое значение: " + a);
            myFirstArray[i] = a; // Присваиваем замену элементу массива.
        }


        System.out.println("****** Задание 2 *******");

        // Задание 2. Задать пустой целочисленный массив размером 8.
        // Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;.

        int[] mySecondArray = new int[8];
        int[] myZArray = new int[]{1, 4, 7, 10, 13, 16, 19, 22}; // Создаем массив с данными для заполнения пустого массива.

        for (int i = 0; i < myZArray.length; i++) {
            mySecondArray[i] = myZArray[i]; // Заполняем пустой массив.
            System.out.print(mySecondArray[i] + " ");
        }
        System.out.println("\n******* Задание 3 **********");

        // Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ].
        // Написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2;
        // int[] myDim = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Развернутая запись.
        // myRedim(myDim);
        System.out.println("Набор исходных данных");
        System.out.println("1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1");

        myRedim(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}); // Укороченная запись вызова метода с инициадизацией массива как параметра.

        // Задание 4. 4 Задать одномерный массив.
        // Написать методы поиска в нём минимального и максимального элемента.

        int[] myDim = new int[]{-3, 5, 3, 2, 17, -4, 5, 2, 4, 8, 9, 16};

        System.out.println("\nмассив данных к заданию 4");
        for (int i = 0; i < myDim.length; i++)
            System.out.print(myDim[i] + " | ");
        System.out.println("\nМаксимальное значение в массиве: " + myMaxValue(myDim));
        System.out.println("Минимальное значение в массиве: " + myMinValue(myDim));

        // Задание 5. Создать квадратный целочисленный массив (количество строк и столбцов одинаковое)ю
        // Заполнить его диагональные элементы единицами, используя цикл(ы);
        int[][] myScquare = new int[10][10];
        // Выводим листинг исходных данных.
        System.out.println("\nЗадание 5. Исходный массив. Листинг");
        toPrint(myScquare);
        toChange(myScquare);
        System.out.println("\nЗадание 5. Результрующий массив. Листинг");
        toPrint(myScquare);

    }

    // Задание 5. Замена на диагонали.
    public static void toChange(int[][] mySquare) {
        System.out.print("\n");
        for (int i = 0; i < mySquare.length; i++) {
            for (int rows = 0; rows < mySquare[i].length; rows++) {
                mySquare[i][i] = 1; // Заполняем первую диагональ.
                mySquare[i][mySquare[i].length - 1 - i] = 1; // Заполняем вторую диагональ.
            }
        }
    }


    // Задание 5. Листинг двумерного массива.
    public static void toPrint(int[][] mySquare) {
        int counter = mySquare.length - 1;
        while (counter >= 0) {
            int counterRows = mySquare[counter].length - 1;
            while (counterRows >= 0) {
                System.out.print(mySquare[counter][counterRows] + "\t");
                counterRows--;
            }
            counter--;
            System.out.print("\n");
        }

    }

    // Метод к заданию 4 поиск максимума.

    public static int myMaxValue(int[] array) {
        int result = 0;
        for (int i = array.length - 1; i >= 1; i--) { // Пробегаемся с конца массива.
            if (array[i] > array[i - 1]) {  // Меняем местами данные в массиве.
                int memo = array[i];
                {
                    array[i] = array[i - 1];
                    array[i - 1] = memo;
                }
                result = array[i - 1];
            }
        }
        return result;
    }

    // Метод к заданию 4 поиск минимума.

    public static int myMinValue(int[] array) {
        int result = 0;
        for (int i = array.length - 1; i >= 1; i--) { // Пробегаемся с конца массива.
            if (array[i] < array[i - 1]) {  // Меняем местами данные в массиве.
                int memo = array[i];
                {
                    array[i] = array[i - 1];
                    array[i - 1] = memo;
                }
                result = array[i - 1];
            }
        }
        return result;
    }


    // Метод к заданию 3. Перемножаем по условию (<6? *2).
    public static void myRedim(int[] array) {
        System.out.println("Результат перемножения по условияю.");

        for (int i = 0; i < array.length; i++) {
            int a = array[i];

            if (a < 6) {
                a *= 2;
                System.out.print(a + " | ");
            }
        }
    }

}
