package p08_pokemon_trainer;

import java.util.LinkedList;

public class Trainer {
    private String name;
    private int badges;
    private LinkedList<Pokemon> pokemons;

    public Trainer(String name, LinkedList<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public LinkedList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(LinkedList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
