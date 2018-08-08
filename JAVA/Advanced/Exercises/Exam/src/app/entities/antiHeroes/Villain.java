package app.entities.antiHeroes;

public class Villain extends AntiHero{
    public Villain(String name, int energy, double health, double intelligence, double evilness) {
        super(name, energy, health, intelligence, evilness);
    }

    @Override
    public double attack() {
        return 0;
    }

    @Override
    public double getAttack() {
        return (super.getIntelligence() * super.getSpecial()) / super.getEnergy();
    }
}
