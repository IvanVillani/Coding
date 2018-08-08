package app.entities;

import app.interfaces.ComicCharacter;
import app.interfaces.SuperPower;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ComicCharacterImpl implements ComicCharacter {
    private String name;
    private int energy;
    private double health;
    private double intelligence;
    private List<SuperPower> powers;
    private double attack;

    public ComicCharacterImpl(String name, int energy, double health, double intelligence) {
        this.setName(name);
        this.setEnergy(energy);
        this.setHealth(health);
        this.setIntelligence(intelligence);
        this.powers = new ArrayList<>();
    }

    public abstract double getAttack();

    public List<SuperPower> getPowers() {
        return powers;
    }

    public void setName(String name) {
        Pattern pattern = Pattern.compile("^([A-Za-z_]{2,12})$");
        Matcher matcher = pattern.matcher(name);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Comic Character name is not in the correct format!");
        } else {
            this.name = name;
        }

    }

    public void setEnergy(int energy) {
        if (energy < 0 || energy > 300) {
            throw new IllegalArgumentException("Energy is not in the correct range!");
        } else {
            this.energy = energy;
        }
    }

    public void setHealth(double health) {
        if (health < 0.0) {
            throw new IllegalArgumentException("Health should be a possitive number!");
        } else {
            this.health = health;
        }
    }

    public void setIntelligence(double intelligence) {
        if (intelligence < 0.0 || intelligence > 200) {
            throw new IllegalArgumentException("Intelligence is not in the correct range!");
        } else {
            this.intelligence = intelligence;
        }
    }

    @Override
    public void takeDamage(double damage) {

    }

    @Override
    public void boostCharacter(int energy, double health, double intelligence) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getEnergy() {
        return 0;
    }

    @Override
    public double getHealth() {
        return 0;
    }

    @Override
    public double getIntelligence() {
        return 0;
    }

    @Override
    public String useSuperPowers() {
        return null;
    }

    @Override
    public void addSuperPower(SuperPower superPower) {

    }
}