package p02_king_gambit;

import p02_king_gambit.interfaces.Mortal;

public class RoyalGuard implements Mortal{
    private String name;
    private boolean isKilled;

    public RoyalGuard(String name) {
        this.name = name;
        this.isKilled = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setIsKilled(boolean state) {
        this.isKilled = state;
    }

    @Override
    public boolean isKilled() {
        return isKilled;
    }

    @Override
    public void takeAttack() {
        System.out.printf("Royal Guard %s is defending!%n", this.name);
    }
}
