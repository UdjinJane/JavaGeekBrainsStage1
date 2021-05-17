package Satge2.HW01;
import static java.lang.Integer.parseInt;

public class Test {

    public static void main(String[] args) {

        Human human = new Human("Ivan", 10,2);
        Cat cat = new Cat("Murzik", 5, 3);
        Robot robot =new Robot("Robby", 50, 0);

        // Генерируем стену.
        TheWall theWall = new TheWall(1);
        // Генерируем беговую дорожку.
        RunWay runWay = new RunWay(6);

        // Собираем команду.
        Info [] flock ={human, cat, robot};

        // Получаем информацию о участниках.
        for (int i = 0; i < flock.length; i++){
            // flock[i].ShowInfo();
            outputInfo(flock[i]);
        }

        // Пусть попрыгают.
        printThis("**************Отбор по прыжку***************\n");

        for (int i = 0; i < flock.length; i++){

        // Если перепрыгнуть не получается, выводит сообщение о своих праметрах и выбывает из соревнований.
           if (flock[i].GetJump() < theWall.wallHeigth){
               outputInfo(flock[i]);
               printThis("i can't fly!\n");
               flock[i].SetParticipiant();
           };

        }

        // Пусть побегают.

        printThis("**************Отбор по бегу***************\n");

        for (int i = 0; i < flock.length; i++){

            // Если перепрыгнуть не получается, выводит сообщение о своих праметрах и выбывает из соревнований.
            if (flock[i].GetRun() < runWay.runWayLenth){
                outputInfo(flock[i]);
                printThis("i can't run!\n");
                flock[i].SetParticipiant();
            };

        }





    }




    // Выводим информацию о участниках.
    public static void outputInfo(Info info){
        info.ShowInfo();
    }

    // Вывод в консоль.
    public static void printThis(String value){
        System.out.print(value);
    }
}

