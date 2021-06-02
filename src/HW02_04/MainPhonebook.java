package HW02_04;
import java.util.*;

public class MainPhonebook {
    public static void main(String[] args) {


        //Задание 2
        System.out.println("Телефонная книга. Добавляем и ищем по фамилии:");
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Иванов Иван Иванович", "+79999999991");
        phonebook.add("Сидоров Василий Васильевич", "+79999999992");
        phonebook.add("Просто Маша", "89999999993");
        phonebook.add("Иванов Иван Иванович", "+8924111111111");
        phonebook.add("Петров", "+791112322222");
        phonebook.add("Иванов Иван Иванович", "+7922224442");

        printThis("******************* Задание 2 ****************\n");

        phonebook.get("Иванов Иван Иванович");
        phonebook.get("Просто Маша");


    }


    // Служебный метод для вывода в консоль.
    static void printThis(String value) {
        System.out.print(value);
    }
}