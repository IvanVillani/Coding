package database;

import interfaces.Modelable;
import interfaces.Repository;
import models.boat.BaseBoat;
import models.engine.BaseEngine;

public class BoatSimulatorDatabase {
    private Repository<BaseBoat> boats;
    private Repository<BaseEngine> engines;

    @SuppressWarnings("unchecked")
    public BoatSimulatorDatabase()
    {
        this.boats = new RepositoryImpl();
        this.engines = new RepositoryImpl();
    }

    public Repository<BaseBoat> getBoats() {
        return this.boats;
    }

    public Repository<BaseEngine> getEngines() {
        return this.engines;
    }
}
