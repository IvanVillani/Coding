package p02_wild_farm;

import p02_wild_farm.Animal;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]%n", super.animalType, super.animalName, df.format(super.animalWeight), this.livingRegion, super.foodEaten);
    }
}
