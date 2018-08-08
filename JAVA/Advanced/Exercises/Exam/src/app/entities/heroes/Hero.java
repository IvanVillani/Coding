package app.entities.heroes;

import app.entities.ComicCharacterImpl;

public abstract class Hero extends ComicCharacterImpl {
    private double heroism;

    public Hero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence);
        this.setHeroism(heroism);
    }

    public void setHeroism(double heroism) {
        if (heroism < 0.0) {
            throw new IllegalArgumentException("Heroism should be a possitive number!");
        }else {
            this.heroism = heroism;
        }
    }

    @Override
    public double getSpecial() {
        return this.heroism;
    }
}
