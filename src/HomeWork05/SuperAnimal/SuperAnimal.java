package HomeWork05.SuperAnimal;

import java.util.Random;

public abstract class SuperAnimal {


    protected String name;

    // Минимальные значения полей!!!!.
    // protected int hasSale; .. Плавание выведено в объекты.
    protected int hasRun;
    protected float hasJump;


    public SuperAnimal(String name, int hasRun, float hasJump) {
        // randomizer = 3;
        this.name = name;
        // this.hasSale = getRandomNumberUsingNextInt(hasSale * randomizer, hasSale);
        this.hasRun = hasRun;
        this.hasJump = hasJump;

    }

public void itRun(int meters){

        if (meters<=this.hasRun){
        printThis(name + " is running " + meters + " from " + this.hasRun + ".\n");
        } else {

            printThis(name + " speak Ну не шмогла я, не шмогла. " + meters + " from " + this.hasRun + ".\n");
        }

}

public void itFloat(int meters){
    printThis(name + " is floating " + meters + ".\n");
}

public void itJump(int meters) {
    printThis(name + " is jumping " + meters + ".\n");
    }

    // Функция рандома параметров.

    public int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    // Вывод в консоль.
    public void printThis(String value){
        System.out.print(value);
    }
}

