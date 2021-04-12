package HomeWork05;

import HomeWork05.SuperAnimal.SuperAnimal;

public class TrivialHorse extends SuperAnimal {

    // Умеет плавать
    protected int hasSale;

    public TrivialHorse(String name, int hasRun, float hasJump, int hasSale) {
        super(name,  hasRun, hasJump);
        this.hasSale = hasSale;
    }
}
