package p04_pizza_calories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Topping {
    private static final double DEFAULT_CAL_PER_GRAM = 2;
    private static final List<String> DEFAULT_TYPES = new ArrayList<>();

    static {
        DEFAULT_TYPES.add("Meat");
        DEFAULT_TYPES.add("Veggies");
        DEFAULT_TYPES.add("Cheese");
        DEFAULT_TYPES.add("Sauce");
    }

    private String type;
    private int weight;

    public Topping(String type, int weight) {
        this.setType(type);
        this.setWeight(weight);
    }

    public void setType(String type) {
        if (!DEFAULT_TYPES.contains(type)) {
            String message = String.format("Cannot place %s on top of your pizza.", type);
            throw new IllegalArgumentException(message);
        }
        this.type = type;
    }

    public void setWeight(int weight) {
        if (weight < 1 || weight > 50) {
            String message = String.format("%s weight should be in the range [1..50].", this.type);
            throw new IllegalArgumentException(message);
        }
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }
}
