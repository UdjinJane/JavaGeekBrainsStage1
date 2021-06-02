package HW02_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        printThis("******************* Задание 1 ****************\n");
        // Задание 1. Создаем лист с набором стрингов.
        Collection<String> myFirstArray = new ArrayList<>(Arrays.asList("ship", "tank", "cobra", "cobra", "cat", "tank",
                "moon", "sol", "sol", "sol"));
        // Определение размера
        printThis( "Входные данные" + myFirstArray + "\nМассив имеет размер " + myFirstArray.size() + " элементов\n");

        // Создаем HashSet с набором данных из ArrayList.
        Collection<String>mySet = new HashSet<>(myFirstArray);

        // Передаем как параметр в HashSet и выводим данные.
        printThis("Уникальные данные в массиве:" + mySet + "\n");

        String unicName="";
        for (String name : mySet) {
            int count = Collections.frequency(myFirstArray, name);
            unicName = unicName + name + " count " + count + "\n";
        }
       printThis("Подсчет уникальных вхождений:\n");
       printThis(unicName + "\n");


    }

    // Служебный метод для вывода в консоль.
    static void printThis(String value){
        System.out.print(value);
    }

}
