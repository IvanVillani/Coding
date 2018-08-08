package app.factories;


import app.entities.Power;

public class SuperPowerFactory {
    private SuperPowerFactory() {
    }

    public static Power createPower(String name,double points) {
        return new Power(name, points);
    }
}
