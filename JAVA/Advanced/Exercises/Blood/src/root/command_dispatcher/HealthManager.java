package root.command_dispatcher;

import root.commands.*;
import root.repository.Repository;

public class HealthManager {
    private Repository repository;

    public HealthManager(Repository repository) {
        this.repository = repository;
    }

    public String accept(String[] array) {
        switch (array[0]) {
            case "checkCondition":
                CheckCondition checkCondition = new CheckCondition(this.repository);
                return checkCondition.check(array[1]);
            case "createOrganism":
                CreateOrganism createOrganism = new CreateOrganism(this.repository);
                return createOrganism.create(array[1]);
            case "addCluster":
                AddCluster addCluster = new AddCluster(this.repository);
                String name = array[1];
                String id = array[2];
                int rows = Integer.parseInt(array[3]);
                int cols = Integer.parseInt(array[4]);
                return addCluster.add(name, id, rows, cols);
            case "addCell":
                AddCell addCell = new AddCell(this.repository);
                String name1 = array[1];
                String clusterId = array[2];
                String cellType = array[3];
                String cellId = array[4];
                int health = Integer.parseInt(array[5]);
                int row = Integer.parseInt(array[6]);
                int col = Integer.parseInt(array[7]);
                int additional = Integer.parseInt(array[8]);
                return addCell.add(name1, clusterId, cellType, cellId, health, row, col, additional);
            case "activateCluster":
                ActivateCluster activateCluster = new ActivateCluster(this.repository);
                return activateCluster.activate(array[1]);
            default:
                return null;
        }
    }
}
