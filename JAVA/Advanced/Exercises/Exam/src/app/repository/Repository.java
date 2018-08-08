package app.repository;

import app.entities.ArenaImpl;
import app.entities.ComicCharacterImpl;
import app.entities.Power;
import app.interfaces.Arena;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<ComicCharacterImpl> heroes;
    private List<ComicCharacterImpl> antiHeroes;
    private List<ArenaImpl> arenas;
    private List<Power> powers;
    private List<Power> assigned;
    private List<Integer> heroWars;
    private List<Integer> antiHeroWars;

    public Repository() {
        this.heroes = new ArrayList<>();
        this.antiHeroes = new ArrayList<>();
        this.arenas = new ArrayList<>();
        this.powers = new ArrayList<>();
        this.assigned = new ArrayList<>();
        this.heroWars = new ArrayList<>();
        this.antiHeroWars = new ArrayList<>();
    }

    public List<Integer> getHeroWars() {
        return heroWars;
    }

    public List<Integer> getAntiHeroWars() {
        return antiHeroWars;
    }

    public List<Power> getAssigned() {
        return assigned;
    }

    public List<ComicCharacterImpl> getHeroes() {
        return heroes;
    }

    public List<ComicCharacterImpl> getAntiHeroes() {
        return antiHeroes;
    }

    public List<ArenaImpl> getArenas() {
        return arenas;
    }

    public List<Power> getPowers() {
        return powers;
    }

    public String addHero(ComicCharacterImpl hero) {
        for (ComicCharacterImpl hero1 : heroes) {
            if (hero1.getName().equals(hero.getName())) {
                hero1.setEnergy(hero.getEnergy());
                hero1.setHealth(hero.getHealth());
                hero1.setIntelligence(hero.getIntelligence());
                return String.format("%s evolved!", hero1.getName());
            }
        }
        heroes.add(hero);
        return String.format("%s is ready for battle!", hero.getName());
    }

    public String addAntiHero(ComicCharacterImpl antiHero) {
        for (ComicCharacterImpl antiHero1 : antiHeroes) {
            if (antiHero1.getName().equals(antiHero.getName())) {
                antiHero1.setEnergy(antiHero.getEnergy());
                antiHero1.setHealth(antiHero.getHealth());
                antiHero1.setIntelligence(antiHero.getIntelligence());
                return String.format("%s is getting stronger!", antiHero1.getName());
            }
        }
        heroes.add(antiHero);
        return String.format("%s is ready for destruction!", antiHero.getName());    }

    public String addArena(Arena arena) {
        for (ArenaImpl arena1 : arenas) {
            if (arena.getArenaName().equals(arena1.getArenaName())) {
                return "A battle is about to start there!";
            }
        }
        return String.format("%s is becoming a fighting ground!", arena.getArenaName());
    }
}
