package HomeWork05;

import HomeWork05.SuperAnimal.SuperAnimal;

public class TrivialCat extends SuperAnimal {

    public TrivialCat(String name, int hasRun, float hasJump) {
        super(name,  hasRun, hasJump);

    }
    @Override
    public void itFloat(int meters){

        printThis(this.name + " Я не умею плавать!\n");

    }
}
