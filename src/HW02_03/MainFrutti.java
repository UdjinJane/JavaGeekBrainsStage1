package HW02_03;
import java.util.ArrayList;
import java.util.Arrays;

public class MainFrutti {
    public static void main(String[] args) {

        // ************* Stage 1 ***************.

        String[] momArray = {"пьём", "до", "дна"};
        System.out.println(Arrays.toString(momArray));
        changePlaces (momArray, 0,1);
        changePlaces (momArray, 2,1);
        System.out.println(Arrays.toString(momArray));


        // ************* Stage 1 ***************.
    Apple apple = new Apple();
    Orange orange = new Orange();

    Box<Apple> boxApple = new Box<Apple>();
    Box<Apple> boxApple2 = new Box<Apple>(); // Ящик для пересыпания.
    Box<Orange> boxOrange = new Box<Orange>();

        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);


        boxApple.getWeight(apple);
        boxOrange.getWeight(orange);

        if (boxApple.compare(boxOrange)){
            System.out.println("Коробка с апельсинами тяжелее");
        } else {
            System.out.println("Коробка c яблоками тяжелее");
        }

        // Пересыпаем.

        boxApple2.replace(boxApple);


}

    private static void changePlaces(String[] momArray, int i, int i1) {
        String a = momArray[i];
        momArray[i] = momArray[i1];
        momArray[i1] = a;
    }
}
