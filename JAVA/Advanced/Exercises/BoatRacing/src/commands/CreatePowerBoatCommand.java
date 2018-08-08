package commands;

import database.BoatSimulatorDatabase;
import exeptions.DuplicateModelException;
import exeptions.NonExistantModelException;
import models.boat.BaseBoat;
import models.boat.PowerBoat;
import models.engine.BaseEngine;

public class CreatePowerBoatCommand {
    private BoatSimulatorDatabase database;

    public CreatePowerBoatCommand(BoatSimulatorDatabase database) {
        this.database = database;
    }


    public String execute(String model, int weight, String firstEngineModel, String secondEngineModel) throws DuplicateModelException, NonExistantModelException {
        BaseEngine firstEngine = this.database.getEngines().getItem(firstEngineModel);
        BaseEngine secondEngine = this.database.getEngines().getItem(secondEngineModel);
        BaseBoat boat = new PowerBoat(model, weight, firstEngine, secondEngine);
        this.database.getBoats().add(boat);
        return String.format("Power boat with model %s registered successfully.", model);
    }
}
