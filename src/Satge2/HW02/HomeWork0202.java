package Satge2.HW02;

public class HomeWork0202 {

    public static void main(String[] args) {
        // Обявляем двумерный массив из стрингов.
        String [][] myStrArray = new String[4][4];

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
        myStrArray[3][2]="3";
        myStrArray[3][3]="м";

        printArray(myStrArray); // Вывод в консоль.

        // Суммируем строки.
        int allreadySum = 0;
        try {
            for (int i = 0; 1 < myStrArray.length; i++) {
                allreadySum = allreadySum + processLine(myStrArray[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException е){
            System.out.println("Ошибка индексации массива: " + е);
        }
        finally {
            System.out.println("Сумма всех строк массива: " + allreadySum);
        }
    }


    public static int processLine(String[] strings) {
        int sumLine=0;
        Integer[] intarray=new Integer[strings.length];
        int i=0;
        for(String str:strings){
            try {
                intarray[i]=Integer.parseInt(str);
                i++;
                sumLine = sumLine + Integer.parseInt(str);

            }

            catch (NumberFormatException nfe) {
                System.out.println("Not a number: " + str + " at index " + i +  nfe.getMessage());
            }

        }
        System.out.println("Сумма строки = " + sumLine);
        return sumLine;
    }


    // Метод преобразующий String в Int.
    public static int toInt(String args) {
        int i = Integer.parseInt(args.trim());
        return i;
    }


    // Вывод массива в консоль.
    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int z = 0; z < array[i].length; z++){
            System.out.print(array[i][z] + " ");
            }
            System.out.print("\n");
        }
    }

}
