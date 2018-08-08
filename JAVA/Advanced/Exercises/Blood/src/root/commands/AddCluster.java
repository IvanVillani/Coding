package root.commands;

import root.cluster.Cluster;
import root.organism.Organism;
import root.repository.Repository;

public class AddCluster {
    private Repository repository;

    public AddCluster(Repository repository) {
        this.repository = repository;
    }

    public String add(String organismName, String id, int rows, int cols) {
        if (this.repository.getOrganisms().containsKey(organismName)) {
            Organism organism = this.repository.getOrganisms().get(organismName);
            Cluster cluster = new Cluster(id, rows, cols);
            for (Cluster clusterr : organism.getClusters()) {
                if (clusterr.getId().equals(cluster.getId())) {
                    return null;
                }
            }
            organism.getClusters().add(cluster);
            return String.format("Organism %s: Created cluster %s", organism.getName(), cluster.getId());
        }else {
            return null;
        }
    }
}