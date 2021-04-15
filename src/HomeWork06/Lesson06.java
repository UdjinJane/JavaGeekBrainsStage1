package HomeWork06;

import java.util.Objects;
import java.util.Scanner;



public class Lesson06 extends Object {

//    private static Scanner scanner = new Scanner(System.in);
    private static int round = 1;

    public static void main(String[] args) throws InterruptedException {


        LightHero lightHero = new LightHero("LightHero", 15, 100, 20);
        DarkHero darkHero = new DarkHero("DarkHero", 25, 150, 5);
        Healer healer = new Healer("Healer", 1, 50, 1);

        while (!lightHero.isDead() || !darkHero.isDead()) {
            System.out.println("**** Round " + round + " ****");

            System.out.println(lightHero.getHeroInfo());
            System.out.println(darkHero.getHeroInfo());

            lightHero.attack(darkHero);

            if (darkHero.isDead()) {
                System.out.println("lightHero win");
                break;
            }

            darkHero.attack(lightHero);

            if (lightHero.isDead()) {
                System.out.println("darkHero win");
                break;
            }
// Отключаем самолечение. Лечит хилер.
           // lightHero.healSelf();
           // darkHero.healSelf();

            healer.healerHelth(lightHero);
            healer.healerHelth(darkHero);

            System.out.println(lightHero.getHeroInfo());
            System.out.println(darkHero.getHeroInfo());
            round++;

            Thread.sleep(3000);
        }



//        while (!lightHero.isDead() || !darkHero.isDead()) {
//            lightHero.attack(darkHero);
//            System.out.println(lightHero.getHeroInfo());
//
//            if (darkHero.isDead()) {
//                break;
//            }
//
//            darkHero.attack(lightHero);
//            System.out.println(darkHero.getHeroInfo());
//
//            if (lightHero.isDead()) {
//                break;
//            }


//        }




    }

/**
 * 1. Посмотреть все предыдущие уроки в части кода: 1-6 уроки
 * 2. Вопросы в комментарии к домашней работе
 * 3. Модифицировать код в части работы с объектами.
 * 4. Тренировка по тестам Java
 */

}
