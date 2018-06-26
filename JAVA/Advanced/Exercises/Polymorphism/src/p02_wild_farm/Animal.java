package p02_wild_farm;


public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected double animalWeight;
    protected int foodEaten;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    @Override
    public abstract String toString();
}
