package root.commands;

import root.organism.Organism;
import root.repository.Repository;

public class CreateOrganism {
    private Repository repository;

    public CreateOrganism(Repository repository) {
        this.repository = repository;
    }

    public String create(String name) {
        Organism organism = new Organism(name);
        try {
            this.repository.save(organism);
            return String.format("Created organism %s", organism.getName());
        }catch (IllegalArgumentException ex) {
            return String.format("Organism %s already exists", organism.getName());
        }
    }
}