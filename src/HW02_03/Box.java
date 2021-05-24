package HW02_03;

import java.util.ArrayList;

public class Box <T>{

    private boolean isFree = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> fruitBox;
    public Box(){fruitBox = new ArrayList<T>();}


    void addFruit (T fruit){
        fruitBox.add(fruit);
    }

    float getWeight(Fruit f) {
        System.out.println("Вес ящика с " + f.name + ": " + (fruitBox.size() * f.weigth));
        return fruitBox.size() * f.weigth;
    }

    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }
// Пересыпалка.
    public Box<T> replace(Box<T> srcBox){

        this.fruitBox.addAll(srcBox.fruitBox);
        srcBox.fruitBox.clear();
        System.out.println("Пересыпали яблоки в новый ящик!");
        return this;

    }

}
