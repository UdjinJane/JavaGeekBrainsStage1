package Satge2.HW01;

public class RunWay implements LetInfo {
    int runWayLenth;

    public RunWay(int runWayLenth) {
        this.runWayLenth = runWayLenth;
    }

    public int getRunWayLenth() {
        return runWayLenth;
    }

    public void setRunWayLenth(int runWayLenth) {
        this.runWayLenth = runWayLenth;
    }

    public int GetLet() {
        return getRunWayLenth();
    }
}
