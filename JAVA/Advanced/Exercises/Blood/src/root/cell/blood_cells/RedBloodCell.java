package root.cell.blood_cells;

public class RedBloodCell extends BloodCell {
    private int velocity;

    public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
        super(id, health, positionRow, positionCol);
        this.velocity = velocity;
        super.setEnergy(super.getHealth() + this.velocity);
    }

    public int getVelocity() {
        return velocity;
    }

    public void updateEnergy() {
        super.setEnergy(super.getHealth() + this.velocity);
    }
}
