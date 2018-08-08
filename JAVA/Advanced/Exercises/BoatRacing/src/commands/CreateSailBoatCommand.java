package commands;

import database.BoatSimulatorDatabase;
import exeptions.DuplicateModelException;
import models.boat.BaseBoat;
import models.boat.SailBoat;

public class CreateSailBoatCommand {
    private BoatSimulatorDatabase database;

    public CreateSailBoatCommand(BoatSimulatorDatabase database) {
        this.database = database;
    }


    public String execute(String model, int weight, int sailEfficiency) throws DuplicateModelException {
        BaseBoat boat = new SailBoat(model, weight, sailEfficiency);
        this.database.getBoats().add(boat);
        return String.format("Sail boat with model %s registered successfully.", model);
    }
}
