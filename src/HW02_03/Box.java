package HW02_03;

import java.util.ArrayList;

public class Box <T>{

    private boolean isFree = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> fruitBox;
    public Box(){fruitBox = new ArrayList<T>();}

    // oid addFruit(T fruit) {
    //    if (currentWeight + 1 <= maxWeight) {
    //        arrayList.add(fruit);
    //        currentWeight++;
    //        if (arrayList.size() < 1)
    //            isFree = false;
    //    } else
    //        System.out.println("The box is full");
    //

    void addFruit (T fruit){
        fruitBox.add(fruit);
    }

    float getWeight(Fruit f) {
        System.out.println("Вес ящика с " + (fruitBox.size() * f.weigth));
        return fruitBox.size() * f.weigth;
    }

    boolean compare(Fruit f1, Fruit f2) {
        if (getWeight(f1) == getWeight(f2)) {
            return true;
        } else return false;
    }

    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }

}
