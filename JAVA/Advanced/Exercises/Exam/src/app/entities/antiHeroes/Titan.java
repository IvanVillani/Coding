package app.entities.antiHeroes;

public class Titan extends AntiHero{
    public Titan(String name, int energy, double health, double intelligence, double evilness) {
        super(name, energy, health, intelligence, evilness);
    }

    @Override
    public double attack() {
        return 0;
    }

    @Override
    public double getAttack() {
        return (super.getEnergy() + super.getIntelligence() + super.getSpecial())  * 3;
    }
}
