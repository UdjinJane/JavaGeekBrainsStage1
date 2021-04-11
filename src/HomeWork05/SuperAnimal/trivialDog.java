package HomeWork05.SuperAnimal;

public class trivialDog extends SuperAnimal {

    // Умеет плавать
    protected int hasSale;

    public trivialDog(String name,  int hasRun, int hasJump, int hasSale) {
        super(name,  hasRun, hasJump);
        this.hasSale = hasSale;
    }


}
