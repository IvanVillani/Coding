package commands;

import database.BoatSimulatorDatabase;
import exeptions.DuplicateModelException;
import exeptions.NonExistantModelException;
import models.boat.BaseBoat;
import models.boat.Yacht;
import models.engine.BaseEngine;

public class CreateYachtCommand {
    private BoatSimulatorDatabase database;

    public CreateYachtCommand(BoatSimulatorDatabase database) {
        this.database = database;
    }


    public String execute(String model, int weight, String engineModel, int cargoWeight) throws DuplicateModelException, NonExistantModelException {
        BaseEngine engine = this.database.getEngines().getItem(engineModel);
        BaseBoat boat = new Yacht(model, weight, engine, cargoWeight);
        this.database.getBoats().add(boat);
        return String.format("Yacht with model %s registered successfully.", model);
    }
}
