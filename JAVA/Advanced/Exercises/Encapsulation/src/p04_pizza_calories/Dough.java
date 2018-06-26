package p04_pizza_calories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Dough {
    private static final double DEFAULT_CAL_PER_GRAM = 2;
    private static final List<String> DEFAULT_TYPES = new ArrayList<>();
    static {
        DEFAULT_TYPES.add("White");
        DEFAULT_TYPES.add("Wholegrain");
    }
    private static final List<String> DEFAULT_BAKED = new ArrayList<>();
    static {
        DEFAULT_BAKED.add("Crispy");
        DEFAULT_BAKED.add("Chewy");
        DEFAULT_BAKED.add("Homemade");
    }

    private String type;
    private String baked;
    private int weight;

    public Dough(String type, String baked, int weight) {
        this.setType(type);
        this.setBaked(baked);
        this.setWeight(weight);
    }

    public void setType(String type) {
        if (!DEFAULT_TYPES.contains(type)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.type = type;
    }

    public void setBaked(String baked) {
        if (!DEFAULT_BAKED.contains(baked)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.baked = baked;
    }

    public void setWeight(int weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getBaked() {
        return baked;
    }
}
