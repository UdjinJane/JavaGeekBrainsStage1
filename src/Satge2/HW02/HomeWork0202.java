package Satge2.HW02;

import static HomeWork03.KrestikiNoliki03.random;

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

        printArray(myStrArray);

    }

    

    // Вывод массива в консоль.
    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int z = 0; z < array.length; z++){
            System.out.print(array[i][z] + " ");
            }
            System.out.print("\n");
        }
    }

}
