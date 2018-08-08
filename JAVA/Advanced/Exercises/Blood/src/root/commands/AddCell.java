package root.commands;

import root.cell.Cell;
import root.cell.blood_cells.RedBloodCell;
import root.cell.blood_cells.WhiteBloodCell;
import root.cell.microbes.Bacteria;
import root.cell.microbes.Fungi;
import root.cell.microbes.Virus;
import root.cluster.Cluster;
import root.organism.Organism;
import root.repository.Repository;

public class AddCell {
    private Repository repository;

    public AddCell(Repository repository) {
        this.repository = repository;
    }

    public String add(String organismName, String clusterId, String cellType, String cellId, int health, int positionRow, int positionCol, int additionalProperty) {
        Cell cell = null;
        switch (cellType) {
            case "Bacteria":
                cell = new Bacteria(cellId, health, positionRow, positionCol, additionalProperty);
                break;
            case "Fungi":
                cell = new Fungi(cellId, health, positionRow, positionCol, additionalProperty);
                break;
            case "Virus":
                cell = new Virus(cellId, health, positionRow, positionCol, additionalProperty);
                break;
            case "RedBloodCell":
                cell = new RedBloodCell(cellId, health, positionRow, positionCol, additionalProperty);
                break;
            case "WhiteBloodCell":
                cell = new WhiteBloodCell(cellId, health, positionRow, positionCol, additionalProperty);
                break;
            default:
                break;
        }

        if (this.repository.getOrganisms().containsKey(organismName)) {
            Organism organism = this.repository.getOrganisms().get(organismName);
            Cluster cluster = null;
            for (Cluster clusterr : organism.getClusters()) {
                if (clusterId.equals(clusterr.getId())) {
                    cluster = clusterr;
                    break;
                }
            }
            if (cluster != null && cell != null) {
                if (positionRow >= 0 && positionRow <= cluster.getRows()-1 && positionCol >= 0 && positionCol <= cluster.getCols()-1) {
                    for (Cell cell1 : cluster.getCells()) {
                        if (cell.getPositionRow() == cell1.getPositionRow() && cell.getPositionCol() == cell1.getPositionCol()) {
                            return null;
                        }
                    }
                    cluster.getCells().add(cell);
                    return String.format("Organism %s: Created cell %s in cluster %s", organismName, cellId, clusterId);
                }else {
                    return null;
                }
            }else {
                return null;
            }

        }else {
            return null;
        }
    }
}
