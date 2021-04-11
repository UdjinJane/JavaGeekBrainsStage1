package HomeWork05.SuperAnimal;

import java.util.Random;

public abstract class SuperAnimal {
    protected final int randomizer;

    protected String name;

    // Минимальные значения полей!!!!.
    // protected int hasSale; .. Плавание выведено в объекты.
    protected int hasRun;
    protected int hasJump;


    public SuperAnimal(String name, int hasRun, int hasJump) {
        randomizer = 3;
        this.name = name;
        // this.hasSale = getRandomNumberUsingNextInt(hasSale * randomizer, hasSale);
        this.hasRun = hasRun;
        this.hasJump = hasJump;

    }

public void itRun(int meters){
        printThis(name + " is running " + meters + ".\n");
}

public void itFloat(int meters){
    printThis(name + " is floating " + meters + ".\n");
}

public void itJump(int meters) {
    printThis(name + " is jumping" + meters + ".\n");
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

