package p04_cruelty_plan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gandalf {
    private static Map<String, Integer> FOOD_POINTS;
    static {
        FOOD_POINTS = new HashMap<>();
        FOOD_POINTS.put("cram", 2);
        FOOD_POINTS.put("lembas", 3);
        FOOD_POINTS.put("apple", 1);
        FOOD_POINTS.put("melon", 1);
        FOOD_POINTS.put("honeycake", 5);
        FOOD_POINTS.put("mushrooms", -10);
    }

    private int mood;
    private List<String> foods;

    public Gandalf(List<String> foods) {
        this.setFoods(foods);
    }

    private void setMood(int mood) {
        this.mood = mood;
    }

    private void setFoods(List<String> foods) {
        this.foods = foods;
    }

    private String getMoodType() {
        if (this.mood < -5) {
            return "Angry";
        } else if (this.mood < 0) {
            return "Sad";
        } else if (this.mood < 15) {
            return "Happy";
        } else {
            return "JavaScript";
        }
    }

    public void updateMood() {
        int curr = 0;
        for (String food : foods) {
            if (FOOD_POINTS.containsKey(food)) {
                curr += FOOD_POINTS.get(food);
            }else {
                curr -= 1;
            }
        }
        this.setMood(curr);
    }

    @Override
    public String toString() {
        return String.format("%d%n%s%n", this.mood, this.getMoodType());
    }
}
