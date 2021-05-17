package Satge2.HW01;
import static java.lang.Integer.parseInt;

public class Test {

    public static void main(String[] args) {

        Human human = new Human("Ivan", 10,2);
        Cat cat = new Cat("Murzik", 5, 4);
        Robot robot =new Robot("Robby", 50, 10);

        // Генерируем стену.
        TheWall theWall = new TheWall(3);
        printThis("Стена имеет высоту: " + theWall.GetLet() + "\n");
        // Генерируем беговую дорожку.
        RunWay runWay = new RunWay(20);
        printThis("Дорожка имеет длину: " + runWay.GetLet() + "\n");

        // Собираем команду.
        Info [] flock ={human, cat, robot};

        // Собираем препятсвия.
        LetInfo [] let = {theWall, runWay};

        // Получаем информацию о участниках.
        for (int i = 0; i < flock.length; i++){
            // flock[i].ShowInfo();
            outputInfo(flock[i]);
        }

        // Пусть попрыгают и побегают.

        printThis("************** Сорвенования стартовали! ***************\n");

        for (int z = 0; z < let.length; z++){
            for (int i = 0; i < flock.length; i++){
                if ((flock[i].GetJump() < let[0].GetLet()) && (flock[i].GetParticipiant() == 1)){
                    outputInfo(flock[i]);
                    printThis("Я не смог перепрыгнуть "+ let[0].GetLet() + "\n");
                    flock[i].SetParticipiant(); // Если не смог, то сбрасываем участника.
                    printThis("Выбываю из соревнований по прыжкам!\n");
                }
                if ((flock[i].GetRun() < let[1].GetLet()) && (flock[i].GetParticipiant() == 1)){
                    outputInfo(flock[i]);
                    printThis("Я не смог пробежать! " + let[1].GetLet() + "\n");
                    flock[i].SetParticipiant(); // Если не смог, то сбрасываем участника.
                    printThis("Выбываю из соревнований по бегу!\n");
                }

            }
        }

        // Получаем информацию о результатах соревнований.
        printThis("************** Р Е З У Л Ь Т А Т ! ***************\n");
        for (int i = 0; i < flock.length; i++){
           flock[i].ShoWin();
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

