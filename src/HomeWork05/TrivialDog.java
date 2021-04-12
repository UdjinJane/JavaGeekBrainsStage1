package HomeWork05;

import HomeWork05.SuperAnimal.SuperAnimal;

public class TrivialDog extends SuperAnimal {
    // Рандомизируем собачек.
    protected final int randomizer = 2;

    // Умеет плавать
    protected int hasSale;

    public TrivialDog(String name, int hasRun, float hasJump, int hasSale) {
        super(name, hasRun, hasJump);
        this.hasSale = hasSale;

        // Рандомизирум собачек по пробегаемой дистанции.
        this.hasRun = getRandomNumberUsingNextInt(hasRun, hasRun*randomizer);
    }

}
