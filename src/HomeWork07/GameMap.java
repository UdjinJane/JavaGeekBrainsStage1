package HomeWork07;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 15.04.2021
 */

public class GameMap extends JPanel {

    public static final int PVE_MODE = 0;
    public static final int PVP_MODE = 1;

    public static int sizeX = 2;
    public static int sizeY = 1;

    public void setSizeX (int sizeX){
        this.sizeX = sizeX;

    }

    public void setSizeY (int sizeY){
        this.sizeY=sizeY;
    }

    public int getSizeX(){
        return sizeX;
    }
    public int getSizeY(){
        return sizeY;
    }





    void startGame(int gameMode, int gameMapSizeX, int gameMapSizeY, int winLength) {


        System.out.println("Game start with settings: [game mode = " + gameMode +
                "] [map size = " + gameMapSizeX + "x" + gameMapSizeY + "] [winLength = " + winLength + "]");

        // setBackground(Color.red);

        setLayout(new GridLayout(getSizeX(),getSizeY()));
        // this.setLayout(new FlowLayout());
        for (int i = 1; i <= getSizeX(); i++) {
            add(new JButton("Button # " + i));
            System.out.println("sizeX: " + i);
        }


    }

    GameMap() {
        setBackground(Color.GRAY);
    }



/*
1. Полностью разобраться с кодом (попробовать полностью самостоятельно переписать одно из окон)
2. * Раcчертить панель GameMap на поле для игры, согласно gameMapSizeX, gameMapSizeY
*/


}
