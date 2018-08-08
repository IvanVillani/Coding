package p02_king_gambit;

import p02_king_gambit.interfaces.Attackable;
import p02_king_gambit.interfaces.Mortal;

import java.util.ArrayList;
import java.util.List;

public class King implements Attackable {
    private String name;
    List<Mortal> mortals;

    public King(String name) {
        this.name = name;
        this.mortals = new ArrayList<>();
    }

    public void addMortal(Mortal mortal) {
        mortals.add(mortal);
    }

    public void killMortal(String name) {
        for (Mortal mortal : mortals) {
            if (name.equals(mortal.getName())) {
                mortal.setIsKilled(true);
                mortals.remove(mortal);
                break;
            }
        }
    }

    @Override
    public void takeAttack() {
        System.out.printf("King %s is under attack!%n", this.name);
        for (Mortal mortal : mortals) {
            mortal.takeAttack();
        }
    }
}
