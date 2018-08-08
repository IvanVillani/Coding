package app.factories;

import app.entities.ComicCharacterImpl;
import app.entities.antiHeroes.Titan;
import app.entities.antiHeroes.Villain;
import app.entities.heroes.DCHero;
import app.entities.heroes.MarvelHero;

public class ComicCharacterFactory {
    private ComicCharacterFactory() {
    }

    public static ComicCharacterImpl createHero(String name, String type, int energy, double health, double intelligence, double heroism) {
        switch (type) {
            case "DCHero":
                return new DCHero(name, energy, health, intelligence, heroism);

            case "MarvelHero":
                return new MarvelHero(name, energy, health, intelligence, heroism);

            default:
                return null;

        }
    }

    public static ComicCharacterImpl createAntiHero(String name, String type, int energy, double health, double intelligence, double evilness) {
        switch (type) {
            case "Villain":
                return new Villain(name, energy, health, intelligence, evilness);

            case "Titan":
                return new Titan(name, energy, health, intelligence, evilness);

            default:
                return null;

        }
    }
}
