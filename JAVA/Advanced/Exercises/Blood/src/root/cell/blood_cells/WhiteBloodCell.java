package root.cell.blood_cells;

public class WhiteBloodCell extends BloodCell {
    private int size;

    public WhiteBloodCell(String id, int health, int positionRow, int positionCol, int size) {
        super(id, health, positionRow, positionCol);
        this.size = size;
        super.setEnergy((super.getHealth() + this.size) * 2);
    }

    public int getSize() {
        return size;
    }

    public void updateEnergy() {
        super.setEnergy((super.getHealth() + this.size) * 2);
    }
}
