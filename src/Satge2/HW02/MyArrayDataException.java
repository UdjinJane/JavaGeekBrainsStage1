package Satge2.HW02;

public class MyArrayDataException extends Exception {

    int i;
    int y;

    MyArrayDataException(int i, int y) {
        this.i = i;
        this.y = y;
}
}
