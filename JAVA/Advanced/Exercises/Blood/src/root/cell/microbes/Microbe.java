package root.cell.microbes;

import root.cell.Cell;

public abstract class Microbe extends Cell {
    private int virulence;

    public Microbe(String id, int health, int positionRow, int positionCol, int vriulence) {
        super(id, health, positionRow, positionCol);
        this.virulence = vriulence;
    }

    public int getVirulence() {
        return virulence;
    }
}
