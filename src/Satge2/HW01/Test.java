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
        RunWay runWay = new RunWay(20);

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

        for (int z = 0; z < let.length; z++){
            for (int i = 0; i < flock.length; i++){
                if ((flock[i].GetJump() < let[0].GetLet()) && (flock[i].GetParticipiant() == 1)){
                    outputInfo(flock[i]);
                    printThis("i can't fly!\n");
                    flock[i].SetParticipiant(); // Если не смог, то сбрасываем участника.
                }
                if ((flock[i].GetRun() < let[1].GetLet()) && (flock[i].GetParticipiant() == 1)){
                    outputInfo(flock[i]);
                    printThis("i can't Run!\n");
                    flock[i].SetParticipiant(); // Если не смог, то сбрасываем участника.
                }

            }
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

