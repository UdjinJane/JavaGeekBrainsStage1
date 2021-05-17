package HomeWork05;


import HomeWork05.SuperAnimal.SuperAnimal;

public class HomeWork05 {

    public static void main(String[] args) {

        // Собачек 2, чтобы видеть рандомизацию поля бега.
        TrivialDog dog00 = new TrivialDog("Dog00", 400, 0.5f, 10);
        TrivialDog dog01 = new TrivialDog("Dog01", 400, 0.5f, 10);
        TrivialHorse horse00 = new TrivialHorse("Horse00", 1500, 3.0f, 100);
        // Кошки и птички плавать не умеют.
        TrivialCat cat00 = new TrivialCat("Cat00", 200, 2.0f);
        TrivialBird bird00 = new TrivialBird("Bird00", 5, 0.2f);


        // Собираем стаю.
        SuperAnimal[] flock = {dog00, dog01, horse00, cat00, bird00};
        // И попросим животинок побегать попрыгать и поплавать.

        for (int i = 0; i < flock.length; i++) {
            flock[i].itRun(150);
            flock[i].itJump(5);
            flock[i].itFloat(20);

        }


    }


}
