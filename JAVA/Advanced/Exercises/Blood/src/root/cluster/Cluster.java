package root.cluster;


import root.cell.Cell;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
    private String id;
    private int rows;
    private int cols;
    private List<Cell> cells;

    public Cluster(String id, int rows, int cols) {
        this.id = id;
        this.rows = rows;
        this.cols = cols;
        this.cells = new ArrayList<>();
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cluster{}";
    }
}
