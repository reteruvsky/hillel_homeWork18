import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics<T> {

    public List<T> toList(T[] list) {
        return new ArrayList<>(Arrays.asList(list));
    }
}

class Fruit {
    private float weight;

    public float getWeight() {
        return weight;
    }
}

class Apple extends Fruit {
    final float weight = 1.0F;

    public float getWeight() {
        return weight;
    }

}

class Orange extends Fruit {
    final float weight = 1.5F;

    public float getWeight() {
        return weight;
    }

}
