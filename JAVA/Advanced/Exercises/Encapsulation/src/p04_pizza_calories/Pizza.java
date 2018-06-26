package p04_pizza_calories;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

class Pizza {
    private static final double DEFAULT_CAL_PER_GRAM = 2;
    private static final Map<String, Double> DEFAULT_DOUGH_TYPES = new LinkedHashMap<>();
    static {
        DEFAULT_DOUGH_TYPES.put("White", 1.5);
        DEFAULT_DOUGH_TYPES.put("Wholegrain", 1.0);
    }
    private static final Map<String, Double> DEFAULT_BAKED = new LinkedHashMap<>();
    static {
        DEFAULT_BAKED.put("Crispy", 0.9);
        DEFAULT_BAKED.put("Chewy", 1.1);
        DEFAULT_BAKED.put("Homemade", 1.0);
    }
    private static final Map<String, Double> DEFAULT_TOPPING_TYPES = new LinkedHashMap<>();
    static {
        DEFAULT_TOPPING_TYPES.put("Meat", 1.2);
        DEFAULT_TOPPING_TYPES.put("Veggies", 0.8);
        DEFAULT_TOPPING_TYPES.put("Cheese", 1.1);
        DEFAULT_TOPPING_TYPES.put("Sauce", 0.9);
    }

    private String name;
    private Dough dough;
    private int toppingsCount;
    private LinkedList<Topping> toppings;

    public Pizza(String name, int toppingsCount) {
        this.setName(name);
        this.dough = null;
        this.setToppingsCount(toppingsCount);
        this.toppings = new LinkedList<>();
    }

    private void setName(String name) {
        if ("".equals(name) || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setToppingsCount(int toppingsCount) {
        if (toppingsCount < 0 || toppingsCount > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppingsCount = toppingsCount;
    }

    public LinkedList<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        double typeModifier = DEFAULT_DOUGH_TYPES.get(this.dough.getType());
        double bakedModifier = DEFAULT_BAKED.get(this.dough.getBaked());
        int weight = this.dough.getWeight();
        double doughCal = DEFAULT_CAL_PER_GRAM * weight * typeModifier * bakedModifier;

        double toppingsCal = 0.0;
        for (Topping topping : this.toppings) {
            double type1Modifier = DEFAULT_TOPPING_TYPES.get(topping.getType());
            int weight1 = topping.getWeight();

            double curr = DEFAULT_CAL_PER_GRAM * weight1 * type1Modifier;
            toppingsCal += curr;
        }

        double sum = doughCal + toppingsCal;

        return String.format("%s - %.2f", this.name, sum);
    }
}
