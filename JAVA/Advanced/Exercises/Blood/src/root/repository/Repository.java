package root.repository;

import root.organism.Organism;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repository {
    private Map<String, Organism> organisms;

    public Repository(){
        this.organisms = new LinkedHashMap<>();
    }

    public Map<String, Organism> getOrganisms() {
        return organisms;
    }

    public void save(Organism organism) {
        if (organisms.containsKey(organism.getName())) {
            throw new IllegalArgumentException("gogo");
        }else {
            this.organisms.put(organism.getName(), organism);
        }
    }
}
