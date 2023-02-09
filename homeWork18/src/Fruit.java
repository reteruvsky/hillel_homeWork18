public class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}

class Apple extends Fruit {

    public Apple(float weight) {
        super(weight);
    }
}

class Orange extends Fruit {

    public Orange(float weight) {
        super(weight);
    }
}
