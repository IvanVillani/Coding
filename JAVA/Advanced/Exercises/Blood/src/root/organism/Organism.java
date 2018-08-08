package root.organism;

import root.cell.Cell;
import root.cell.blood_cells.RedBloodCell;
import root.cell.blood_cells.WhiteBloodCell;
import root.cell.microbes.Microbe;
import root.cluster.Cluster;

import java.util.ArrayDeque;
import java.util.List;
import java.util.stream.Collectors;

public class Organism {
    private String name;
    private ArrayDeque<Cluster> clusters;

    public Organism(String name) {
        this.name = name;
        this.clusters = new ArrayDeque<>();
    }



    public void setClusters(ArrayDeque<Cluster> clusters) {
        this.clusters = clusters;
    }

    public String getName() {
        return name;
    }

    public ArrayDeque<Cluster> getClusters() {
        return clusters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        int cellsCount = 0;
        for (Cluster cluster : clusters) {
            cellsCount += cluster.getCells().size();
        }

        sb.append(String.format("Organism - %s%n", this.name))
                .append(String.format("--Clusters: %d%n", this.clusters.size()))
                .append(String.format("--Cells: %d%n", cellsCount));
        for (Cluster cluster : clusters) {
            sb.append(String.format("----Cluster %s%n", cluster.getId()));
            List<Cell> sorted = cluster.getCells().stream()
                    .sorted((cell1, cell2) -> {
                        if (cell1.getPositionRow() != cell2.getPositionRow()) {
                            return Integer.compare(cell1.getPositionRow(), cell2.getPositionRow());

                        }else {
                            return Integer.compare(cell1.getPositionCol(), cell2.getPositionCol());

                        }
                    })
                    .collect(Collectors.toList());
            for (Cell cell : sorted) {
                sb.append(String.format("------Cell %s [%d,%d]%n", cell.getId(), cell.getPositionRow(), cell.getPositionCol()));

                int additional = 0;

                if (cell instanceof WhiteBloodCell) {
                    additional = ((WhiteBloodCell)cell).getSize();
                    sb.append(String.format("--------Health: %d | Size: %d | Energy: %d%n", cell.getHealth(), ((WhiteBloodCell) cell).getSize(), cell.getEnergy()));
                }else if (cell instanceof RedBloodCell) {
                    additional = ((RedBloodCell)cell).getVelocity();
                    sb.append(String.format("--------Health: %d | Velocity: %d | Energy: %d%n", cell.getHealth(), ((RedBloodCell) cell).getVelocity(), cell.getEnergy()));
                }else {
                    additional = ((Microbe)cell).getVirulence();
                    sb.append(String.format("--------Health: %d | Virulence: %d | Energy: %d%n", cell.getHealth(), ((Microbe) cell).getVirulence(), cell.getEnergy()));
                }
            }
        }
        return sb.toString().trim();

    }
}
