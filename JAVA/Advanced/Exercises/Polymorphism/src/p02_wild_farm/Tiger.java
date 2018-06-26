package p02_wild_farm;

import p02_wild_farm.Felime;
import p02_wild_farm.Food;
import p02_wild_farm.Vegetable;

public class Tiger extends Felime {
    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.foodEaten += food.getGuantity();
    }
}
