package Satge2.HW01;

public class Robot implements Info{
    private String name;
    // Участник соревнований.
    private int participant; // 1 - участник, 0 - проиграл. По умолчанию все участники.
    // Минимальные значения полей!!!!.
    private int hasRun; // Сколько может пробежать.
    private int hasJump; // Как высоко может прыгнуть.

    // Конструктор.
    public Robot(String name, int hasRun, int hasJump){
        this.participant = 1; // Все при инициализации участники.
        this.name = name;
        this.hasRun = hasRun;
        this.hasJump = hasJump;
    }

    // Умения.
    @Override
    public void ShowInfo(){
        System.out.println("Hello! May name is " + getName() + " i'm runnnig: " + getHasRun() + " i'm jampping: " + getHasJump());
    }
    @Override
    public int GetJump(){
        return getHasJump();
    }
    @Override
    public int GetRun(){
        return getHasRun();
    }
    @Override
    public void SetParticipiant(){
        setParticipant(0);
    }

    public void SayParam() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHasRun() {
        return hasRun;
    }

    public void setHasRun(int hasRun) {
        this.hasRun = hasRun;
    }

    public int getHasJump() {
        return hasJump;
    }

    public void setHasJump(int hasJump) {
        this.hasJump = hasJump;
    }
    public int getParticipant() {
        return participant;
    }

    public void setParticipant(int participant) {
        this.participant = participant;
    }
}
