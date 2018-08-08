package root.commands;

import root.organism.Organism;
import root.repository.Repository;

public class CheckCondition {
    private Repository repository;

    public CheckCondition(Repository repository) {
        this.repository = repository;
    }

    public String check(String organismName) {
        if (this.repository.getOrganisms().containsKey(organismName)) {
            Organism organism = this.repository.getOrganisms().get(organismName);
            return organism.toString();
        }else {
            return null;
        }
    }


}


