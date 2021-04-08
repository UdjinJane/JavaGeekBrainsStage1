package HomeWork04;

public class HomeWork040 {

    public static void main(String[] args) {
        Sotrudnik sotrudnik0 = new Sotrudnik("Petrov", "Boss", 50, 9025253234L, 25000);
        Sotrudnik.count++;
        Sotrudnik.printThis("Создан сотрудник номер " + Sotrudnik.count + " по фамилии: " + sotrudnik0.getNameFIO() + ". Возраст: " + sotrudnik0.getAge() + ". Оклад: " + sotrudnik0.getSalary() + "\n");
        Sotrudnik.printThis("ЗП при создании объекта: " + sotrudnik0.getSalary() + ".\n");

        sotrudnik0.changeSalary();
        sotrudnik0.changeSalary(); // Защита от повторной смены ЗП;
        Sotrudnik.printThis("ЗП после смены по условию: " + sotrudnik0.getSalary() + ".\n");
        Sotrudnik.printThis("ФИО: "); // Вывод ФИО и возраста методами объекта.
        sotrudnik0.shoName();
        Sotrudnik.printThis("Должность: ");
        sotrudnik0.shoPosition();


        Sotrudnik sotrudnik1 = new Sotrudnik("Ivanov", "Loer", 32, 9025253233L, 25000);
        Sotrudnik.count++;
        Sotrudnik.printThis("Создан сотрудник номер " + Sotrudnik.count + " по фамилии: " + sotrudnik1.getNameFIO() + ". Возраст: " + sotrudnik1.getAge() + ". Оклад: " + sotrudnik1.getSalary() + "\n");
        sotrudnik1.changeSalary();

        Sotrudnik sotrudnik2 = new Sotrudnik("Sidorov", "Driver", 30, 9025253232L, 25000);
        Sotrudnik.count++;
        Sotrudnik.printThis("Создан сотрудник номер " + Sotrudnik.count + " по фамилии: " + sotrudnik2.getNameFIO() + ". Возраст: " + sotrudnik2.getAge() + ". Оклад: " + sotrudnik2.getSalary() + "\n");
        sotrudnik2.changeSalary();

        Sotrudnik sotrudnik3 = new Sotrudnik("Vasilyev", "Merch", 40, 9025253231L, 25000);
        Sotrudnik.count++;
        Sotrudnik.printThis("Создан сотрудник номер " + Sotrudnik.count + " по фамилии: " + sotrudnik3.getNameFIO() + ". Возраст: " + sotrudnik3.getAge() + ". Оклад: " + sotrudnik3.getSalary() + "\n");
        sotrudnik3.changeSalary();
        Sotrudnik sotrudnik4 = new Sotrudnik("Vasechkin", "Admin", 25, 9025253229L, 25000);
        Sotrudnik.count++;
        Sotrudnik.printThis("Создан сотрудник номер " + Sotrudnik.count + " по фамилии: " + sotrudnik4.getNameFIO() + ". Возраст: " + sotrudnik4.getAge() + ". Оклад: " + sotrudnik4.getSalary() + "\n");
        sotrudnik4.changeSalary();

        // Массив сотрудников.
        Sotrudnik[] sotrudniks = new Sotrudnik[5];

        sotrudniks[0] = sotrudnik0;
        sotrudniks[1] = sotrudnik1;
        sotrudniks[2] = sotrudnik2;
        sotrudniks[3] = sotrudnik3;
        sotrudniks[4] = sotrudnik4;

        // Печать ФИО по условию возраст >=40.
        Sotrudnik.printThis("Печать ФИО по условию возраст >=40.\n");

        for (int i = 0; i < sotrudniks.length; i++)

            if (sotrudniks[i].getAge() >= 40) {
                Sotrudnik.printThis(sotrudniks[i].getCountAndFIO() + " Phone num: " + sotrudniks[i].getTelNumber() + ".\n");
            }

    }
}
