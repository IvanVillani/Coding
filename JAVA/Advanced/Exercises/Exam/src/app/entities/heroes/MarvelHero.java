package app.entities.heroes;

public class MarvelHero extends Hero{
    public MarvelHero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence, heroism);
    }

    @Override
    public double attack() {
        return 0;
    }

    @Override
    public double getAttack() {
        return ((super.getEnergy() + super.getSpecial()) * super.getIntelligence()) / 2.5;
    }
}
