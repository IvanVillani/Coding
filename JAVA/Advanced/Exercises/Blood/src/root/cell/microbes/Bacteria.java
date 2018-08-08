package root.cell.microbes;

public class Bacteria extends Microbe {
    public Bacteria(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
        super.setEnergy((super.getHealth() + super.getVirulence()) / 3);
    }

    public void updateEnergy() {
        super.setEnergy((super.getHealth() + super.getVirulence()) / 3);
    }
}
