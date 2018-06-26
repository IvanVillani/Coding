package p02_wild_farm;

import p02_wild_farm.Felime;
import p02_wild_farm.Food;

import java.text.DecimalFormat;

public class Cat extends Felime {
    protected String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.foodEaten += food.getGuantity();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]%n", super.animalType, super.animalName, this.breed, df.format(super.animalWeight), super.livingRegion, super.foodEaten);
    }
}
