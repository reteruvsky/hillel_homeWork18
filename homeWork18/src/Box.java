import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list = new ArrayList<>();

    public List<T> toList(T[] list) {
        return new ArrayList<>(Arrays.asList(list));
    }

    public void addOneFruit(T fruit) {
        list.add(fruit);
    }

    public void addLotsOfFruits(List<T> fruits) {
        list.addAll(fruits);
    }

    public float getWeight(List<? extends Fruit> fruits) {
        return fruits.stream().mapToDouble(Fruit::getWeight).count();
    }

    public boolean compare(List<? extends Fruit> fruits) {
        return getWeight(list) == getWeight(fruits) ? true : false;
    }

    public void merge(List<T> boxes) {
        list.addAll(boxes);
    }
}
