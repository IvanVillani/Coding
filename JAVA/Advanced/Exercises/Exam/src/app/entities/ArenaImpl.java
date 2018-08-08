package app.entities;

import app.entities.antiHeroes.AntiHero;
import app.entities.heroes.Hero;
import app.interfaces.Arena;
import app.interfaces.ComicCharacter;

import java.util.ArrayList;
import java.util.List;

public class ArenaImpl implements Arena {
    private String arenaName;
    private List<Hero> heroes;
    private List<AntiHero> antiHeroes;
    private int capacity;

    public ArenaImpl(String arenaName, int capacity) {
        this.arenaName = arenaName;
        this.heroes = new ArrayList<>();
        this.antiHeroes = new ArrayList<>();
        this.capacity = capacity;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public List<AntiHero> getAntiHeroes() {
        return antiHeroes;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getArenaName() {
        return null;
    }

    @Override
    public boolean isArenaFull() {
        return false;
    }

    @Override
    public void addHero(ComicCharacter hero) {

    }

    @Override
    public void addAntiHero(ComicCharacter antiHero) {

    }

    @Override
    public boolean fightHeroes() {
        return false;
    }
}
