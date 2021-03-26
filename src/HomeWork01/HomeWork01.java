package HomeWork01;

public class HomeWork01 {

    public static void main(String[] args) {
        // Задание 1.
        // Инициализация переменных.
        int intA = 1;
        int intB = 2;
        int intC = 15;
        int intD = 4;
        // Вызов метода.
        System.out.println("Ответ на задание 1: " + mathMethod(intA, intB, intC, intD));

        // Задание 2.
        // Инициализация переменных.
        int intAA = 9;
        int intBB = 11;
        // Вызов метода.
        System.out.println("Ответ на задание 2: " + mathCompare(intAA, intBB));

        // Задание 3.
        // Инициализация переменных.
        int intUnknown = 0;
        // Вызов метода.
        mathNegative(intUnknown);

        // Задание 4.
        // Инициализация переменных.
        String nameLetter = "Udjin";
        // Вызов метода sayHello.
        sayHello(nameLetter);

        // Задание 5.
        // Инициализация переменных.
        int intYear = -2021;
        // Вызов метода checkYear.
        checkYear(intYear);


    }

    // Задание 1. Метод mathMethod.
    public static float mathMethod(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // Задание 2. Метод mathCompare.
    public static boolean mathCompare(int a, int b) {

        int sumCompare = a + b;
        if (sumCompare >= 10 & sumCompare <= 20) {
            return true;
        }
        return false;
    }

    // Задание 3. Метод mathNegative.
    public static void mathNegative(int args) {
        System.out.println("Вывод результата задания 3. На вход подано " + args);
        if (args < 0) {
            System.out.println("На входе отрицательное число равное: " + args);
        } else {
            System.out.println("На входе положительное число равное: " + args);
        }
    }

    // Задание 4. Метод sayHello.
    public static void sayHello(String args) {
        String str1 = args;
        String str2 = "Привет, ";
        String str3 = "!";
        String result = str2 + str1 + str3;
        System.out.println("Вывод результата задания 4.");
        System.out.println(result);
    }

    // Задание 5. Метод checkYear.
    public static void checkYear(int year) {
        // Защита от отрицательных значений и предельного значениия < 1582.
        // Если проверки прошли, то индикатор 1582 по умолчанию.
        int yearInd = 1582;
        if (year < 1) {
            year = year * -1;
        }
        if (year < 1582) {
            yearInd = 1581;
        }
        // Проверка на 100-й год.
        if (year % 100 == 0) {
            yearInd = 100;
        }
        // Проверка на 400-й год.
        if (year % 400 == 0) {
            yearInd = 400;
        }

        // Вывод заголовка листинга.
        System.out.println("Вывод результата задания 5. На вход метода подан " + year + " год.");

        switch (yearInd) {

            case 1581:
                System.out.println(year + " год за пределами калндаря");
                break;
            case 100:
                System.out.println(year + " год не является високосным");
                break;
            case 400:
                System.out.println(year + " год является високосным");
                break;
            case 1582:

                // Условие проверки на 4

                if (year % 4 == 0) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
                break;
        }
    }
}