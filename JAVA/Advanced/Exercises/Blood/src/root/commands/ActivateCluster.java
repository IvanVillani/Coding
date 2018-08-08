package root.commands;

import root.cell.Cell;
import root.cell.blood_cells.BloodCell;
import root.cell.blood_cells.RedBloodCell;
import root.cell.blood_cells.WhiteBloodCell;
import root.cell.microbes.Bacteria;
import root.cell.microbes.Fungi;
import root.cell.microbes.Microbe;
import root.cell.microbes.Virus;
import root.cluster.Cluster;
import root.organism.Organism;
import root.repository.Repository;

import java.util.ArrayDeque;
import java.util.List;
import java.util.stream.Collectors;

public class ActivateCluster{
    private Repository repository;

    public ActivateCluster(Repository repository) {
        this.repository = repository;
    }

    public String activate(String organismName) {
        if (this.repository.getOrganisms().containsKey(organismName)) {
            Organism organism = this.repository.getOrganisms().get(organismName);
            ArrayDeque<Cluster> queue = organism.getClusters();
            if (queue.size() == 0) {
                return null;
            }
            Cluster cluster = queue.remove();
            List<Cell> cells = cluster.getCells().stream()
                    .sorted((cell1, cell2) -> {
                        if (cell1.getPositionRow() != cell2.getPositionRow()) {
                            return Integer.compare(cell1.getPositionRow(), cell2.getPositionRow());

                        }else {
                            return Integer.compare(cell1.getPositionCol(), cell2.getPositionCol());

                        }
                    })
                    .collect(Collectors.toList());
            if (cells.size() == 0) {
                return null;
            }

            Cell current = null;
            Cell newone = null;

            int row = 0;
            int col = 0;

            for (int i = 0; i < cells.size() - 1; i++) {
                if (i == 0) {
                    current = cells.get(i);
                    row = current.getPositionRow();
                    col = current.getPositionCol();
                }else {
                    newone = cells.get(i);
                    if (current instanceof BloodCell) {
                        current.setHealth(current.getHealth() + newone.getHealth());
                        current.setPositionRow(newone.getPositionRow());
                        current.setPositionCol(newone.getPositionCol());
                        if (current instanceof RedBloodCell) {
                            ((RedBloodCell)current).updateEnergy();
                        }else {
                            ((WhiteBloodCell)current).updateEnergy();
                        }
                        cells.remove(newone);
                        i--;
                    }else {
                        for(;;) {
                            int damagecurr = current.getEnergy();
                            int damagednew = newone.getHealth() - damagecurr;
                            if (damagednew > 0) {
                                newone.setHealth(damagednew);
                                if (newone instanceof BloodCell) {
                                    if (newone instanceof RedBloodCell) {
                                        ((RedBloodCell)newone).updateEnergy();
                                    }else {
                                        ((WhiteBloodCell)newone).updateEnergy();
                                    }
                                }else if (newone instanceof Microbe) {
                                    if (newone instanceof Fungi) {
                                        ((Fungi)newone).updateEnergy();
                                    }else if (newone instanceof Virus){
                                        ((Virus)newone).updateEnergy();
                                    }else {
                                        ((Bacteria)newone).updateEnergy();
                                    }
                                }
                            }else {
                                current.setPositionRow(newone.getPositionRow());
                                current.setPositionCol(newone.getPositionCol());
                                cells.remove(newone);
                                i--;
                                break;
                            }

                            int damagenew = newone.getEnergy();
                            int damagedcurr = current.getHealth() - damagenew;

                            if (damagedcurr > 0) {
                                current.setHealth(damagedcurr);
                                if (current instanceof Fungi) {
                                    ((Fungi)current).updateEnergy();
                                }else if (current instanceof Virus){
                                    ((Virus)current).updateEnergy();
                                }else {
                                    ((Bacteria)current).updateEnergy();
                                }
                            }else {
                                cells.remove(current);
                                current = newone;
                                i--;
                                break;

                            }
                        }
                    }
                }
            }
            cluster.setCells(cells);
            queue.add(cluster);
            organism.setClusters(queue);
            return String.format("Organism %s: Activated cluster %s. Cells left: %s", organismName, cluster.getId(), cells.size());
        }else {
            return null;
        }
    }
}
