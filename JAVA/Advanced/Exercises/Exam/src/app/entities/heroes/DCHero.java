package app.entities.heroes;

public class DCHero extends Hero{
    public DCHero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence, heroism);
    }

    @Override
    public double attack() {
        return 0;
    }

    @Override
    public double getAttack() {
        return super.getEnergy() / 1.5 + super.getSpecial() + super.getIntelligence();
    }
}
