package Satge2.HW02;

public class HomeWork0202v02 {

    public static void main(String[] args) {

        String[][] myStrArray = new String[4][4];

        myStrArray[0][0]="1";
        myStrArray[0][1]="2";
        myStrArray[0][2]="3";
        myStrArray[0][3]="4";

        myStrArray[1][0]="1";
        myStrArray[1][1]="2";
        myStrArray[1][2]="3";
        myStrArray[1][3]="5";

        myStrArray[2][0]="11";
        myStrArray[2][1]="2";
        myStrArray[2][2]="3";
        myStrArray[2][3]="6";

        myStrArray[3][0]="1";
        myStrArray[3][1]="2";
        myStrArray[3][2]="5";
        myStrArray[3][3]="15";

        // Вывод массива в консоль.
        printArray(myStrArray);

        // Преобразуем и суммируем.

        try {
            try {
                int result = summDimention(myStrArray);
                printThis("Массив успешно приведен к Integer\n");
                printThis("Сумма значений составляет: " + result + "\n");

            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышает заданный (4)!");
            }

        }
        catch (MyArrayDataException e) {
            System.out.println("Невозможно сконвертировать в Integer!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.y);
        }

        // Пример с ошибкой.
        myStrArray[0][0]="v";
        // Вывод массива в консоль.

        printArray(myStrArray);

        // Преобразуем и суммируем.

        try {
            try {
                int result = summDimention(myStrArray);
                printThis("Массив успешно приведен к Integer\n");
                printThis("Сумма значений составляет: " + result + "\n");

            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышает заданный (4)!");
            }

        }
        catch (MyArrayDataException e) {
            System.out.println("Невозможно сконвертировать в Integer!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.y);
        }

    }


    public static int summDimention(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sumValueOfArray = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int у = 0; у < array[i].length; у++) {
                try {
                    sumValueOfArray = sumValueOfArray + Integer.parseInt(array[i][у]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, у);
                }


            }


        }
        return sumValueOfArray;
    }

    // Вывод массива в консоль.
    static void printArray(String[][] array) {
        printThis("Задан массив\n");
        for (int i = 0; i < array.length; i++) {
            for (int z = 0; z < array[i].length; z++){
                System.out.print(array[i][z] + " ");
            }
            System.out.print("\n");
        }
    }

    // Сервиссный метод печати.
    static void printThis(String value){
        System.out.print(value);
    }

}
