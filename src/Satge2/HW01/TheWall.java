package Satge2.HW01;

public class TheWall implements LetInfo {
    int wallHeigth;

    public TheWall(int wallHeigth) {
        this.wallHeigth = wallHeigth;
    }

    public int getWallHeigth() {
        return wallHeigth;
    }

    public void setWallHeigth(int wallHeigth) {
        this.wallHeigth = wallHeigth;
    }

    public int GetLet() {
        return getWallHeigth();
    }
}



