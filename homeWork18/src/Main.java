import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fruit fruit = new Fruit(0);
        Apple apple = new Apple(1);
        Orange orange = new Orange(1.5F);

        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruit);
        fruitList.add(apple);
        fruitList.add(orange);

        Box<Fruit> box = new Box<>();

        box.addOneFruit(fruit);
        box.addLotsOfFruits(fruitList);
        box.getWeight(fruitList);
        box.compare(fruitList);
        box.merge(fruitList);
    }
}

